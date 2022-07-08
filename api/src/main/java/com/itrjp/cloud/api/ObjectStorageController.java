package com.itrjp.cloud.api;

import com.itrjp.cloud.core.enums.CloudType;
import com.itrjp.cloud.core.service.ObjectStorageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
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
@Api(tags = "对象存储")
@AllArgsConstructor
public class ObjectStorageController extends CloudController<ObjectStorageService> {
    private final ObjectProvider<ObjectStorageService> objectStorageServiceList;

    /**
     * 创建存储桶
     *
     * @param cloudType 云类型
     * @return
     */
    @PostMapping("create")
    @ApiOperation("创建存储桶")
    public ResponseEntity<?> createBucket(@PathVariable CloudType cloudType) {
        // 获取对象存储service
        ObjectStorageService objectStorageService = getServiceByCloudType(cloudType);
        objectStorageService.createBucket();
        return ResponseEntity.ok().build();
    }

    @Override
    ObjectProvider<ObjectStorageService> getServices() {
        return objectStorageServiceList;
    }
}
