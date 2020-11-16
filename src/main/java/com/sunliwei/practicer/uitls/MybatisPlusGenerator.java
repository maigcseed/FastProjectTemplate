package com.sunliwei.practicer.uitls;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;

/**
 * @ClassName: MybatisPlusGenerator
 * @Description: MybatisPlus代码生成器
 * @Author: fan jin yang
 * @Date: 2020/11/16
 * @Version: 1.0.0
 **/
public class MybatisPlusGenerator {

    private static AutoGenerator autoGenerator;
    private static GlobalConfig globalConfig;
    private static DataSourceConfig dataSourceConfig;
    static {
        // 配置GlobalConfig
        globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setAuthor("jobob");
        globalConfig.setOpen(false);

        // 配置DataSourceConfig
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setUrl("jdbc:mysql://rm-2zen0g2l5958x88y3so.mysql.rds.aliyuncs.com:3306/fjy_test");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("fjy");
        dataSourceConfig.setPassword("fanjinyang");


        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("模块名");
        pc.setParent("com.baomidou.ant");

        // 填充
        autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(globalConfig);
        autoGenerator.setDataSource(dataSourceConfig);
        autoGenerator.setPackageInfo(pc);
    }
}
