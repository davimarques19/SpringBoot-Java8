package com.davimarques.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davimarques.curso.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> fildAll(){
		User u = new User(1L, "João", "joao@gmail.com", "1111122222", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}
