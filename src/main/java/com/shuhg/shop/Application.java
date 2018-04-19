package com.shuhg.shop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by 大舒 on 2017/11/23.
 */
@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class Application {
    @Value("${spring.datasource.url}")
    private String dbUrl;
    private final static Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("---------- SpringBoot info started -----------");
    }
}
