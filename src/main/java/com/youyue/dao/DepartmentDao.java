package com.youyue.dao;

import com.youyue.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class DepartmentDao {
    private static Map<Integer, Department> map = null;

    static {
     map = new HashMap<>();
     map.put(101,new Department(101,"教学部"));
     map.put(102,new Department(102,"市场部"));
     map.put(103,new Department(103,"教研部"));
     map.put(104,new Department(104,"运营部"));
     map.put(105,new Department(105,"后勤部"));

    }

    public Collection<Department> getDepartment(){
        return map.values();
    }

    public Department getById(Integer id){
        return map.get(id);
    }
}
