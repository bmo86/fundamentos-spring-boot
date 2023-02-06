package com.fundamentos.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithImplement implements MyBeanWithDependency{

    private final Log LOGGER = LogFactory.getLog(MyBeanWithDependency.class);
    private MyOperation myOperation;

    public MyBeanWithImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("DEPURANDO print DEPENDECY");
        System.out.println(myOperation.sum(12));
        LOGGER.debug("Operation : "+myOperation.sum(12));
        System.out.println("Hola, from the implementation of a bean with dependency");
    }
}
