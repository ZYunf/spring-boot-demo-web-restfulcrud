package com.zyunf.springboot.controller;

import com.zyunf.springboot.bean.Department;
import com.zyunf.springboot.bean.Employee;
import com.zyunf.springboot.mapper.DepartmentMapper;
import com.zyunf.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yunf
 * @Date: 2019/4/14 17:05
 * @ProjectName: spring-boot-demo-web-restfulcrud
 * @PackageName: com.zyunf.springboot.controller
 */
@RestController
public class DeptController {
    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id) {
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department) {
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id) {
        return employeeMapper.getEmployeeById(id);
    }

    @GetMapping("/emp")
    public void insertEmp(Employee employee) {
        employeeMapper.insertEmployee(employee);
    }
}
