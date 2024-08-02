package com.App.BackendApp.controllers;

import com.App.BackendApp.model.User;
import com.App.BackendApp.service.UserDetailsService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
//@RequestMapping("/api")
public class HomeController {

    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping("/insert")
    public ResponseEntity<User> setUser(@RequestBody User user){
        User savedUser = userDetailsService.saveUser(user);
        return ResponseEntity.ok(savedUser);

    }

    @GetMapping("/userDetails")
    public ResponseEntity<User> getUser(@PathVariable String username) {
       User user = userDetailsService.getUserDetails(username);
       if(user != null){
           return ResponseEntity.ok(user);
       }else
           return ResponseEntity.notFound().build();
    }


}
