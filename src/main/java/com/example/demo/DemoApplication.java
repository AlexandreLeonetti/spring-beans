package com.example.demo;
/*
 * https://start.spring.io/
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext apc =SpringApplication.run(DemoApplication.class, args);
		for (String s : apc.getBeanDefinitionNames() ) {
			System.out.println(s);
		}
    // Accessing Customer bean to check the dependency injection
    Customer customer = apc.getBean(Customer.class);
    System.out.println("Customer Name: " + customer.getName());
    System.out.println("Customer Address: " + customer.getAddress());
    
	Customer jd = new Customer();
	jd.setName("John Doe"); 
	System.out.println("JD name is : "+jd.getName());
	}
	

	

}
