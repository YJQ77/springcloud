package com.cloud.study.nacos.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author yinjiaqi
 * @date 2021/4/6 20:32
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloWordController {

    @Value("${server.port:}")
    private String port;

    @GetMapping(value = "/helloword")
    public String HelloWord(){
        return "Hello:"+port;
    }

}
