package com.zyunf.springboot.bean;

/**
 * @Author: Yunf
 * @Date: 2019/4/14 16:47
 * @ProjectName: spring-boot-demo-web-restfulcrud
 * @PackageName: com.zyunf.springboot.bean
 */
public class Department {
    private String id;
    private String departmentName;
    private String departInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartInfo() {
        return departInfo;
    }

    public void setDepartInfo(String departInfo) {
        this.departInfo = departInfo;
    }
}
