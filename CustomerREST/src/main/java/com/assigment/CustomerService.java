package com.assigment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
This is the service class, the @service annotations simply indicates 
that this class belongs to the service layers of a bussineess application
we create an instance of the repository as repo.
Then, using repo we can call the methods that provide us with queries.
We got 4 methods, get all (listAll), post(save), get and delete
*/

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	public List<Customer> listAll(){
		return repo.findAll();
	}
	
	public void save(Customer customer) {
		repo.save(customer);
	}
	
	public Customer get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
