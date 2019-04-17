package com.zyunf.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Author: Yunf
 * @Date: 2019/3/1 17:28
 * @ProjectName: spring-boot-demo-web-restfulcrud
 * @PackageName: com.zyunf.springboot.controller
 */
@Controller
public class HelloController {
    //@RequestMapping({"/","index.html"})
    //public String index(){
    //    return "index";
    //}

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello 赵云飞";
    }

    @RequestMapping("/success")
    public String success(Map map) {
        map.put("hello", "<h1>你好</h1>");
        map.put("user", Arrays.asList("zhangsan", "lisi", "wangwu"));
        return "success";
    }

    @ResponseBody
    @RequestMapping("/query")
    public Map<String, Object> map() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from department");
        return list.get(0);
    }

}
