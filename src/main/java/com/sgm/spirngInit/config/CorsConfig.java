package com.sgm.spirngInit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 全局跨域配置类
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //覆盖所有请求
        registry.addMapping("/**")
                // 允许发送Cookie
                .allowCredentials(true)
                .allowedOriginPatterns("*")
                .allowedMethods("GET", "POST", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .exposedHeaders("*");
    }
}
