package com.cloud.study.nacos.consumer.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
