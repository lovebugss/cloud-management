package com.itrjp.cloud.service.amazon.s3;

import com.itrjp.cloud.core.service.ObjectStorageService;
import com.itrjp.cloud.service.amazon.AmazonCloud;
import org.springframework.stereotype.Service;

/**
 * s3
 *
 * @author : renjp
 * @date : 2021-07-31 17:49
 **/
@Service
public class S3ServiceImpl extends AmazonCloud implements ObjectStorageService {
    @Override
    public void createBucket() {
        System.out.println("amazon create bucket");
    }
}
