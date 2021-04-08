package com.cloud.study.nacos.consumer.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 描述：
 *
 * @author yinjiaqi
 * @date 2021/4/6 20:36
 */
@FeignClient("producer")
public interface ProducerFegin {

    @GetMapping(value = "/hello/helloword")
    String helloWord();
}
