package com.zyunf.springboot.repository;

import com.zyunf.springboot.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Yunf
 * @Date: 2019/4/14 18:11
 * @ProjectName: spring-boot-demo-web-restfulcrud
 * @PackageName: com.zyunf.springboot.repository
 */
//继承japrepository来对数据库操作
public interface UserRepository extends JpaRepository<User,Integer> {

}
