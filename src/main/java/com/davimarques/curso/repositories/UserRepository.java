package com.davimarques.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davimarques.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
