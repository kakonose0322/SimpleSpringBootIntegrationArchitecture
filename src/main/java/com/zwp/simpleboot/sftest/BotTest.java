package com.zwp.simpleboot.sftest;

import com.google.gson.Gson;
import com.zwp.simpleboot.entity.BotResponse;
import com.zwp.simpleboot.entity.SFBot;
import com.zwp.simpleboot.utils.HttpClientUtil;

/**
 * @author zwp
 * @create 2020-06-01 15:18
 */
public class BotTest {
    public void connectionBot() throws Exception {
        SFBot bot = new SFBot();
        bot.setAppid("your id");
        bot.setUserid("your id");
        bot.setSpoken("你好！");
        System.out.println(bot);
        /*转换json*/
        Gson gson = new Gson();
        String myMessageJson = gson.toJson(bot);
        System.out.println(myMessageJson);
        String url = "https://api.ownthink.com/bot";
        String s = HttpClientUtil.doPost(url, myMessageJson, "UTF-8");
        System.out.println(s);
        BotResponse responseParams = gson.fromJson(s, BotResponse.class);
        System.out.println(responseParams);
    }

    public static void main(String[] args) throws Exception {
        BotTest botTest = new BotTest();
        botTest.connectionBot();
    }
}
