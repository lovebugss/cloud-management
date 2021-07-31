package com.itrjp.cloud.converter;

import com.itrjp.cloud.core.enums.CloudType;
import org.springframework.core.convert.converter.Converter;

/**
 * 自定义枚举转换器.
 * 主要用来转换云类型
 *
 * @author : renjp
 * @date : 2021-07-29 23:42
 **/
public class CloudTypeEnumConverter implements Converter<String, CloudType> {
    @Override
    public CloudType convert(String s) {
        return CloudType.valueOf(s.toUpperCase());
    }
}
