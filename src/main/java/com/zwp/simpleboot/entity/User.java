package com.zwp.simpleboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zwp
 * @create 2020-05-20 16:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Integer age;
    private Double money;
    private String address;
    private String birthday;
    private String nickName;
}
