package com.cloud.study.nacos.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 描述：
 *
 * @author yinjiaqi
 * @date 2021/4/8 13:50
 */
@Configuration
public class RestTemplateConfig {

    @LoadBalanced
    @Bean(name = "restTemplate")
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule()
    {
        //return new RoundRobinRule();//该策略实现安装线性轮询的方式依次选择每个服务实例
        return new RandomRule();//该策略实现安随机算法，
        //return new RetryRule();//具备重试机制的实例选择功能morning采用的轮训
    }
}
