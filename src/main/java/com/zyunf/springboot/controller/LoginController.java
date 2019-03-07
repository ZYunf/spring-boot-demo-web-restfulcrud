package com.zyunf.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Author: Yunf
 * @Date: 2019/3/7 16:15
 * @ProjectName: spring-boot-demo-web-restfulcrud
 * @PackageName: com.zyunf.springboot.controller
 */
@Controller
public class LoginController {
    @RequestMapping("/")
    public String showIndex(){
        return "success";
    }

    //@RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @PostMapping(value ="/user/login")
    public String login(@RequestParam("password") String password, @RequestParam("username")String username, Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
        session.setAttribute("loginUser",username );

        return "redirect:/index.html";
        }else {
            map.put("msg","用户名密码错误" );
            return "/authentication/login";
        }

    }

}
