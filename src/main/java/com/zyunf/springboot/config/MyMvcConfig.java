package com.zyunf.springboot.config;

import com.zyunf.springboot.component.MyLocaleRosolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author: Yunf
 * @Date: 2019/3/4 11:04
 * @ProjectName: spring-boot-demo-web-restfulcrud
 * @PackageName: com.zyunf.springboot.config
 */
//@EnableWebMvc 接管springMVC
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/zyf").setViewName("success");
    }

    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("authentication/login");
                registry.addViewController("/index.html").setViewName("authentication/login");
            }

        };

        return adapter;
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleRosolver();
    }
}
