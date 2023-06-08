package com.tamako.feign.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 测试feign接口
 *
 * @author zhangtuo
 * @datetime 2023/6/8 15:10
 **/
public interface TestFeignClient {

    /**
     * 加法器
     *
     * @param a a
     * @param b b
     * @return 和
     */
    @GetMapping("/feign/test/add")
    Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

}
