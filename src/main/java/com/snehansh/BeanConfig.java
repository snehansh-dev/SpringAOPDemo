package com.snehansh;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.snehansh")
@EnableAspectJAutoProxy
public class BeanConfig {
}
