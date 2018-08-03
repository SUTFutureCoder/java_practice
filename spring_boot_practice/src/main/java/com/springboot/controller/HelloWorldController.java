package com.springboot.controller;

import com.springboot.MysqlProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloWorldController {

    @Value("${helloWorld}")
    private String helloWorld;

    @Resource
    private MysqlProperties mysqlProperties;

    @RequestMapping("/helloworld")
    public String say() {
        return "Hey Spring Boot" + helloWorld;
    }

    @RequestMapping("/showjdbc")
    public String showJdbc() { return "mysql.jdbcName" + mysqlProperties.getJdbcName() + "<br/>"
            + "mysql.dbUrl" + mysqlProperties.getDbUrl() + "<br/>"
            + "mysql.userName" + mysqlProperties.getUserName() + "<br/>"
            + "mysql.password" + mysqlProperties.getPassword() + "<br/>";
    }

}
