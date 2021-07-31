package com.itrjp.cloud.service.amazon.client;

import com.itrjp.cloud.core.client.CloudClient;
import software.amazon.awssdk.core.SdkClient;

/**
 * @author : renjp
 * @date : 2021-07-31 21:45
 **/
public interface AmazonCloudClient extends CloudClient<SdkClient> {
}
