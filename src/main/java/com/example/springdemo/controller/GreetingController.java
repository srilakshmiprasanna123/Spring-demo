package com.example.springdemo.controller;

import com.example.springdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    @Autowired
    User user;
    @GetMapping("/")
    public String sayHello(){
        return "Hello Lucky";
    }

    @RequestMapping(value = {"/hi"}, method = RequestMethod.GET)
    public String sayHelloDifferently() {
        return "Hello Everyone";
    }

    @RequestMapping(value = {"/qu"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello " + name + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam (@PathVariable String name){
        return "Hello " + name + " Welcome";
    }

    @PostMapping("/post")
    public String sayHello (@RequestBody SecurityProperties.User user){
        return "Hello " + user.get + " " + user.getLastName () + "!!!";
    }
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName")String lastName){
        return "Hello "+ firstName + " " + lastName + " !!!!";
    }

}
