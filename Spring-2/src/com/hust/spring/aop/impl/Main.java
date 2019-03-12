package com.hust.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        //1、创建Spring的IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2、从IoC容器中获取bean的实例
        ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ctx.getBean(ArithmeticCalculator.class);

        //3、使用bean
        int result = arithmeticCalculator.add(3, 6);
        System.out.println("result: " + result);

        result = arithmeticCalculator.mul(3, 6);
        System.out.println("result: " + result);

        result = arithmeticCalculator.div(1000, 10);
        System.out.println("result:" + result);
    }
}
