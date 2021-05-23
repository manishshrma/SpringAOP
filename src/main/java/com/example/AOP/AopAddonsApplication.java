package com.example.AOP;

import com.example.AOP.AOP.ShapeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.example.AOP.AOP"})
public class AopAddonsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopAddonsApplication.class, args);
//			ApplicationContext ctx = SpringApplication.run(AopAddonsApplication.class, args);
//			ctx.getBean(ShapeService.class).getTraingle();
    }
}
