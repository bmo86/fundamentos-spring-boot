package com.fundamentos.fundamentos.config;

import com.fundamentos.fundamentos.bean.Mybean;
import com.fundamentos.fundamentos.bean.MybeanWithPropeties;
import com.fundamentos.fundamentos.bean.MybeanWithPropetiesImplement;
import com.fundamentos.fundamentos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
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
