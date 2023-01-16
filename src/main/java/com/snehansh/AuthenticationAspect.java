package com.snehansh;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(com.snehansh..*)")
    public void authenticationPointCut(){

    }

    @Pointcut("within(com.snehansh..*)")
    public void authorizationPintCut(){

    }

    @Before("authenticationPointCut() && authorizationPintCut()")
    public void authenticate(){
        System.out.println("Authenticating the request");
    }

}
