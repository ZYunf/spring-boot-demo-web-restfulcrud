package com.zyunf.springboot.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @Author: Yunf
 * @Date: 2019/3/4 17:48
 * @ProjectName: spring-boot-demo-web-restfulcrud
 * @PackageName: com.zyunf.springboot.component
 */
public class MyLocaleRosolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String l = httpServletRequest.getParameter("l");
        Locale locale=Locale.getDefault();
        if (!StringUtils.isEmpty(l)) {
            String[] split = l.split("_");
             locale = new Locale(split[0], split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
