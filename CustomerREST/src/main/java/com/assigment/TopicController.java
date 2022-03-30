
package com.assigment;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
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
public class TopicController {
    
    @Autowired
    private TopicService service;
    
    @GetMapping("/topics")
    public List<Topic> list(){
        return service.listAll();
    }
    
    @GetMapping("/topics/{id}")
    public ResponseEntity<Topic> get(@PathVariable Integer id) {
        try{
            Topic topic = service.get(id);
            return new ResponseEntity<Topic>(topic, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Topic>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("/topics")
    public void add(@RequestBody Topic topic){
        service.save(topic);
    }
    
    @PutMapping("/topics/{id}")
    public ResponseEntity<?> update(@RequestBody Topic topic, @PathVariable Integer id){
        try{
            Topic existTopic = service.get(id);
            service.save(topic);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/topics/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
    
}
