package com.fundamentos.fundamentos.config;

import com.fundamentos.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public Mybean beanOperation(){
        //here change implementation's
        return new MyBeanTwoImplement();
    }

    @Bean
    public MyOperation beanOperationTwo(){
        //here change implementation's
        return new MyOperationImplementation();
    }

    @Bean
    public MyBeanWithDependency beanOperationTwoWithDependency(MyOperation myOperation) {
        //here change implementation's
        return new MyBeanWithImplement(myOperation);
    }

    }
