package controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AuthController {

    // handler method to handle home page request
    @GetMapping("/index")
    public String home(){
        return "index";
    }
}
