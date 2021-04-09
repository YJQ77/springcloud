package com.cloud.study.nacos.consumer.fegin;

import com.cloud.study.nacos.consumer.fegin.ProducerFegin.BalanceFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 描述：
 *
 * @author yinjiaqi
 * @date 2021/4/6 20:36
 */
@FeignClient(value = "producer",fallback = BalanceFeignServiceFallback.class)
public interface ProducerFegin {

    @GetMapping(value = "/hello/helloword")
    String helloWord();

    //请求不到,则转入降级
    @Component
    class BalanceFeignServiceFallback implements ProducerFegin {

        @Override
        public String helloWord() {
            return "服务降级,该服务已下线";
        }
    }
}
