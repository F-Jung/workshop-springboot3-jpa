package com.example.SpringBootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootProject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
