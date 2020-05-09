package com.lyp.springbootmybatisplus.server.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyp.springbootmybatisplus.bean.Employee;
import com.lyp.springbootmybatisplus.mapper.EmployeeMapper;
import com.lyp.springbootmybatisplus.server.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
    String string;
}
