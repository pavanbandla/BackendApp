package com.App.BackendApp.repository;

import com.App.BackendApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoInterface extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
