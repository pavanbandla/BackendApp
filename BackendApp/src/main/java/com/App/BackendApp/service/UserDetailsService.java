package com.App.BackendApp.service;

import com.App.BackendApp.model.User;
import com.App.BackendApp.repository.RepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsService {
    @Autowired
    private RepoInterface repoInterface;


    public User userDetails(User user) {
        return repoInterface.save(user);
    }

    public List<User> getUserDetails() {
        return repoInterface.findAll();
    }
}
