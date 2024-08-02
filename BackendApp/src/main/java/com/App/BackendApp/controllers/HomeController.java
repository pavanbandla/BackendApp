package com.App.BackendApp.controllers;

import com.App.BackendApp.model.User;
import com.App.BackendApp.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HomeController {

    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping("/insert")
    public User setUsers(@RequestBody User user){
        return userDetailsService.userDetails(user);
    }

@GetMapping("/details")
    public List<User> getUserDetails(){
        return userDetailsService.getUserDetails();
    }


}
