package com.tamako.feign.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * feign自动配置类
 *
 * @author zhangtuo
 * @datetime 2023/6/8 15:53
 * @corporation 骎策科技（杭州）
 **/
@Configuration
@ComponentScan(basePackages = {
        "com.tamako.feign.client"
})
public class FeignAutoConfiguration {
}
