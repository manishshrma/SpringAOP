package com.example.AOP.AOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller_test {

    @Autowired
    ShapeService shapeService;

    @RequestMapping("/test")
    public String getmethod(){
        System.out.println("hello.............................................");
        return "hello world";

    }

    @RequestMapping("/getname")
    public String get_test(){
        System.out.println("hello.............................................");
       String name= shapeService.getCircle().getName();

        System.out.println(name);
        return name;

    }


}
