package com.lyp.springbootmybatisplus.controller;

import com.lyp.springbootmybatisplus.bean.Employee;
import com.lyp.springbootmybatisplus.server.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/all")
    public String list() {
        List<Employee> list = employeeService.list();
        System.out.println(list);
        return list.toString();
    }
}
