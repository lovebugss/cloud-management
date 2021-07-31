package com.itrjp.cloud.core.service;

/**
 * 对象存储
 *
 * @author renjp
 */
public interface ObjectStorageService extends CloudService {

    /**
     * 创建存储桶
     */
    void createBucket();
}
