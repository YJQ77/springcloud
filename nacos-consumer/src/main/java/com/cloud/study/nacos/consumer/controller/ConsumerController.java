package com.cloud.study.nacos.consumer.controller;

import com.alibaba.csp.sentinel.EntryType;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.cloud.study.nacos.consumer.config.SentinelExceptionHandler;
import com.cloud.study.nacos.consumer.fegin.ProducerFegin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 描述：
 *
 * @author yinjiaqi
 * @date 2021/4/6 20:39
 */
@Api(value = "ConsumerController", tags = "远程调用测试")
@RefreshScope
@RestController
@RequestMapping(value = "/hello")
public class ConsumerController {

    @Resource
    private ProducerFegin producerFegin;

    @Autowired
    private RestTemplate restTemplate;

    @SentinelResource(value = "producerFegin",entryType = EntryType.OUT,blockHandlerClass = SentinelExceptionHandler.class,blockHandler = "blockExceptionHandle")
    @ApiOperation(value = "fegin调用测试")
    @GetMapping(value = "/fegin")
    public String producerFegin(){
        String s = producerFegin.helloWord();
        //ResponseEntity<String> response = restTemplate.getForEntity("http://producer/hello/helloword",String.class);
        //String s = response.getBody();
        return s;
    }

}
