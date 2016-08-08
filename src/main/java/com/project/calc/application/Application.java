package com.project.calc.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = Controller.class)
@ComponentScan(basePackages="com.project.calc")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}