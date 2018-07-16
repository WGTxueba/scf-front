package com.bytter.scf.front.sys.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.bytter.scf.core.json.View;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * <p>
 * 前置系统参数表
 * </p>
 *
 * @author zhoul
 * @since 2018-06-26
 */
@TableName("p_sys_param")
public class Param implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("ID")
    @JsonIgnore
    private String id;

    /**
     * 类型0数据中心、1资金系统
     */
    @TableField("TYPE")
    private String type;

    /**
     * 配置名
     */
    @TableField("NAME")
    private String name;

    /**
     * 配置值
     */
    @NotBlank
    @TableField("VALUE")
    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Param{" +
        "id=" + id +
        ", type=" + type +
        ", name=" + name +
        ", value=" + value +
        "}";
    }
}
