package com.zwp.simpleboot.controller;

import com.zwp.simpleboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @author zwp
 * @create 2020-05-20 16:05
 */
@RestController
@RequestMapping("/redisObj")
public class RedisObjectController {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @GetMapping("/get/{username}")
    public Object get(@PathVariable String username) {
        return redisTemplate.opsForValue().get(username);
    }

    @PutMapping("/put")
    public void put(String userName, String nickName) {
        User user = new User();
        user.setName(userName);
        user.setNickName(nickName);
        redisTemplate.opsForValue().set(userName, user.getNickName());
    }
}
