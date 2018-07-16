package com.bytter.scf.front.demo.service.impl;

import com.bytter.scf.core.base.impl.BaseService;
import com.bytter.scf.front.demo.entity.Demo;
import com.bytter.scf.front.demo.entity.enums.DemoSexEnum;
import com.bytter.scf.front.demo.mapper.DemoMapper;
import com.bytter.scf.front.demo.service.DemoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Demo 表数据服务层接口实现类
 */
@Service
public class DemoServiceImpl extends BaseService<DemoMapper, Demo> implements DemoService {

    @Transactional
    @Override
    public Integer abcd() {
        Demo demo = new Demo();
        demo.setName("zhoul");
        demo.setLoginName("loginName");
        demo.setSex(DemoSexEnum.FEMALE);
        Integer insert = baseMapper.insert(demo);
        if(1==1){
            throw new RuntimeException();
        }
        return insert;
    }

    @Override
    public boolean deleteAll() {
        return retBool(baseMapper.deleteAll());
    }

    @Override
    public List<Demo> selectListBySQL() {
        return baseMapper.selectListBySQL();
    }

}
