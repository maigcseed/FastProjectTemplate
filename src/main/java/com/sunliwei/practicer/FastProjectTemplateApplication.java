package com.sunliwei.practicer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(scanBasePackages = "com.sunliwei.practicer", exclude = DataSourceAutoConfiguration.class)
public class FastProjectTemplateApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(FastProjectTemplateApplication.class, args);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
