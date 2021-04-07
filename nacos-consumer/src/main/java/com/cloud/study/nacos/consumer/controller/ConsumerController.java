package com.cloud.study.nacos.consumer.controller;

import com.cloud.study.nacos.consumer.fegin.ProducerFegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author yinjiaqi
 * @date 2021/4/6 20:39
 */
@RestController
@RequestMapping(value = "/hello")
public class ConsumerController {

    @Autowired
    private ProducerFegin producerFegin;

    @RequestMapping(value = "/fegin")
    public String producerFegin(){
        String s = producerFegin.helloWord();
        return s;
    }

}
