package com.lyp.springbootmybatisplus.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@TableName("tbl_employee")
@Data
public class Employee {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String lastName;
    private String email;
    private Integer age;
    private Integer gender;
    private Integer version;
}
