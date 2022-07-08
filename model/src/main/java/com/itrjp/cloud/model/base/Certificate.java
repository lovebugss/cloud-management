package com.itrjp.cloud.model.base;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.itrjp.cloud.model.base.ali.AliCertificate;
import com.itrjp.cloud.model.base.amazon.AmazonCertificate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel
public abstract class Certificate {
    @ApiModelProperty("accessKeyId")
    private String accessKeyId;
    @ApiModelProperty("accessKeySecret")
    private String accessKeySecret;
}
