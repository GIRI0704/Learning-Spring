package com.spring.Learn_Spring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this annotation tells that this is rest controller which always returns some values
 * This is inbuilt @component
 **/
@RestController
public class HellowController {

    @GetMapping("/hi")
    public String sayHi(){
        return "Say Hi";
    }
}
