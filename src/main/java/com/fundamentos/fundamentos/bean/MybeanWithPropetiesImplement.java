package com.fundamentos.fundamentos.bean;

public class MybeanWithPropetiesImplement implements MybeanWithPropeties {

    private String name;
    private String lastname;
    private String random;

    public MybeanWithPropetiesImplement(String name, String lastname, String random) {
        this.name = name;
        this.lastname = lastname;
        this.random = random;
    }

    @Override
    public String function() {
        return name + " " + lastname+ " "  + random;
    }
}
