package com.itrjp.cloud.service.ali.oss;

import com.itrjp.cloud.core.service.ObjectStorageService;
import com.itrjp.cloud.service.ali.AliCloud;
import org.springframework.stereotype.Service;

/**
 * 阿里云 对象存储
 *
 * @author : renjp
 * @date : 2021-07-31 18:27
 **/
@Service
public class OssServiceImpl extends AliCloud implements ObjectStorageService {
    @Override
    public void createBucket() {
        System.out.println("ali create bucket");
    }
}
