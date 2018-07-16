package com.bytter.scf.front.sys.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 前置单位表
 * </p>
 *
 * @author zhoul
 * @since 2018-06-26
 */
@TableName("p_sys_corp")
public class Corp implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("ID")
    private String id;

    /**
     * 所属网点
     */
    @TableField("NET_ID")
    private String netId;

    /**
     * 单位代码
     */
    @TableField("CORP_CODE")
    private String corpCode;

    /**
     * 单位名称
     */
    @TableField("CORP_NAME")
    private String corpName;

    /**
     * 上级单位
     */
    @TableField("PARENT_ID")
    private String parentId;

    /**
     * 单位类型
     */
    @TableField("TYPE")
    private String type;

    /**
     * 状态
     */
    @TableField("STATUS")
    private Integer status;

    /**
     * 核心企业ID
     */
    @TableField("ENTER_ID")
    private Long enterId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNetId() {
        return netId;
    }

    public void setNetId(String netId) {
        this.netId = netId;
    }
    public String getCorpCode() {
        return corpCode;
    }

    public void setCorpCode(String corpCode) {
        this.corpCode = corpCode;
    }
    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Long getEnterId() {
        return enterId;
    }

    public void setEnterId(Long enterId) {
        this.enterId = enterId;
    }

    @Override
    public String toString() {
        return "Corp{" +
        "id=" + id +
        ", netId=" + netId +
        ", corpCode=" + corpCode +
        ", corpName=" + corpName +
        ", parentId=" + parentId +
        ", type=" + type +
        ", status=" + status +
        ", enterId=" + enterId +
        "}";
    }
}
