package com.example.com.myrestproject.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.com.myrestproject.Users.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	 User save(User user ) ;
	
	 void delete(User User) ;
	 
	 void deleteById(Integer id) ;
		
	 List<User> findAll();
	
		Optional<User> findById(Integer id);
		
		//User findById(Integer id);
		
	
	
}
