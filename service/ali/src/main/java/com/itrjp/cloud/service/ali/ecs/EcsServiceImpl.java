package com.itrjp.cloud.service.ali.ecs;

import com.aliyun.ecs20140526.Client;
import com.aliyun.ecs20140526.models.StartInstanceRequest;
import com.aliyun.ecs20140526.models.StartInstanceResponse;
import com.itrjp.cloud.core.client.CloudClient;
import com.itrjp.cloud.core.enums.CloudType;
import com.itrjp.cloud.core.service.VirtualMachineService;
import com.itrjp.cloud.model.base.Certificate;
import com.itrjp.cloud.model.base.ali.AliCertificate;
import com.itrjp.cloud.model.param.vm.EcsParam;
import com.itrjp.cloud.model.param.vm.VirtualMachineParam;
import com.itrjp.cloud.model.vo.vm.VirtualMachineVO;
import com.itrjp.cloud.service.ali.AliCloud;
import com.itrjp.cloud.service.ali.client.AliCloudClient;
import org.springframework.stereotype.Service;

/**
 * 阿里云 虚拟机服务
 *
 * @author : renjp
 * @date : 2021-07-31 18:26
 **/
@Service
public class EcsServiceImpl extends AliCloud implements VirtualMachineService, AliCloudClient {


    @Override
    public VirtualMachineVO start(VirtualMachineParam param) {
        AliCertificate certificate = (AliCertificate) param.getCertificate();
        EcsParam ecsParam = (EcsParam) param;
        Client client = createClient(certificate);
        System.out.println("ali start ecs, param: " + param);
        StartInstanceRequest startInstanceRequest = new StartInstanceRequest();
        startInstanceRequest.instanceId = ecsParam.getInstId();
        try {
            StartInstanceResponse startInstanceResponse = client.startInstance(startInstanceRequest);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
