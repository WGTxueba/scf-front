package com.bytter.scf.front.sys.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 前置用户表
 * </p>
 *
 * @author zhoul
 * @since 2018-06-26
 */
@TableName("p_sys_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("ID")
    private String id;

    /**
     * 用户代码
     */
    @TableField("USER_CODE")
    private String userCode;

    /**
     * 用户名
     */
    @TableField("USER_NAME")
    private String userName;

    /**
     * 密码
     */
    @TableField("PASSWORD")
    private String password;

    /**
     * 盐
     */
    @TableField("SALT")
    private String salt;

    /**
     * 单位ID
     */
    @TableField("CORP_ID")
    private String corpId;

    /**
     * 状态
     */
    @TableField("STATUS")
    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", userCode=" + userCode +
        ", userName=" + userName +
        ", password=" + password +
        ", salt=" + salt +
        ", corpId=" + corpId +
        ", status=" + status +
        "}";
    }
}
