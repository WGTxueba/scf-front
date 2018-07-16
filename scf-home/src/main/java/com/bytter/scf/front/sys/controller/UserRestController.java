package com.bytter.scf.front.sys.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;

import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import com.bytter.scf.front.sys.service.UserService;
import com.bytter.scf.front.sys.entity.User;

import com.bytter.scf.core.base.BaseController;

/**
 * <p>
 * 前置用户表 前端接口控制器
 * </p>
 *
 * @author zhoul
 * @since 2018-06-26
 */
@RestController
@RequestMapping("/api/sys/user")
public class UserRestController extends BaseController {

    @Resource
    private UserService userService;

    @GetMapping
    public Page<User> query(User user, @PageableDefault Page<User> page) {
        EntityWrapper<User> entityWrapper = new EntityWrapper<>(user);
        Page<User> userPage = userService.selectPage(page, entityWrapper);
        logger.debug("result:{}", userPage);
        return userPage;
    }

    /**
     * 根据32位ID查询资源
     *
     * @param id 查询ID
     * @return
     */
    @GetMapping("/{id:[0-9a-z]{32}}")
    public User get(@PathVariable String id) {
        User user = userService.selectById(id);
        logger.debug("result:{}", user);
        return user;
    }

    /**
     * 新增资源
     *
     * @param user
     */
    @PostMapping
    public User insert(@RequestBody User user) {
        boolean result = userService.insert(user);
        logger.debug("result:{},insert:{}", result, user);
        return user;
    }

    /**
     * 修改资源
     *
     * @param user
     * @return
     */
    @PutMapping
    public User update(@RequestBody User user) {
        boolean result = userService.updateById(user);
        logger.debug("result:{},update:{}", result, user);
        return user;
    }

    /**
     * 根据32位ID删除资源
     *
     * @param id userID
     */
    @DeleteMapping("/{id:[0-9a-z]{32}}")
    public void delete(@PathVariable String id) {
        boolean result = userService.deleteById(id);
        logger.debug("result:{},delete by id:{}", result, id);
    }

    /**
     * 批量删除
     *
     * @param ids 需要删除的ID集合
     */
    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<String> ids) {
        boolean result = userService.deleteBatchIds(ids);
        logger.debug("delete by id:{},result:{}", ids, result);
    }
}
