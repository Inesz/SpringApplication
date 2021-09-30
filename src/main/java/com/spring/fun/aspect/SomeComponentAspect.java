package com.spring.fun.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SomeComponentAspect {
    @Before("execution(* com.spring.fun.aspect.Person.*(..))")
    public void beforePerson() throws Throwable {
        System.out.println("before Person");
    }

    @Before("execution(* com.spring.fun.aspect.EmployeeComponent.*(..))")
    public void beforeEmployeeComponent() throws Throwable {
        System.out.println("before Employee");
    }

    @After("@annotation(SomeAnnotation) && execution(* *(..))")
    public void afterAnnotation() throws Throwable {
        System.out.println("after annotation");
    }
}
