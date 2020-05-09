package com.lyp.springbootmybatisplus;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyp.springbootmybatisplus.bean.Employee;
import com.lyp.springbootmybatisplus.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.concurrent.locks.Condition;

@MapperScan("com.lyp.springbootmybatisplus.mapper")
@SpringBootTest
class SpringBootMybatisplusApplicationTests {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    void contextLoads() {
//        Employee employee = new Employee();
//        employee.setLastName("lisi");
//        employee.setAge(15);
//        employee.setGender(0);
//        employee.setEmail("emn@129.com");
//        employee.setVersion(1);
//        employeeMapper.insert(employee);
//        //employeeMapper.deleteById(5);
//        List<Employee> employees = employeeMapper.selectList(null);
//        employees.forEach(System.out::println);
//        List<Employee> emps = employeeMapper.selectList(new QueryWrapper<Employee>().between("age", 15, 30));
//        emps.forEach(System.out::println);
//        Employee employee = new Employee();
//        employee.setLastName("仓一直");
//        employee.setGender(0);
//        employeeMapper.update(employee, new QueryWrapper<Employee>()
//                .eq("last_Name", "Zhangsan"));
//        Integer age = employeeMapper.selectCount(new QueryWrapper<Employee>().between("age", 14, 25));
//        System.out.println(age);
//        Page<Employee> age = employeeMapper.selectPage(new Page<>(1, 3), new QueryWrapper<Employee>()
//                .between("age", 14, 25));
//        List<Employee> records = age.getRecords();
//        records.forEach(System.out::println);
        Employee employee = new Employee();
        employee.setGender(0);
        employee.setLastName("wangwu");
        employee.setEmail("asd@123.com");
        employeeMapper.insert(employee);
    }


}
