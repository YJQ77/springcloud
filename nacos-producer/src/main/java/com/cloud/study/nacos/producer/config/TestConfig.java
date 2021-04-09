package com.cloud.study.nacos.producer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * 描述：
 *
 * @author yinjiaqi
 * @date 2021/4/8 10:41
 */
@Component
@RefreshScope
public class TestConfig {

    @Value("${cloud.test.name:}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
