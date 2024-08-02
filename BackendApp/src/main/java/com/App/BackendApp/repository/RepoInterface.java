package com.App.BackendApp.repository;

import com.App.BackendApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoInterface extends JpaRepository<User, Long> {



}
