package com.tamako.feign.client.impl;

import com.tamako.feign.client.TestFeignClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试feign实现
 *
 * @author zhangtuo
 * @datetime 2023/6/8 15:13
 * @corporation 骎策科技（杭州）
 **/
@RestController
public class TestFeignClientImpl implements TestFeignClient {

    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

}
