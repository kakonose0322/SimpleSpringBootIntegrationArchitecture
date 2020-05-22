package com.zwp.simpleboot.service.impl;

//import com.power.demo.cache.PowerCacheBuilder;
//import com.power.demo.common.BizResult;
//import com.power.demo.service.contract.AuthTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

//@Component
public class AuthTokenServiceImpl
        // implements AuthTokenService
{

//    @Autowired
//    private PowerCacheBuilder cacheBuilder;

    /*
     * 验证请求头token是否合法
     * */
//    @Override
//    public BizResult<String> powerCheck(String token) {
//
//        BizResult<String> bizResult = new BizResult<>(true, "验证通过");
//
//        System.out.println("token的值为:" + token);
//
//        if (StringUtils.isEmpty(token) == true) {
//            bizResult.setFail("authtoken为空");
//            return bizResult;
//        }
//
//        //处理黑名单
//        bizResult = checkForbidList(token);
//        if (bizResult.getIsOK() == false) {
//            return bizResult;
//        }
//
//        //处理白名单
//        bizResult = checkAllowList(token);
//        if (bizResult.getIsOK() == false) {
//            return bizResult;
//        }
//
//        String key = String.format("Power.AuthTokenService.%s", token);
//
//        //cacheBuilder.set(key, token);
//        //cacheBuilder.set(key, token.toUpperCase());
//
//        //从缓存中取
//        String existToken = cacheBuilder.get(key);
//        if (StringUtils.isEmpty(existToken) == true) {
//            bizResult.setFail(String.format("不存在此authtoken：%s", token));
//            return bizResult;
//        }
//
//        //比较token是否相同
//        Boolean isEqual = token.equals(existToken);
//        if (isEqual == false) {
//            bizResult.setFail(String.format("不合法的authtoken:%s", token));
//            return bizResult;
//        }
//
//        //do something
//
//        return bizResult;
//    }

}