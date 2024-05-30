package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer{
    private String name = "Default Name"; // default name, can be changed later
    private Address address;

    @Autowired // Field injection
    public void setAddress(Address address) {
        this.address = address;
    }

	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public Address getAddress() {
		return this.address; 
	}
	
	
	

}