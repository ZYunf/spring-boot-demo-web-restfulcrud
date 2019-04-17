package com.zyunf.springboot.controller;

import com.zyunf.springboot.bean.User;
import com.zyunf.springboot.repository.UserRepository;
import com.zyunf.springboot.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Yunf
 * @Date: 2019/4/14 18:18
 * @ProjectName: spring-boot-demo-web-restfulcrud
 * @PackageName: com.zyunf.springboot.controller
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    //@pathVariable路径变量:获取{id}的值并赋值给 id
    public User getUser(@PathVariable("id") Integer id) {
        User user = userRepository.findOne(id);
        return user;
    }

    @GetMapping("/user")
    public User insertUser(User user) {
        User save = userRepository.save(user);
        return save;
    }

    @GetMapping("/user/findAll")
    public List<User> findAll() {
        return userRepository.findAll();

    }

    @RequestMapping("/user/delete/{id}")
    public Result delete(@PathVariable("id") Integer id) {
        try {
            userRepository.delete(id);

            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }
}
