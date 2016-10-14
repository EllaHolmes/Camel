package com.fun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.jms.ConnectionFactory;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //This will start up a spring application and tomcat server
        SpringApplication.run(Application.class, args);
    }
}
