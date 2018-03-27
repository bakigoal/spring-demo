package com.bakigoal.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect {

    @Before("@annotation(com.bakigoal.aop.aspect.Loggable)")
    public void myAdvice(){
        System.out.println("Executing myAdvice!!");
    }
}
