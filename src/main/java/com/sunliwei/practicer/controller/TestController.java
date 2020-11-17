package com.sunliwei.practicer.controller;

import com.sunliwei.practicer.domain.TestDomain;
import com.sunliwei.practicer.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: TestController
 * @Description:
 * @Author: fan jin yang
 * @Date: 2020/8/4
 * @Version: 1.0.0
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/test1")
    public Object testController(){

        /*List<TestDomain> testDomains = testMapper.quarryAll();
        for(TestDomain testDomain:testDomains){
            System.out.println(testDomain);
        }
        return testDomains;*/
        System.out.println("s");
        return "s";
    }

    @RequestMapping("/test2")
    public Object testController2(){
        /*List<TestDomain> testDomains = testMapper.selectList(null);*/
        TestDomain testDomain = testMapper.selectOneById((long) 1);
        System.out.println(testDomain);
        return "s";
    }
}
