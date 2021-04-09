package com.cloud.study.nacos.consumer.config;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * 描述：
 *
 * @author yinjiaqi
 * @date 2021/4/9 10:11
 */
public class SentinelExceptionHandler {
    public static String blockExceptionHandle(Integer id, BlockException exception) {
        exception.printStackTrace();
        return "sentinel限流处理";
    }
}
