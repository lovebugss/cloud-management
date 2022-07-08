package com.itrjp.cloud.service.huawei.ecs;

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.ecs.v2.EcsClient;
import com.huaweicloud.sdk.ecs.v2.model.BatchStartServersRequest;
import com.itrjp.cloud.core.service.VirtualMachineService;
import com.itrjp.cloud.model.base.Certificate;
import com.itrjp.cloud.model.base.huawei.HuaweiCertificate;
import com.itrjp.cloud.model.param.vm.VirtualMachineParam;
import com.itrjp.cloud.model.vo.vm.VirtualMachineVO;
import com.itrjp.cloud.service.huawei.HuaweiCloud;
import com.itrjp.cloud.service.huawei.client.HuaweiClient;

/**
 * 华为云 ecs 实现
 *
 * @author : renjp
 * @date : 2021-08-04 22:59
 **/
public class HuaweiEcsServiceImpl extends HuaweiCloud implements VirtualMachineService, HuaweiClient<EcsClient> {
    @Override
    public VirtualMachineVO start(VirtualMachineParam param) {
        Certificate certificate = param.getCertificate();
        EcsClient client = createClient(certificate);
        BatchStartServersRequest startServersRequest = new BatchStartServersRequest();
        client.batchStartServers(startServersRequest);

        return null;
    }

    @Override
    public EcsClient createClient(Certificate certificate) {
        HttpConfig config = HttpConfig.getDefaultHttpConfig();
        config.withTimeout(60);


        HuaweiCertificate huaweiCertificate = (HuaweiCertificate) certificate;
        BasicCredentials basicCredentials = new BasicCredentials()
                .withAk(certificate.getAccessKeyId())
                .withSk(certificate.getAccessKeySecret())
                .withProjectId(huaweiCertificate.getProjectId());

        return EcsClient.newBuilder()
                .withHttpConfig(config)
                .withCredential(basicCredentials)
                .withEndpoint(huaweiCertificate.getEndpoint())
                .build();
    }

}
