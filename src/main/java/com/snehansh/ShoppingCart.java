package com.snehansh;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status){
        System.out.println("Your cheking out is "+status);
    }
}
