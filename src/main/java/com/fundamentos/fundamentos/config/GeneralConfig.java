package com.fundamentos.fundamentos.config;

import com.fundamentos.fundamentos.bean.Mybean;
import com.fundamentos.fundamentos.bean.MybeanWithPropeties;
import com.fundamentos.fundamentos.bean.MybeanWithPropetiesImplement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralConfig {
    @Value("${value.name}")
    private String name;

    @Value("${value.lastname}")
    private String lastname;

    @Value("${value.random}")
    private String random;

    @Bean
    public MybeanWithPropeties function(){
        return new MybeanWithPropetiesImplement(name, lastname, random);
    }
}
