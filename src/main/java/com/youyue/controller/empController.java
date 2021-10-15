package com.youyue.controller;

import com.youyue.dao.EmployeeDao;
import com.youyue.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Collection;

@Controller
public class empController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/emps")
    public String getEmp(Model model){
        Collection<Employee> employees = employeeDao.geiAll();
        model.addAttribute("emps",employees);
        return "list";
    }
}
