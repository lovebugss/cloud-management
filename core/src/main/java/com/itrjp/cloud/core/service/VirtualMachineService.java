package com.itrjp.cloud.core.service;

import com.itrjp.cloud.model.param.vm.VirtualMachineParam;
import com.itrjp.cloud.model.vo.vm.VirtualMachineVO;

/**
 * 虚拟机 server
 *
 * @author : renjp
 * @date : 2021-07-31 17:39
 **/
public interface VirtualMachineService extends CloudService {
    /**
     * 启动实例
     *
     * @param param
     * @return
     */
    VirtualMachineVO start(VirtualMachineParam param);
}
