package com.bytter.scf.front.sys.service.impl;

import com.bytter.scf.core.base.impl.BaseService;
import com.bytter.scf.core.utils.BeanUtils;
import com.bytter.scf.front.sys.entity.Param;
import com.bytter.scf.front.sys.mapper.ParamMapper;
import com.bytter.scf.front.sys.service.ParamService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 前置系统参数表 服务实现类
 * </p>
 *
 * @author zhoul
 * @since 2018-06-26
 */
@Service
public class ParamServiceImpl extends BaseService<ParamMapper, Param> implements ParamService {

    public void insertOrUpdate(List<Param> paramList) {
        for (Param param : paramList) {
            Param queryParam = new Param();
            queryParam.setName(param.getName());
            queryParam.setType(param.getType());
            Param dbParam = baseMapper.selectOne(queryParam);
            if (dbParam == null) {
                insert(param);
            } else {
                BeanUtils.copyNotNullProperties(param, dbParam);
                updateAllColumnById(dbParam);
            }
        }
    }

}
