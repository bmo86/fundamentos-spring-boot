package com.fundamentos.fundamentos.bean;

public class MyBeanWithImplement implements MyBeanWithDependency{

    private MyOperation myOperation;

    public MyBeanWithImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        System.out.println(myOperation.sum(12));
        System.out.println("Hola, from the implementation of a bean with dependency");
    }
}
