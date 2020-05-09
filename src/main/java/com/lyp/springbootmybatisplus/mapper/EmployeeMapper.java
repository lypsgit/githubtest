package com.lyp.springbootmybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyp.springbootmybatisplus.bean.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMapper extends BaseMapper<Employee> {
}
