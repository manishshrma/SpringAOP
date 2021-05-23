package com.example.AOP.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // this @ apply to only getName method of circle class
//    @Before("execution(public String com.example.AOP.AOP.Circle.getName())")
//    public void LoggingAdvice(){
//        System.out.println("Advice run. getMethod called");
//    }

    //this @ apply to all getName method
//    @Before("execution(public String getName())")
//    public void LoggingAdvice(){
//        System.out.println("Advice run. getMethod called");
//    }


    // this @ apply to all methods which get start with get and return anything
    // Note: Don't forget to restrict your pointcut, within is used for restriction
    // otherwise pointcut enter into global and try to use them, error
//    @Before("execution(public String get*())&& within(com.example.AOP..*)")
//    public void LoggingAdvice(){
//        System.out.println("Advice run. getMethod called");
//    }

    //    // this @ apply to all methods which get start with get and return anything and also take args
//    @Before("execution(public String get*(*))&& within(com.example.AOP..*)")
//    public void LoggingAdvice(){
//        System.out.println("Advice run. getMethod called");
//    }
// this @ apply to all methods which get start with get and return anything and may take args or may not as well.
//    @Before("execution(public String get*(..))&& within(com.example.AOP..*)")
//    public void LoggingAdvice() {
//        System.out.println("Advice run. getMethod called");
//    }
    ////////////////////pointcut//////////////////////////////
//    @Before("allgetters()")
//    public void FirstAdvice() {
//        System.out.println("Advice, first");
//    }
//    @Before("allgetters()")
//    public void SecondAdvice() {
//        System.out.println("Advice second");
//    }
//     here you see for method firstADVICE AND secondAdvice are have same pointcut.
//     to avoid duplication of code(or writing same pointcut, use pointcut expression)
//
//    @Pointcut("execution(public String get*(..))&& within(com.example.AOP..*)")
//    public void allgetters(){ }
//


    //  this pointcut run for all the methods present in the circle class
//    @Before("allcirclemethods()")
//    public void FirstAdvice() {
//        System.out.println("Advice, first");
//    }
//    @Before("allcirclemethods()")
//    public void SecondAdvice() {
//        System.out.println("Advice second");
//    }
//    @Pointcut("within(com.example.AOP..Circle)")
//     public void allcirclemethods(){
//
//     }

    //////////////////////////////joinpoint///////////////////////////////////

    // join point give the info of the method that get called
//    @Before("getters()")
//    public void loggingAdvice(JoinPoint joinPoint){
//        System.out.println("finally run");
//        System.out.println(joinPoint.toString());
//        Circle circle=(Circle) joinPoint.getTarget(); // can get object also, good naa..
//    }
//
//    @Pointcut("execution(public String get*())&& within(com.example.AOP..*)")
//    public void getters(){}
//
//    ////////////////////////can use args also and get its value/////////
//
//    @Before("args(name)")
//    public void stringArgumentsmethod(String name){
//        System.out.println("args are in sting form.."+name);
//    }

    ////////////////////After///////////////////////

//    @After is same as @Before, Note no matter if method(point) get executed succesfully r not,
    // @After or @before will get run. they don't  care if your method throwing exception or not
}
