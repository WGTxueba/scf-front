package com.bytter.scf.front.sys.mapper;

import com.bytter.scf.front.sys.entity.Param;
import com.bytter.scf.core.base.BaseMapper;

/**
 * <p>
 * 前置系统参数表 Mapper 接口
 * </p>
 *
 * @author zhoul
 * @since 2018-06-26
 */
public interface ParamMapper extends BaseMapper<Param> {


    Param selectOneByTypeAndName(Param param);
}
