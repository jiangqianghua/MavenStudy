package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class LogAspect {

    @Pointcut("execution(public * com.springboot.alibaba.AlibabaLogger.log(..))")
    public void aspectLog(){}
//    @Pointcut("execution(public * com.springboot.*.*Logger.log(..))")
//    public void aspectLog(){}

    @Before("aspectLog()")
    public void doBefore(JoinPoint joinPoint){
        System.out.println("before run log");
    }

    @AfterReturning(returning = "ret",pointcut = "aspectLog()")
    public void doAfter(Object ret){
        System.out.println("after run log and return val = " + ret.toString());
    }
}
