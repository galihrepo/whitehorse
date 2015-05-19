package com.spring.whitehorse.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.whitehorse.model.Person;
import com.spring.whitehorse.repo.PersonRepo;

@RestController
public class SelectMongo {
	
	@Autowired
	private PersonRepo personRepo;
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET, value="/fetch")
	public List<Person> fetch() {
		List<Person> list = new LinkedList<Person>();
		for (Person person : personRepo.findAll()) {
			list.add(person);
		}
		return list;
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST, value="/find")
	public Person findByLastName(
			@RequestParam(value="lastName") String lastName
			) {
		return personRepo.findByLastName(lastName);
	}
}
