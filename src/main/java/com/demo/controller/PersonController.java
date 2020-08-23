package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.IServices.PersonService;
import com.demo.modelo.Person;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class PersonController {

	@Autowired
	PersonService service;
	
	@GetMapping
	public List<Person> listar() {
		return service.listar();
	}
	
	@PostMapping
	public Person agregar(@RequestBody Person p) {
		System.out.print("add person email "+ p.getEmail());
		System.out.print("\n");
		// System.out.print("get Father email "+ p.getPersonFather().getEmail());
		
		Person father = service.listEmail(p.getPersonFather().getEmail());
		Person mother = service.listEmail(p.getPersonMother().getEmail());
		p.setPersonFather(father);
		p.setPersonMother(mother);
		return service.add(p);
	}
}
