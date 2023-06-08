package com.tamako.feign.client;

import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @RequestMapping(value = "/feign/test/add", method = RequestMethod.GET)
    @RequestLine("GET /feign/test/add")
    Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

}
