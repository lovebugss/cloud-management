package com.itrjp.cloud.api;

import com.itrjp.cloud.core.enums.CloudType;
import com.itrjp.cloud.core.result.Result;
import com.itrjp.cloud.core.service.VirtualMachineService;
import com.itrjp.cloud.model.param.vm.VirtualMachineParam;
import com.itrjp.cloud.model.vo.vm.VirtualMachineVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 虚拟机Controller
 *
 * @author : renjp
 * @date : 2021-07-31 17:18
 **/
@RestController
@RequestMapping("{cloudType}/vm")
@Api(tags = "虚拟机管理")
@AllArgsConstructor
public class VirtualMachineController extends CloudController<VirtualMachineService> {
    private final ObjectProvider<VirtualMachineService> virtualMachineServices;


    /**
     * 启动服务器
     *
     * @param cloudType 云类型
     * @param param     请求参数 {@link VirtualMachineParam}
     * @return {@link VirtualMachineVO}
     */
    @PostMapping("start")
    @ApiOperation("启动虚拟机")
    public Result<VirtualMachineVO> start(@PathVariable("cloudType") CloudType cloudType,
                                          @RequestBody VirtualMachineParam param) {
        VirtualMachineService virtualMachineService = getServiceByCloudType(cloudType);
        return Result.success(virtualMachineService.start(param));
    }

    @Override
    ObjectProvider<VirtualMachineService> getServices() {
        return virtualMachineServices;
    }
}
