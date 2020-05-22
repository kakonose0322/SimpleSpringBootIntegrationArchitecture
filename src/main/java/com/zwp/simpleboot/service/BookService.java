package com.zwp.simpleboot.service;

import com.zwp.simpleboot.entity.Book;

/**
 * @author zwp
 * @create 2020-05-08 11:39
 */
public interface BookService {
    /**
     * 添加书籍
     */
    public boolean add(Book book);
}
