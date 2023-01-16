package com.snehansh;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspet {

    @Before("execution(* com.snehansh.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp){
        System.out.println(jp.getSignature());
        System.out.println(Arrays.toString(jp.getArgs()));
        System.out.println("Before Loggers");
    }
    @After("execution(* *.*.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After Loggers");
    }

    @Pointcut("execution(* com.snehansh.ShoppingCart.checkout(..)))")
    public void afterReturningPointCut(){

    }
    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning: "+retVal);
    }
}
