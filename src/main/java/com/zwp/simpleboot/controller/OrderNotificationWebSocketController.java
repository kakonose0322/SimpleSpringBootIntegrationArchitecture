package com.zwp.simpleboot.controller;

import com.zwp.simpleboot.websocket.OrderNotificationServer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zwp
 * @create 2020-05-20 14:30
 */
@Api(tags = "全平台通知接口")
@RestController("notification")
public class OrderNotificationWebSocketController {
    @ApiOperation("通知test")
    @GetMapping("/send")
    public void test(@RequestParam String merchantId){
        OrderNotificationServer.sendMessage(merchantId,"有新订单啦");
    }
}
