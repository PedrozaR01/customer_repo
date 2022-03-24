package com.assigment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessorService {
    
    @Autowired
    private ProcessorRepository repo;
    
    public List<Processor> listAll(){
        return repo.findAll();
    }
    
    public void save(Processor processor){
        repo.save(processor);
    }
    
    public Processor get(Integer id){
        return repo.findById(id).get();
    }
    
    public void delete(Integer id){
        repo.deleteById(id);
    }
}
