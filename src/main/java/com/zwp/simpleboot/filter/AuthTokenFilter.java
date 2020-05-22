package com.zwp.simpleboot.filter;

//import com.power.demo.common.AppConst;
//import com.power.demo.common.BizResult;
//import com.power.demo.service.contract.AuthTokenService;
//import com.power.demo.util.PowerLogger;
//import com.power.demo.util.SerializeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author zwp
 * @create 2020-05-13 8:46
 */
//@Component
public class AuthTokenFilter implements Filter {
//    @Autowired
//    private AuthTokenService authTokenService;
//
    @Override
    public void init(FilterConfig var1) throws ServletException {

    }
//
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
//        HttpServletRequest req = (HttpServletRequest) request;
//
//        String token = req.getHeader(AppConst.AUTH_TOKEN);
//
//        BizResult<String> bizResult = authTokenService.powerCheck(token);
//
//        System.out.println(SerializeUtil.Serialize(bizResult));
//
//        if (bizResult.getIsOK() == true) {
//            PowerLogger.info("auth token filter passed");
//
//            chain.doFilter(request, response);
//        } else {
//            throw new ServletException(bizResult.getMessage());
//        }
//
    }
//
//
    @Override
    public void destroy() {

    }
}