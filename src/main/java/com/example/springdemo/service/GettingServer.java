package com.example.springdemo.service;

import org.springframework.stereotype.Service;

public class GettingServer {

    @Service
    public class ServiceLayer {
        public String sayHello() {
            return "Hello World!!";
        }
    }
}
