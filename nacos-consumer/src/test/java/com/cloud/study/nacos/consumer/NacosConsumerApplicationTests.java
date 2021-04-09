package com.cloud.study.nacos.consumer;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class NacosConsumerApplicationTests {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void TestRestTemplate(){
        ResponseEntity<String> response = restTemplate.getForEntity("http://producer/hello/helloword",String.class);
        //String fooResourceUrl = "http://localhost:8089/hello/helloword";
        //ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
        String body = response.getBody();
        System.out.println(body);
    }
}
