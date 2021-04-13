package com.cloud.study.nacos.producer.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.study.nacos.producer.entity.AreasEntity;
import java.util.List;
import org.apache.ibatis.annotations.Select;

/**
 * 描述：
 *
 * @author yinjiaqi
 * @date 2021/4/13 9:33
 */
public interface AreasMapper extends BaseMapper<AreasEntity> {

    @Select("select * from g_areas")
    List<AreasEntity> selectAll();

}
