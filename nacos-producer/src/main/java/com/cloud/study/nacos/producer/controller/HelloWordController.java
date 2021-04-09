package com.cloud.study.nacos.producer.controller;
import com.cloud.study.nacos.producer.config.TestConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author yinjiaqi
 * @date 2021/4/6 20:32
 */
@Api(value = "HelloWordController", tags = "测试helloword")
@RestController
@RequestMapping(value = "/hello")
public class HelloWordController {
    private static Logger logger = LoggerFactory.getLogger(HelloWordController.class);

    @Value("${server.port:}")
    private String port;
    @Autowired
    private TestConfig testConfig;

    @ApiOperation(value = "测试")
    @GetMapping(value = "/helloword")
    public String HelloWord(){
        logger.info("iiiiiiiiiii");
        logger.info(testConfig.getName());
        return "Hello:"+port;
    }

}
