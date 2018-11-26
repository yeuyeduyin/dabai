/**
 * demo
 * */

package com.dabai.springboot.dabaiweb.controller.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Demo")
public class Demo{

    @RequestMapping("hello")
    public String getHello(){
        return "Hello World!!!";
    }

}

