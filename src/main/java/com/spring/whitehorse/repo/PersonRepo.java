package com.spring.whitehorse.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.whitehorse.model.Person;

@RepositoryRestResource
public interface PersonRepo extends MongoRepository<Person, String> {

	public Person findByLastName(String lastName);
	
}
