package com.itrjp.cloud.service.huawei;

import com.itrjp.cloud.core.enums.CloudType;
import com.itrjp.cloud.core.service.CloudService;

/**
 * 华为云
 *
 * @author : renjp
 * @date : 2021-08-04 22:57
 **/
public abstract class HuaweiCloud implements CloudService {
    @Override
    public CloudType getCloudType() {
        return CloudType.HUAWEI;
    }
}
