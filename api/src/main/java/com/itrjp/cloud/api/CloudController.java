package com.itrjp.cloud.api;

import com.itrjp.cloud.core.enums.CloudType;
import com.itrjp.cloud.core.exception.InvalidCloudTypeException;
import com.itrjp.cloud.core.service.CloudService;
import org.springframework.beans.factory.ObjectProvider;

/**
 * 定义抽象Controller
 *
 * @author : renjp
 * @date : 2021-07-31 17:36
 **/
public abstract class CloudController<T extends CloudService> {
    /**
     * 根据云类型获取云实现
     *
     * @param cloudType 云类型
     * @return
     */
    public T getServiceByCloudType(CloudType cloudType) {

        return getServices().stream()
                .filter((service) -> service.isMatch(cloudType))
                .findFirst()
                .orElseThrow(InvalidCloudTypeException::new);
    }

    abstract ObjectProvider<T> getServices();
}
