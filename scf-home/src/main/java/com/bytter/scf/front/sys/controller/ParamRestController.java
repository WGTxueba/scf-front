package com.bytter.scf.front.sys.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;

import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

import com.bytter.scf.front.sys.service.ParamService;
import com.bytter.scf.front.sys.entity.Param;

import com.bytter.scf.core.base.BaseController;

/**
 * <p>
 * 前置系统参数表 前端接口控制器
 * </p>
 *
 * @author zhoul
 * @since 2018-06-26
 */
@RestController
@RequestMapping("/api/sys/param")
public class ParamRestController extends BaseController {

    @Resource
    private ParamService paramService;

    /**
     * 根据32位ID查询资源
     *
     * @return
     */
    @GetMapping
    public List<Param> get() {
        List<Param> params = paramService.selectList(new EntityWrapper<>());
        logger.debug("result:{}", params);
        return params;
    }


    /**
     * 修改资源
     *
     * @return
     */
    @PutMapping
    @Valid
    public void insertOrUpdate(@RequestBody List<Param> paramList) {
        logger.debug("============:{}", paramList);
        paramService.insertOrUpdate(paramList);
    }

    /**
     * 根据32位ID删除资源
     *
     * @param id paramID
     */
    @DeleteMapping("/{id:[0-9a-z]{32}}")
    public void delete(@PathVariable String id) {
        boolean result = paramService.deleteById(id);
        logger.debug("result:{},delete by id:{}", result, id);
    }

    /**
     * 批量删除
     *
     * @param ids 需要删除的ID集合
     */
    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<String> ids) {
        boolean result = paramService.deleteBatchIds(ids);
        logger.debug("delete by id:{},result:{}", ids, result);
    }
}
