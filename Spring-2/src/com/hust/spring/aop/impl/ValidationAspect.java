package com.hust.spring.aop.impl;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 可以使用@Order注解指定切面的优先级，值越小优先级越高
 */
@Order(1)
@Aspect
@Component
public class ValidationAspect {

    @Before("com.hust.spring.aop.impl.LoggingAspect.declareJointPointExpression()")
    public void validateArgs(JoinPoint joinPoint){
        System.out.println("-->Validate:" + Arrays.asList(joinPoint.getArgs()));
    }
}
