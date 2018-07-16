package com.bytter.scf.front.demo.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.bytter.scf.core.base.BaseController;
import com.bytter.scf.core.exception.BusinessException;
import com.bytter.scf.front.demo.entity.Demo;
import com.bytter.scf.front.demo.service.DemoService;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

/**
 * demo业务的API接口
 */
@RestController
@RequestMapping("/api/demo")
public class DemoRestController extends BaseController {

    @Resource
    private DemoService demoService;

    @GetMapping("/currentUser")
    @ResponseBody
    public Object currentUser(Principal principal){
        return principal;
    }


    @GetMapping
    public Page<Demo> query(Demo demo, @PageableDefault Page<Demo> pageable) {
        EntityWrapper<Demo> entityWrapper = new EntityWrapper<>(demo);
        Page<Demo> demoPage = demoService.selectPage(pageable, entityWrapper);
        logger.debug("result:{}", demoPage);
        return demoPage;
    }

    /**
     * 根据32位ID查询资源
     *
     * @param id 查询ID
     * @return Demo对象
     */
    @GetMapping("/{id:[0-9a-z]{32}}")
    public Object get(@PathVariable String id) {
        Demo demo = demoService.selectById(id);
        logger.debug("result:{}", demo);
        return demo;
    }

    /**
     * 新增资源
     *
     * @param demo
     */
    @PostMapping
    public Demo insert(@Valid @RequestBody Demo demo) {
        boolean result = demoService.insert(demo);
        logger.debug("result:{},insert:{}", result, demo);
        return demo;
    }

    /**
     * 修改资源
     *
     * @param demo
     * @return
     */
    @PutMapping
    public Demo update(@RequestBody Demo demo) {
        boolean result = demoService.updateById(demo);
        logger.debug("result:{},update:{}", result, demo);
        return demo;
    }

    /**
     * 根据32位ID删除资源
     *
     * @param id demoID
     */
    @DeleteMapping("/{id:[0-9a-z]{32}}")
    public void delete(@PathVariable String id) {
        boolean result = demoService.deleteById(id);
        logger.debug("delete by id:{},result:{}", id, result);
    }

    /**
     * 批量删除
     *
     * @param ids 需要删除的ID集合
     */
    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<String> ids) {
        boolean result = demoService.deleteBatchIds(ids);
        logger.debug("delete by id:{},result:{}", ids, result);
    }


}
