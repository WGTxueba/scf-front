package com.bytter.scf.front.demo.client;

import com.baomidou.mybatisplus.plugins.Page;
import com.bytter.scf.front.demo.entity.Demo;
import com.bytter.scf.security.config.DataCenterConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "demoClient", url = "http://127.0.0.1:80801",configuration = DataCenterConfiguration.class)
public interface DemoClient {

    /**
     * 调用远程http://127.0.0.1:8080/api/demo接口
     * 注意参数，Page可为对象
     * 方法中的name参数为查询条件参数，需要使用@RequestParam，按下方格式填写
     *
     * @param name     按名称查询
     * @param pageable 分页对象
     * @return
     */
    @GetMapping(value = "/api/demo")
    Page<Demo> query(@RequestParam("name") String name, Page<Demo> pageable);


    /**
     * 调用远程http://127.0.0.1:8080/api/demo/{id}接口
     * 注意{id}，此处为feign接口，与spring mvc参数绑定不同
     * 需要使用注解@PathVariable告诉feign方法中参数列表的id对应值
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/api/demo/{id}")
    Demo get(@PathVariable("id") String id);

    /**
     * POST，PUT请求需要在注解中加入consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
     * 在每个参数列表前加入@RequestBody，否则不能正常解析
     * @param demo
     * @return
     */
    @PostMapping(value = "/api/demo",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Demo insert(@RequestBody Demo demo);

    @PutMapping(value = "/api/demo",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Demo update(@RequestBody Demo demo);

    @DeleteMapping(value = "/api/demo/{id}")
    void delete(@PathVariable("id") String id);

    @PostMapping(value = "/api/demo/batchDelete",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    void batchDelete(@RequestBody List<String> ids);
}

