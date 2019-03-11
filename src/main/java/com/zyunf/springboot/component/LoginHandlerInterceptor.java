package com.zyunf.springboot.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Yunf
 * @Date: 2019/3/7 16:44
 * @ProjectName: spring-boot-demo-web-restfulcrud
 * @PackageName: com.zyunf.springboot.component
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    //目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        Object loginuser = httpServletRequest.getSession().getAttribute("loginUser");
        if (loginuser == null) {
            //未登录,返回登录页面
            httpServletRequest.setAttribute("msg","没有权限请先登录" );
            httpServletRequest.getRequestDispatcher("/logins").forward(httpServletRequest,httpServletResponse );
            return false;
        } else {
            //已登录
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
