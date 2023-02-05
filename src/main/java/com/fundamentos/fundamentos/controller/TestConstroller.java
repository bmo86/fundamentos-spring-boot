package com.fundamentos.fundamentos.controller;

import com.fundamentos.fundamentos.bean.MybeanWithPropeties;
import com.fundamentos.fundamentos.pojo.UserPojo;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestConstroller {
    private MybeanWithPropeties mybeanWithPropeties;
    private UserPojo userPojo;
    public TestConstroller(MybeanWithPropeties mybeanWithPropeties, UserPojo userPojo) {
        this.mybeanWithPropeties = mybeanWithPropeties;
        this.userPojo = userPojo;
    }

    @RequestMapping
    @ResponseBody
    public ResponseEntity<String> function(){

        return new ResponseEntity<>("Email :"+userPojo.getEmail() + "<br> Pass :" +  userPojo.getPass() + "<br> Age: " + userPojo.getAge(), HttpStatus.OK);
    }
}
