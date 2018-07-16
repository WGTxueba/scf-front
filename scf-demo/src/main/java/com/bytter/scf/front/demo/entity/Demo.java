package com.bytter.scf.front.demo.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.bytter.scf.core.json.View;
import com.bytter.scf.front.demo.entity.enums.DemoSexEnum;
import com.fasterxml.jackson.annotation.JsonView;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * ØÒ
 * 用户表
 */
@TableName("demo")
public class Demo {

    @JsonView(View.Summary.class)
    private String id;

    @JsonView(View.Summary.class)
    @NotBlank
    private String name;

    @JsonView(View.Summary.class)
    private DemoSexEnum sex;

    @NotBlank
    private String loginName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DemoSexEnum getSex() {
        return sex;
    }

    public void setSex(DemoSexEnum sex) {
        this.sex = sex;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }



    @Override
    public String toString() {
        return "Demo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", loginName='" + loginName + '\'' +
                '}';
    }
}
