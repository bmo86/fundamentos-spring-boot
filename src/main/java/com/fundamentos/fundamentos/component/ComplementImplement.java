package com.fundamentos.fundamentos.component;

import org.springframework.stereotype.Component;
@Component
public class ComplementImplement implements ComponentImplementation{
    @Override
    public void SayHello() {
        System.out.println("Hola Mundo");
    }
}
