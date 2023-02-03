package com.fundamentos.fundamentos.controller;

import com.fundamentos.fundamentos.bean.MybeanWithPropeties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestConstroller {
    private MybeanWithPropeties mybeanWithPropeties;

    public TestConstroller(MybeanWithPropeties mybeanWithPropeties) {
        this.mybeanWithPropeties = mybeanWithPropeties;
    }

    @RequestMapping
    @ResponseBody
    public ResponseEntity<String> function(){

        return new ResponseEntity<>(mybeanWithPropeties.function(), HttpStatus.OK);
    }
}
