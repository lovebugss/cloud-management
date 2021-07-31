package com.itrjp.cloud.api;

import com.itrjp.cloud.core.enums.CloudType;
import com.itrjp.cloud.core.result.Result;
import com.itrjp.cloud.core.service.VirtualMachineService;
import com.itrjp.cloud.model.param.vm.VirtualMachineParam;
import com.itrjp.cloud.model.vo.vm.VirtualMachineVO;
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
public class VirtualMachineController extends CloudController<VirtualMachineService> {
    private final ObjectProvider<VirtualMachineService> virtualMachineServices;

    public VirtualMachineController(ObjectProvider<VirtualMachineService> virtualMachineServices) {
        this.virtualMachineServices = virtualMachineServices;
    }

    /**
     * 启动服务器
     *
     * @param cloudType 云类型
     * @param param     请求参数 {@link VirtualMachineParam}
     * @return {@link VirtualMachineVO}
     */
    @PostMapping("start")
    public Result<VirtualMachineVO> start(@PathVariable("cloudType") CloudType cloudType,
                                          @RequestBody VirtualMachineParam param) {
        VirtualMachineService virtualMachineService = getServiceByCloudType(cloudType, virtualMachineServices);
        return Result.success(virtualMachineService.start(param));
    }
}
