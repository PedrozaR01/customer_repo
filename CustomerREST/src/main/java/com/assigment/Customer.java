package com.assigment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
This file contains all the data that goes into the table in the database of the same name
the @Entity anotation indicates that the class represents data stored in a database
the @Id annotation simply points to the id
the class also has getters and setter for each field variable
*/

@Entity
public class Customer {
    
        @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
	private String email;
	private String firstName;
	private String lastName;
	private String zipCode;
	private String gradeLevel;
	private String topicId;
	private String customerDescription;

	public Customer() {
	}

	public Customer(Integer customerId, String email, String firstName, String lastName, String zipCode,
			String gradeLevel, String topicId, String customerDescription) {
		
		this.customerId = customerId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.zipCode = zipCode;
		this.gradeLevel = gradeLevel;
		this.topicId = topicId;
		this.customerDescription = customerDescription;
	}

	
	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public String getCustomerDescription() {
		return customerDescription;
	}

	public void setCustomerDescription(String customerDescription) {
		this.customerDescription = customerDescription;
	}

}