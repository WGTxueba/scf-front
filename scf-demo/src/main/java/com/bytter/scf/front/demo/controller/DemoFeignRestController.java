//package com.bytter.scf.front.demo.controller;
//
//import com.baomidou.mybatisplus.plugins.Page;
//import com.bytter.scf.core.base.BaseController;
//import com.bytter.scf.front.demo.client.DemoClient;
//import com.bytter.scf.front.demo.entity.Demo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.List;
//
///**
// * demo业务的API接口
// */
//@RestController
//@RequestMapping("/api/feign")
//public class DemoFeignRestController extends BaseController {
//
//
//    @Autowired
//    private DemoClient demoClient;
//
//    @GetMapping
//    public Page<Demo> query(Demo demo, @PageableDefault Page<Demo> pageable) {
//        Page<Demo> demoPage = demoClient.query(demo, pageable);
//        logger.debug("result:{}", demoPage);
//        return demoPage;
//    }
////
////    /**
////     * 根据32位ID查询资源
////     *
////     * @param id 查询ID
////     * @return Demo对象
////     */
////    @GetMapping("/{id:[0-9a-z]{32}}")
////    public Object get(@PathVariable String id) {
////        Demo demo = demoClient.get(id);
////        logger.debug("result:{}", demo);
////        return demo;
////    }
////
////    /**
////     * 新增资源
////     *
////     * @param demo
////     */
////    @PostMapping
////    public Demo insert(@Valid @RequestBody Demo demo) {
////        return demoClient.insert(demo);
////    }
////
////    /**
////     * 修改资源
////     *
////     * @param demo
////     * @return
////     */
////    @PutMapping
////    public Demo update(@RequestBody Demo demo) {
////        return demoClient.update(demo);
////    }
////
////    /**
////     * 根据32位ID删除资源
////     *
////     * @param id demoID
////     */
////    @DeleteMapping("/{id:[0-9a-z]{32}}")
////    public void delete(@PathVariable String id) {
////        demoClient.delete(id);
////    }
////
////    /**
////     * 批量删除
////     *
////     * @param ids 需要删除的ID集合
////     */
////    @PostMapping("/batchDelete")
////    public void batchDelete(@RequestBody List<String> ids) {
////        demoClient.batchDelete(ids);
////    }
//
//
//}
