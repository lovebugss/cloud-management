package com.itrjp.cloud.service.amazon;

import com.itrjp.cloud.core.enums.CloudType;
import com.itrjp.cloud.core.service.CloudService;

/**
 * 亚马逊云
 *
 * @author : renjp
 * @date : 2021-07-31 18:35
 **/
public abstract class AmazonCloud implements CloudService {
    @Override
    public CloudType getCloudType() {
        return CloudType.AWS;
    }


}
