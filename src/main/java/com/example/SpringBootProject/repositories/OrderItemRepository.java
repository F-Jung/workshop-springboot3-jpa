package com.example.SpringBootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootProject.entities.OrderItem;
import com.example.SpringBootProject.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
