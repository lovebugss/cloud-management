package com.itrjp.cloud.model.base.huawei;

import com.itrjp.cloud.model.base.Certificate;
import lombok.Data;

/**
 * @author : renjp
 * @date : 2021-08-04 23:10
 **/
@Data
public class HuaweiCertificate extends Certificate {
    private String projectId;
    private String endpoint;
}
