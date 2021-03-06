package com.cloud.study.nacos.producer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@MapperScan( basePackages = {"com.cloud.study.nacos.producer.dao"})
public class NacosProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosProducerApplication.class, args);
    }

}
