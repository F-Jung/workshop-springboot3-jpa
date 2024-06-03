package com.example.SpringBootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootProject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
