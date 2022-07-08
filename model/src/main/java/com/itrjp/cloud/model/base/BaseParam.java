package com.itrjp.cloud.model.base;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.itrjp.cloud.model.base.amazon.AmazonCertificate;
import lombok.Data;

/**
 * 所有参数的基类
 *
 * @author : renjp
 * @date : 2021-07-29 23:05
 **/
@Data
public class BaseParam {
    /**
     * 证书
     */
    @JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM, property = "type", include = JsonTypeInfo.As.PROPERTY)
    @JsonTypeIdResolver(value = CertificateResolver.class)
    public Certificate certificate;
//    private String accessKeyId;
//    private String accessKeySecret;


}
