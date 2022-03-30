
package com.assigment;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GradeLevelController {
    
    @Autowired
    private GradeLevelService service;
    
    @GetMapping("/gradelevel")
    public List<GradeLevel> list() {
        return service.listAll();
    }
    
    @GetMapping("/gradelevel/{id}")
    public ResponseEntity<GradeLevel> get(@PathVariable Integer id){
        try{
            GradeLevel gradelevel = service.get(id);
            return new ResponseEntity<GradeLevel>(gradelevel, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<GradeLevel>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("/gradelevel")
    public void add(@RequestBody GradeLevel gradelevel){
        service.save(gradelevel);
    }
    
    @PutMapping("/gradelevel/{id}")
    public ResponseEntity<?> update(@RequestBody GradeLevel gradelevel, @PathVariable Integer id){
        try{
            GradeLevel existGradeLevel = service.get(id);
            service.save(gradelevel);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/gradelevel/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
    
}
