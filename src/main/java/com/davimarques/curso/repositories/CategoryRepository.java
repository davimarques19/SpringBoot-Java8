package com.davimarques.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davimarques.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {

}
