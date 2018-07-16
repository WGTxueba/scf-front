package com.bytter.scf.front.sys.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;

import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import com.bytter.scf.front.sys.service.CorpService;
import com.bytter.scf.front.sys.entity.Corp;

import com.bytter.scf.core.base.BaseController;

/**
 * <p>
 * 前置单位表 前端接口控制器
 * </p>
 *
 * @author zhoul
 * @since 2018-06-26
 */
@RestController
@RequestMapping("/api/sys/corp")
public class CorpRestController extends BaseController {

    @Resource
    private CorpService corpService;

    @GetMapping
    public Page<Corp> query(Corp corp, @PageableDefault Page<Corp> page) {
        EntityWrapper<Corp> entityWrapper = new EntityWrapper<>(corp);
        Page<Corp> corpPage = corpService.selectPage(page, entityWrapper);
        logger.debug("result:{}", corpPage);
        return corpPage;
    }

    /**
     * 根据32位ID查询资源
     *
     * @param id 查询ID
     * @return
     */
    @GetMapping("/{id:[0-9a-z]{32}}")
    public Corp get(@PathVariable String id) {
        Corp corp = corpService.selectById(id);
        logger.debug("result:{}", corp);
        return corp;
    }

    /**
     * 新增资源
     *
     * @param corp
     */
    @PostMapping
    public Corp insert(@RequestBody Corp corp) {
        boolean result = corpService.insert(corp);
        logger.debug("result:{},insert:{}", result, corp);
        return corp;
    }

    /**
     * 修改资源
     *
     * @param corp
     * @return
     */
    @PutMapping
    public Corp update(@RequestBody Corp corp) {
        boolean result = corpService.updateById(corp);
        logger.debug("result:{},update:{}", result, corp);
        return corp;
    }

    /**
     * 根据32位ID删除资源
     *
     * @param id corpID
     */
    @DeleteMapping("/{id:[0-9a-z]{32}}")
    public void delete(@PathVariable String id) {
        boolean result = corpService.deleteById(id);
        logger.debug("result:{},delete by id:{}", result, id);
    }

    /**
     * 批量删除
     *
     * @param ids 需要删除的ID集合
     */
    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<String> ids) {
        boolean result = corpService.deleteBatchIds(ids);
        logger.debug("delete by id:{},result:{}", ids, result);
    }
}
