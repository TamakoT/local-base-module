package com.tamako.feign.config;

import com.tamako.feign.client.TestFeignClient;
import com.tamako.feign.client.impl.TestFeignClientImpl;
import org.springframework.context.annotation.Bean;
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

    @Bean("testFeignClient")
    public TestFeignClient testFeignClient() {
        return new TestFeignClientImpl();
    }

}
