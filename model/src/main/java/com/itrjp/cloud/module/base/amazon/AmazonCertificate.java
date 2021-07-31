package com.itrjp.cloud.model.base.amazon;

import com.itrjp.cloud.model.base.Certificate;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : renjp
 * @date : 2021-07-31 18:07
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class AmazonCertificate extends Certificate {
    private String region;
}
