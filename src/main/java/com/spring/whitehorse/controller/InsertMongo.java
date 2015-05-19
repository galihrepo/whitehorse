package com.spring.whitehorse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.whitehorse.model.Person;
import com.spring.whitehorse.repo.PersonRepo;

@RestController
public class InsertMongo {

	@Autowired
	private PersonRepo personRepo;
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST, value="/insert")
	public Person insert(
			@RequestParam(value="firstName") String firstName,
			@RequestParam(value="lastName") String lastName,
			@RequestParam(value="address") String address,
			@RequestParam(value="country") String country
			) {
		
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddress(address);
		person.setCountry(country);
		
//		personRepo.save(person);
		personRepo.insert(person);
		
		return person;
	}
}
