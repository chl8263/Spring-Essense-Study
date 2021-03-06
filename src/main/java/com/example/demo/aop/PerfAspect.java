package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

    //@Around("execution(* com.example..*.EventService.*(..))")
    @Around("@annotation(PerfLogging)")
    public Object lingPerf(ProceedingJoinPoint joinPoint) throws Throwable{

        long begin = System.currentTimeMillis();
        Object retVal = joinPoint.proceed();
        System.out.println(System.currentTimeMillis() - begin);

        return retVal;
    }

    @Before("bean(simpleEventService)")
    public void hello(){
        System.out.println("before");
    }
}
