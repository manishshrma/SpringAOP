package com.example.AOP.AOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controller_test {

    @Autowired
    ShapeService shapeService;

    @GetMapping("/getname")
    public String get_test(){

       String name= shapeService.getTraingle().getName();
        System.out.println(name);
        return name;

    }


}
