package com.itrjp.cloud.core.client;

import com.itrjp.cloud.model.base.Certificate;

/**
 * @author : renjp
 * @date : 2021-07-31 21:18
 **/
public interface CloudClient<T> {

    /**
     * 创建client
     *
     * @param certificate
     * @return
     */
    T createClient(Certificate certificate);
}
