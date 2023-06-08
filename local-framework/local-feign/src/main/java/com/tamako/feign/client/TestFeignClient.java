package com.tamako.feign.client;

import feign.Param;
import feign.RequestLine;

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
    @RequestLine("GET /feign/test/add")
    Integer add(@Param("a") Integer a, @Param("b") Integer b);

}
