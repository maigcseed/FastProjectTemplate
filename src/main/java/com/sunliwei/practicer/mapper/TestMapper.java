package com.sunliwei.practicer.mapper;

import com.sunliwei.practicer.domain.TestDomain;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName: TestMapper
 * @Description:
 * @Author: fan jin yang
 * @Date: 2020/8/4
 * @Version: 1.0.0
 **/
public interface TestMapper {


    @Select("select * from table_test")
    List<TestDomain> quarryAll();
}
