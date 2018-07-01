package com.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpInterceptor implements HandlerInterceptor {



    // 请求controller之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String ip = IPUtils.getRealIP(request);
        // 添加黑名单ip
        System.out.println("ip="+ip);

//        //request.getHeader("token")
//        request.getAttribute("name");

//        response.setCharacterEncoding("utf-8");
//        response.setContentType("text/json");
//        OutputStream out = response.getOutputStream();
//        out.write("error!".getBytes("utf-8"));
//        out.flush();

        return true;
    }

    // 请求controller之后，渲染视图之前调用
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    // 渲染视图之后
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
