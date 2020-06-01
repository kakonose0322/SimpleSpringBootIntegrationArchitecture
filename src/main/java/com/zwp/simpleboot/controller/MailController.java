package com.zwp.simpleboot.controller;

import com.zwp.simpleboot.service.MailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author zwp
 * @create 2020-05-29 17:15
 */
@Api(value="邮件相关的接口")
@Controller
@RequestMapping("/mail")
public class MailController {
    @Autowired
    private MailService mailService;

    @RequestMapping("/send")
    @ApiOperation(notes="发送邮件",value="发送邮件",httpMethod="GET")
//    @ApiImplicitParam(name = "book", value = "Book实体", required = true, dataType = "Book")
    public void send(){
        Map<String,Object> map =new HashMap<>();
        map.put("randomvalue",new Random().nextInt(999999));
        try {
            mailService.sendTemplateMail("3072994091@qq.com","测试功能",map,"emailTemplate");
        }catch (Exception e) {
            e.printStackTrace();
        }
//        return "success";
    }
}
