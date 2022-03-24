package com.assigment;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*
This class contains all the controllers for the rest api
having methods for get, get by id, post, put and delete by id
We instantiate the service class here to be able to use the query methods.
Some methods contain the responseentity, which in this case is simple used to 
show a http status message when something goes wrong (such as 404 when you 
try to update or delete a non existent customer.
*/

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/customers")
	public List<Customer> list(){
		return service.listAll();
	}
        
        @GetMapping("/customers/{id}")
        public ResponseEntity<Customer> get(@PathVariable Integer id){
            try{
                Customer customer = service.get(id);
                return new ResponseEntity<Customer>(customer, HttpStatus.OK);
            } catch (NoSuchElementException e){
                return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
            }
        }
        
        @PostMapping("/customers")
        public void add(@RequestBody Customer customer){
            service.save(customer);
        }
        
        @PutMapping("/customers/{id}")
        public ResponseEntity<?> update(@RequestBody Customer customer, @PathVariable Integer id){
            try{
            Customer existCustomer = service.get(id);
            service.save(customer);
            return new ResponseEntity<>(HttpStatus.OK);
            } catch (NoSuchElementException e){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
        
        @DeleteMapping("/customers/{id}")
        public void delete(@PathVariable Integer id){
            service.delete(id);
        }
}
