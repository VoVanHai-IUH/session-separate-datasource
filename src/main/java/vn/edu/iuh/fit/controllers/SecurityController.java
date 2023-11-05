package vn.edu.iuh.fit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

   /* @GetMapping("/login")
    public String login(){
        return "/login";
    }*/
    /*@GetMapping("/home")
    public String home(){
        return "index";
    }*/
    @GetMapping("/x")
    public String x(){
        return "/x";
    }
}
