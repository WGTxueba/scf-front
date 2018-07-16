package com.bytter.scf.front.demo.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author chenlj
 * @since 2018-07-09
 */
@TableName("demo2")
public class Demo2 implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    /**
     * 测试名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 性别
     */
    @TableField("SEX")
    private Integer sex;

    /**
     * 测试登录名称
     */
    @TableField("LOGIN_NAME")
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
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
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
        return "Demo2{" +
        "id=" + id +
        ", name=" + name +
        ", sex=" + sex +
        ", loginName=" + loginName +
        "}";
    }
}
