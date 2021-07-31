package com.itrjp.cloud.model.base.ali;

import com.itrjp.cloud.model.base.Certificate;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : renjp
 * @date : 2021-07-31 18:08
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class AliCertificate extends Certificate {
    private String endpoint;
}
