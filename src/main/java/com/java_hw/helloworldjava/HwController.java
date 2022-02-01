package com.java_hw.helloworldjava;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HwController {

    @RequestMapping(path="/")
    public String hello(){
        return "Hello From Infratute IT Labs";
    }
}