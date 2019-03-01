package com.zyunf.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Yunf
 * @Date: 2019/3/1 17:28
 * @ProjectName: spring-boot-demo-web-restfulcrud
 * @PackageName: com.zyunf.springboot.controller
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello 赵云飞";
    }

}
