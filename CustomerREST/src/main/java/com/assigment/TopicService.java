
package com.assigment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    
    @Autowired
    private TopicRepository repo;
    
    public List<Topic> listAll(){
		return repo.findAll();
	}
	
	public void save(Topic topic) {
		repo.save(topic);
	}
	
	public Topic get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
