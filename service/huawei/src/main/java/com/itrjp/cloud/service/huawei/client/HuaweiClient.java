package com.itrjp.cloud.service.huawei.client;

import com.itrjp.cloud.core.client.CloudClient;

/**
 * 华为客户端
 * 因为华为的客户端是不同的服务有不同的客户端,
 * 如 {@link com.huaweicloud.sdk.ecs.v2.EcsClient}, {@link com.huaweicloud.sdk.vpc.v2.VpcClient}
 * 所以将泛型传递给实现类
 *
 * @author : renjp
 * @date : 2021-08-04 23:00
 **/
public interface HuaweiClient<T> extends CloudClient<T> {

}
