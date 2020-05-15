package com.davimarques.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davimarques.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

}
