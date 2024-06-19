package com.chianing.demo.mockdemo;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chianing
 */
@SpringBootApplication(exclude = MybatisAutoConfiguration.class)
public class MockDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockDemoApplication.class, args);
    }

}
