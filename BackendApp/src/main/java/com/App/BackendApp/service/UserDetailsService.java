package com.App.BackendApp.service;

import com.App.BackendApp.model.User;
import com.App.BackendApp.repository.RepoInterface;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Data
@Service
public class UserDetailsService {
    @Autowired
    private RepoInterface repoInterface;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repoInterface.save(user);
    }

    public User getUserDetails(String username) {
        return repoInterface.findByUsername(username);
    }
}
