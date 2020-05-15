package com.davimarques.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davimarques.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
