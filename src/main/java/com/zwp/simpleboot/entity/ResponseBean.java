package com.zwp.simpleboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zwp
 * @create 2020-05-22 8:24
 */
@Data
@AllArgsConstructor
public class ResponseBean {
    //状态码
    private Integer code;
    //返回信息
    private String message;
    //返回的数据
    private Object data;
}
