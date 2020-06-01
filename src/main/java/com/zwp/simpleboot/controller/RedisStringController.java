package com.zwp.simpleboot.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @author zwp
 * @create 2020-05-20 15:57
 */
@Api(value="Redis缓存为字符串相关接口")
@RestController
@RequestMapping("/redis")
public class RedisStringController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @PutMapping(value = "/put")
    public void put(String key, @RequestParam(required = false, defaultValue = "default") String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    @GetMapping(value = "/get")
    public Object get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }
}
