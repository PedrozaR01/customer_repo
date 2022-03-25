
package com.assigment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeLevelService {
    
    @Autowired
    private GradeLevelRepository repo;
    
     public List<GradeLevel> listAll(){
		return repo.findAll();
	}
	
	public void save(GradeLevel gradelevel) {
		repo.save(gradelevel);
	}
	
	public GradeLevel get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
