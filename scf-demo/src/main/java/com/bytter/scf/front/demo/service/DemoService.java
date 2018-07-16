package com.bytter.scf.front.demo.service;

import com.bytter.scf.core.base.IBaseService;
import com.bytter.scf.front.demo.entity.Demo;

import java.util.List;

/**
 * User 表数据服务层接口
 */
public interface DemoService extends IBaseService<Demo> {

    Integer abcd();

    boolean deleteAll();

    public List<Demo> selectListBySQL();
}
