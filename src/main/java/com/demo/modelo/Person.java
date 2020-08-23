package com.demo.modelo;

import javax.persistence.*;

@Entity
@Table(name="Person")
public class Person {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String lastname;
	
	@Column
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_father", referencedColumnName = "id", nullable = true)
	private Person personFather;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_mother", referencedColumnName = "id", nullable = true)
	private Person personMother;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Person getPersonFather() {
		return personFather;
	}

	public void setPersonFather(Person personFather) {
		this.personFather = personFather;
	}

	public Person getPersonMother() {
		return personMother;
	}

	public void setPersonMother(Person personMother) {
		this.personMother = personMother;
	}
	
	
}
