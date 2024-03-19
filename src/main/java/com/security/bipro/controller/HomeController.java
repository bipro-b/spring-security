package com.security.bipro.controller;


import com.security.bipro.model.User;
import com.security.bipro.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;


@RestController
@RequestMapping("/home")
public class HomeController {


    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test() {

        return "Testing message";
    }

    @GetMapping("/user")
    public List<User> getUSer(){
        return userService.getUsers();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }

}
