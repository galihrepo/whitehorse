package com.spring.whitehorse.model;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "person")
public class Person {
	
	@Id
	private String id;
	
	// unique data
	@Indexed(unique=true)
	private String firstName;
	
	// unique data
	@Indexed(unique=true)
	private String lastName;
	
	// used for automatic create date and modified date in mongodb 
	// related with @EnableMongoAuditing
	@CreatedDate
    private DateTime created;
	
    @LastModifiedDate
    private DateTime modified;
    
	private String address;
	private String country;

	public String getCountry() {
		return country;
	}
	public String getId() {
		return id;
	}
	public String getAddress() {
		return address;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
