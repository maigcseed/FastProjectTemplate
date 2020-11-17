package com.sunliwei.practicer.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName: TestDomain
 * @Description:
 * @Author: fan jin yang
 * @Date: 2020/8/4
 * @Version: 1.0.0
 **/
@Data
@TableName(value = "table_test")
public class TestDomain{

    @TableId(type = IdType.AUTO)
    private int id;

    private String name;

    private int age;
}
