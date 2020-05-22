package com.zwp.simpleboot.controller;

import com.zwp.simpleboot.entity.Book;
import com.zwp.simpleboot.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zwp
 * @create 2020-05-08 11:42
 */
@Api(value="图书相关的接口")
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/add")
    @ApiOperation(notes="添加书籍",value="添加书籍",httpMethod="POST")
    @ApiImplicitParam(name = "book", value = "Book实体", required = true, dataType = "Book")
    public String add(@RequestBody Book book){
        return "hello "+ bookService.add(book);
    }

//    @RequestMapping(value = "/getinfobyid", method = RequestMethod.POST)
//    @ApiOperation("根据商品Id查询商品信息")
//    @ApiImplicitParams({
//            @ApiImplicitParam(paramType = "header", name = "authtoken", required = true, value = "authtoken", dataType =
//                    "String"),
//    })
//    public GetGoodsByGoodsIdResponse getGoodsByGoodsId(@RequestHeader String authtoken, @RequestBody GetGoodsByGoodsIdRequest request) {
//
//        return _goodsApiService.getGoodsByGoodsId(request);
//
//    }
}
