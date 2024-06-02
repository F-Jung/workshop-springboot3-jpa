package com.example.SpringBootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
