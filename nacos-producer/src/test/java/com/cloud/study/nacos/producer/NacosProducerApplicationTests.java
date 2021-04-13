package com.cloud.study.nacos.producer;

import com.cloud.study.nacos.producer.dao.AreasMapper;
import com.cloud.study.nacos.producer.entity.AreasEntity;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NacosProducerApplicationTests {
    @Autowired
    private AreasMapper areasMapper;

    @Test
    void contextLoads() {
    }
    @Test
    void testAreas(){
        List<AreasEntity> list = areasMapper.selectAll();
        list.forEach(System.out::println);
    }

}
