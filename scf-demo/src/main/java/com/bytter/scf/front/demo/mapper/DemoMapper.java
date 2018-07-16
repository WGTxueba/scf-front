package com.bytter.scf.front.demo.mapper;

import com.baomidou.mybatisplus.annotations.SqlParser;
import com.bytter.scf.core.base.BaseMapper;
import com.bytter.scf.front.demo.entity.Demo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * User 表数据库控制层接口
 */
public interface DemoMapper extends BaseMapper<Demo> {

    /**
     * 自定义注入方法
     */
    int deleteAll();

    /**
     * 注解 @SqlParser(filter = true) 过滤多租户解析
     */
    @SqlParser(filter = true)
    @Select("select * from demo")
    List<Demo> selectListBySQL();

}
