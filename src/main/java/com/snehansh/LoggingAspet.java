package com.snehansh;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspet {

    @Before("execution(* com.snehansh.ShoppingCart.checkout(..))")
    public void beforeLogger(){
        System.out.println("Before Loggers");
    }
    @After("execution(* *.*.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After Loggers");
    }
}
