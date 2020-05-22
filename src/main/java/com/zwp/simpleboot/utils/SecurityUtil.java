package com.zwp.simpleboot.utils;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @author zwp
 * @create 2020-05-20 10:54
 * @deprecated 数据库账户密码加密工具
 */
public class SecurityUtil {
    public static void main(String[] args) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //加密所需的salt(盐)
        textEncryptor.setPassword("G0CvDz7oJn6");
        //要加密的数据（数据库的用户名或密码）
        String username = textEncryptor.encrypt("book_test");
        String password = textEncryptor.encrypt("123456");
        System.out.println("username:"+username);
        System.out.println("password:"+password);
    }
}
