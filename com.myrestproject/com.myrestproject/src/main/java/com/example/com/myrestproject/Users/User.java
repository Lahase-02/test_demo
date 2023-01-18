package com.example.com.myrestproject.Users;



import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Component
@Entity
@Table(name = "User2")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String Name;
	private Timestamp  birthDATETIME ;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Timestamp  getBirthDATETIME () {
		return birthDATETIME ;
	}
	public void setBirthDATETIME (Timestamp  birthDATETIME ) {
		this.birthDATETIME  = birthDATETIME ;
	}

}
