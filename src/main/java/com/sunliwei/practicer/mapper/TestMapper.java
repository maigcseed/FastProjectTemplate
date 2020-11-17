package com.sunliwei.practicer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunliwei.practicer.entity.TestDomain;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName: TestMapper
 * @Description:
 * @Author: fan jin yang
 * @Date: 2020/8/4
 * @Version: 1.0.0
 **/
public interface TestMapper extends BaseMapper<TestDomain> {

    @Select("select * from table_test where id = ${id}")
    TestDomain selectOneById(@Param("id") Long id);

}
