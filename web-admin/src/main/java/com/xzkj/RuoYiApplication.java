package com.xzkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * 启动程序
 * 
 * @author lmh
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableEurekaClient
public class RuoYiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println("修治后台管理系统启动成功");
    }
}
