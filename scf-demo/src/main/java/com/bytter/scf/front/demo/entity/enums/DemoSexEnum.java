package com.bytter.scf.front.demo.entity.enums;

import com.bytter.scf.core.base.IEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

/**
 * 测试枚举
 */
public enum DemoSexEnum implements IEnum {
    MAN(1, "男"),
    FEMALE(2, "女");

    private int value;
    private String desc;

    DemoSexEnum(final int value, final String desc) {
        this.value = value;
        this.desc = desc;
    }

    @JsonCreator
    public static DemoSexEnum getItem(int code){
        for(DemoSexEnum item : values()){
            if(item.getValue().equals(code)){
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public Serializable getValue() {
        return this.value;
    }

    public String getDesc() {
        return this.desc;
    }
}
