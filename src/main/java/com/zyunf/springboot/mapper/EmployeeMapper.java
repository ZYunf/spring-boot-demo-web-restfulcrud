package com.zyunf.springboot.mapper;

import com.zyunf.springboot.bean.Employee;

/**
 * @Author: Yunf
 * @Date: 2019/4/14 17:31
 * @ProjectName: spring-boot-demo-web-restfulcrud
 * @PackageName: com.zyunf.springboot.mapper
 */
public interface EmployeeMapper {
    public Employee getEmployeeById(Integer id);
    public void insertEmployee(Employee employee);
}
