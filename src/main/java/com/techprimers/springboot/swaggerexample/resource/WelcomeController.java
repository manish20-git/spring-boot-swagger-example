package com.techprimers.springboot.swaggerexample.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/welcome")
public class WelcomeController {

    public String welcome()
    {
        return "Welcome Manish Mansare";
    }

}
