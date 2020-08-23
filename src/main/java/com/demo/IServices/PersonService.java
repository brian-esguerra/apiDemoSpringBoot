package com.demo.IServices;

import java.util.List;

import com.demo.modelo.Person;

public interface PersonService {

	List<Person> listar();
	Person listarId(int id);
	Person listEmail(String email);
	Person add(Person p);
	Person edit(Person p);
	Person delete(int id);
	
}
