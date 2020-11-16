package com.sunliwei.practicer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.sunliwei.practicer.mapper")
@SpringBootApplication(scanBasePackages = "com.sunliwei.practicer")
public class PracticerApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(PracticerApplication.class, args);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
