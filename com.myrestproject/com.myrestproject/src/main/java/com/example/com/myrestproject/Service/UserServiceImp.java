package com.example.com.myrestproject.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.com.myrestproject.Repository.UserRepository;
import com.example.com.myrestproject.Users.User;
@Service
public class UserServiceImp implements IUserService {
   @Autowired
	UserRepository repo;
	
	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<User> findById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	
}

	
	

	


