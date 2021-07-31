package com.itrjp.cloud.config;

import com.itrjp.cloud.converter.CloudTypeEnumConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : renjp
 * @date : 2021-07-31 17:22
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new CloudTypeEnumConverter());
    }
}
