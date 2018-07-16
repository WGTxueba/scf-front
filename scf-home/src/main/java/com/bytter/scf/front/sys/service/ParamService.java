package com.bytter.scf.front.sys.service;

import com.bytter.scf.front.sys.entity.Param;
import com.bytter.scf.core.base.IBaseService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前置系统参数表 服务类
 * </p>
 *
 * @author zhoul
 * @since 2018-06-26
 */
public interface ParamService extends IBaseService<Param> {


    void insertOrUpdate(List<Param> paramList);
}
