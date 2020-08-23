package com.demo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.demo.modelo.Person;

public interface PersonRepository extends Repository<Person, Integer> {
	
	List<Person> findAll();
	// Person findOne(long id);
	Person findByEmail(String email);
	Person save(Person p);
	void delete(Person p);
	
}
