package com.assigment;

import org.springframework.data.jpa.repository.JpaRepository;
/*
this interface implements the jpa repository, which allows us to 
implement query methods. The type will be customer and the id is an Integer
*/
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
