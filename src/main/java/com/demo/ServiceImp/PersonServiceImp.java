package com.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.IServices.PersonService;
import com.demo.modelo.Person;
import com.demo.repository.PersonRepository;

@Service
public class PersonServiceImp implements PersonService {

	@Autowired
	private PersonRepository repositorio;
	
	@Override
	public List<Person> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Person listarId(int id) {
		// TODO Auto-generated method stub
		// return repositorio.findOne(id);
		return null;
	}

	@Override
	public Person add(Person p) {
		// TODO Auto-generated method stub
		return repositorio.save(p);
	}

	@Override
	public Person edit(Person p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person listEmail(String email) {
		// TODO Auto-generated method stub
		return repositorio.findByEmail(email);
	}

	
}
