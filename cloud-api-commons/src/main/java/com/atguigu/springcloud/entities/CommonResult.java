package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Dengbinsheng
 * @date 2021/9/17 21:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);//如果这行报错，请安装lombok插件
    }
}
