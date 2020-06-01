package com.zwp.simpleboot.service.impl;

import com.zwp.simpleboot.entity.Book;
import com.zwp.simpleboot.mapper.BookMapper;
import com.zwp.simpleboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zwp
 * @create 2020-05-08 11:40
 */
@Repository
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public boolean add(Book book) {
        return bookMapper.insert(book) > 0;
    }

    public List<Book> findAll() {
        return bookMapper.selectByExample(null);
    }
}
