package com.davimarques.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davimarques.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {

}
