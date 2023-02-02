package com.fundamentos.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentImplementation{

    @Override
    public void SayHello() {
        System.out.println("Hola mundo, desde, Segunda Dependencia");
    }
}
