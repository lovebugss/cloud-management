package com.itrjp.cloud.service.ali.client;

import com.aliyun.ecs20140526.Client;
import com.aliyun.tea.utils.StringUtils;
import com.aliyun.tearpc.models.Config;
import com.itrjp.cloud.core.client.CloudClient;
import com.itrjp.cloud.model.base.Certificate;
import com.itrjp.cloud.model.base.ali.AliCertificate;

/**
 * @author : renjp
 * @date : 2021-07-31 21:19
 **/
public interface AliCloudClient extends CloudClient<Client> {

    /**
     * 创建client
     *
     * @param certificate
     * @return
     */
    @Override
    default Client createClient(Certificate certificate) {
        AliCertificate aliCertificate = (AliCertificate) certificate;
        Config config = new Config();
        config.accessKeyId = aliCertificate.getAccessKeyId();
        config.accessKeySecret = aliCertificate.getAccessKeySecret();
        String endpoint = aliCertificate.getEndpoint();
        if (StringUtils.isEmpty(endpoint)) {
            config.endpoint = endpoint;
        }
        try {
            return new Client(config);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
