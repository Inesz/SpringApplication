package com.spring.fun.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.concurrent.TimeUnit;

@Aspect
public class SomeAspect {

    @Pointcut("execution(* com.spring.fun.aspect.Computation.compute())")
    public void computationMethod() {
        //define pointcut
    }

    @Around("execution(* com.spring.fun.aspect.Computation.compute())")
    public int measureMethodExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        int returnValue = (int) joinPoint.proceed();
        long end = System.nanoTime();
        System.out.println(String.format("Execution of %s took %d ms and %d tries.", joinPoint.getSignature().getName(), TimeUnit.NANOSECONDS.toMillis(end - start), returnValue));
        return returnValue;
    }

    @Before("computationMethod()")
    public void startComputation() throws Throwable {
        System.out.println("Computation begin");
    }

    @Before("execution(* com.spring.fun.aspect.EmployeeComponent.*(..))")
    public void employeeFound() throws Throwable {
        System.out.println("Employee found");
    }
}
