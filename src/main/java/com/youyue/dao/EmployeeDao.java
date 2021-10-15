package com.youyue.dao;

import com.youyue.pojo.Department;
import com.youyue.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@Repository
public class EmployeeDao {

    private static Map<Integer, Employee> map = null;

    @Autowired
    private DepartmentDao departmentDao;

    static {
        map = new HashMap<>();
        map.put(101,new Employee(101,"AAA","106786236@qq.com",1,new Department(101,"教学部"),new Date()));
        map.put(102,new Employee(102,"BBB","106786236@qq.com",0,new Department(102,"市场部"),new Date()));
        map.put(103,new Employee(103,"CCC","106786236@qq.com",1,new Department(103,"教研部"),new Date()));
        map.put(104,new Employee(104,"DDD","106786236@qq.com",0,new Department(104,"运营部"),new Date()));
        map.put(105,new Employee(105,"EEE","106786236@qq.com",1,new Department(105,"后勤部"),new Date()));
    }

    public Collection<Employee> geiAll(){
        return map.values();
    }

    public Employee getById(Integer id){
        return map.get(id);
    }


}
