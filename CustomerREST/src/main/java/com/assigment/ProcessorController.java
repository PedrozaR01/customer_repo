
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

@RestController
public class ProcessorController {
    @Autowired
    private ProcessorService service;
    
    @GetMapping("/processors")
    public List<Processor> list(){
        return service.listAll();
    }
    
    @GetMapping("/processors/{id}")
    public ResponseEntity<Processor> get(@PathVariable Integer id){
        try{
            Processor processor = service.get(id);
            return new ResponseEntity<Processor>(processor, HttpStatus.OK);
        } catch(NoSuchElementException e) {
            return new ResponseEntity<Processor>(HttpStatus.NOT_FOUND);
            
        }
    }
    
    @PostMapping("/processors")
    public void add(@RequestBody Processor processor){
        service.save(processor);
    }
    
    @PutMapping("/processors/{id}")
    public ResponseEntity<?> update(@RequestBody Processor processor, @PathVariable Integer id){
        try{
            Processor existProcessor = service.get(id);
            service.save(processor);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/processors/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
    
}
