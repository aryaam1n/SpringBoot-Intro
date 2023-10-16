package com.springprojects.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//rest controller means that you can have methods associated with different urls
@RestController
public class WelcomeController {

    //this method is associated with the welcome url
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Spring boot world!";
    }

}
