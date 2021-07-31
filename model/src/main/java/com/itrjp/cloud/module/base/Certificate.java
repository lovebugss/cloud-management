package com.itrjp.cloud.model.base;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.itrjp.cloud.model.base.ali.AliCertificate;
import com.itrjp.cloud.model.base.amazon.AmazonCertificate;
import lombok.Data;

/**
 * 证书参数 基类, 不同的云厂商有细微差异
 *
 * @author renjp
 */

@JsonSubTypes({
        @JsonSubTypes.Type(value = AmazonCertificate.class, name = "aws"),
        @JsonSubTypes.Type(value = AliCertificate.class, name = "ali"),
})
@Data
public abstract class Certificate {
    private String accessKeyId;
    private String accessKeySecret;
}
