package com.bytter.scf.front.demo.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;

import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import com.bytter.scf.front.demo.service.Demo2Service;
import com.bytter.scf.front.demo.entity.Demo2;

import com.bytter.scf.core.base.BaseController;

/**
 * <p>
 *  前端接口控制器
 * </p>
 *
 * @author chenlj
 * @since 2018-07-09
 */
@RestController
@RequestMapping("/api/demo/demo2")
public class Demo2RestController extends BaseController {

    @Resource
    private Demo2Service demo2Service;

    @GetMapping
    public Page<Demo2> query(Demo2 demo2, @PageableDefault Page<Demo2> page) {
        EntityWrapper<Demo2> entityWrapper = new EntityWrapper<>(demo2);
        Page<Demo2> demo2Page = demo2Service.selectPage(page, entityWrapper);
        logger.debug("result:{}", demo2Page);
        return demo2Page;
    }

    /**
     * 根据32位ID查询资源
     *
     * @param id 查询ID
     * @return
     */
    @GetMapping("/{id:[0-9a-z]{32}}")
    public Demo2 get(@PathVariable String id) {
        Demo2 demo2 = demo2Service.selectById(id);
        logger.debug("result:{}", demo2);
        return demo2;
    }

    /**
     * 新增资源
     *
     * @param demo2
     */
    @PostMapping
    public Demo2 insert(@RequestBody Demo2 demo2) {
        boolean result = demo2Service.insert(demo2);
        logger.debug("result:{},insert:{}", result, demo2);
        return demo2;
    }

    /**
     * 修改资源
     *
     * @param demo2
     * @return
     */
    @PutMapping
    public Demo2 update(@RequestBody Demo2 demo2) {
        boolean result = demo2Service.updateById(demo2);
        logger.debug("result:{},update:{}", result, demo2);
        return demo2;
    }

    /**
     * 根据32位ID删除资源
     *
     * @param id demo2ID
     */
    @DeleteMapping("/{id:[0-9a-z]{32}}")
    public void delete(@PathVariable String id) {
        boolean result = demo2Service.deleteById(id);
        logger.debug("result:{},delete by id:{}", result, id);
    }

    /**
     * 批量删除
     *
     * @param ids 需要删除的ID集合
     */
    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<String> ids) {
        boolean result = demo2Service.deleteBatchIds(ids);
        logger.debug("delete by id:{},result:{}", ids, result);
    }
}
