package com.itrjp.cloud.core.service;

import com.itrjp.cloud.core.enums.CloudType;

/**
 * 云service
 *
 * @author : renjp
 * @date : 2021-07-31 18:32
 **/
public interface CloudService {
    /**
     * 获取云厂商类型
     *
     * @return
     */
    CloudType getCloudType();


    /**
     * 是否匹配云类型
     *
     * @param cloudType
     * @return
     */
    default boolean isMatch(CloudType cloudType) {
        // 当前云类型
        CloudType currCloudType = getCloudType();
        return cloudType.equals(currCloudType);
    }
}
