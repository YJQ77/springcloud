package com.cloud.study.nacos.producer.entity;

import lombok.Data;

/**
 * 描述：
 *
 * @author yinjiaqi
 * @date 2021/4/13 9:32
 */
@Data
public class CitiesEntity {
    private Long id;
    private String cityId;
    private String city;
    private String provincId;
}
