package com.zyunf.springboot.mapper;

import com.zyunf.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @Author: Yunf
 * @Date: 2019/4/14 16:59
 * @ProjectName: spring-boot-demo-web-restfulcrud
 * @PackageName: com.zyunf.springboot.mapper
 */
//指定这是操作数据库的mapper
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName,departInfo) values(#{departmentName},#{departInfo}) ")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
