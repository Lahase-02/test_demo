package com.example.com.myrestproject.controllers;
import  static  org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.com.myrestproject.Repository.UserRepository;
import com.example.com.myrestproject.Users.User;

@RestController
public class UserController {
	@Autowired
	UserRepository service;
	@GetMapping(value = "Users")
	 List<User> getAllusers(){
		return service.findAll();
	}
	
	@GetMapping(value="User/{id}")
	  EntityModel<Optional<User>> getOneUser(@PathVariable("id")Integer id){
		Optional<User> user =  service.findById(id);
		EntityModel<Optional<User>> entitymodel = EntityModel.of(user);
		WebMvcLinkBuilder link=	linkTo(methodOn(this.getClass()).getAllusers());
		entitymodel.add(link.withRel("All-links"));
		return entitymodel;
	}
	
	@PostMapping(value="/User")
ResponseEntity<User>  insertUser(@RequestBody User user) {
		
		User savedUser = service.save(user);
		URI location=ServletUriComponentsBuilder.fromCurrentRequestUri().
				path("/{id}").
				buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	@DeleteMapping(value = "/User/{id}")
	 void deleteUserById(@PathVariable ("id") Integer  id ) {
		service.deleteById(id);
	}
	
}
