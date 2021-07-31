package com.itrjp.cloud.api;

import com.itrjp.cloud.core.enums.CloudType;
import com.itrjp.cloud.core.service.ObjectStorageService;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 对象存储
 *
 * @author : renjp
 * @date : 2021-07-31 17:34
 **/
@RestController
@RequestMapping("{cloudType}/storage")

public class ObjectStorageController extends CloudController<ObjectStorageService> {
    private final ObjectProvider<ObjectStorageService> objectStorageServiceList;

    public ObjectStorageController(ObjectProvider<ObjectStorageService> objectStorageServiceList) {
        this.objectStorageServiceList = objectStorageServiceList;
    }

    /**
     * 创建存储桶
     *
     * @param cloudType 云类型
     * @return
     */
    @PostMapping("create")
    public ResponseEntity<?> createBucket(@PathVariable CloudType cloudType) {
        // 获取对象存储service
        ObjectStorageService objectStorageService = getServiceByCloudType(cloudType, objectStorageServiceList);
        objectStorageService.createBucket();
        return ResponseEntity.ok().build();
    }
}
