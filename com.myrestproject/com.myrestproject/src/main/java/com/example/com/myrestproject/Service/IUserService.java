package com.example.com.myrestproject.Service;

import java.util.List;
import java.util.Optional;

import com.example.com.myrestproject.Users.User;

public interface IUserService {
	User save(User user ) ;
	void deleteById(Integer id) ;
	List<User> findAll();
	Optional<User> findById(Integer id);
	
	
}
