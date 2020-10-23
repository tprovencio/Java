package com.dojo.ideas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dojo.ideas.models.Idea;
import com.dojo.ideas.repos.IdeaRepo;

@Service
public class IdeaService {
private final IdeaRepo ideaRepo;
	public IdeaService(IdeaRepo ideaRepo) {
		this.ideaRepo = ideaRepo;
	}
	
	public List<Idea> allIdeas(){
		return ideaRepo.findAll();
	}
	
	public Idea createIdea(Idea i) {
		return ideaRepo.save(i);
	}
	
	public Idea findIdea(Long id) {
		Optional<Idea> optionalIdea = ideaRepo.findById(id);
		if(optionalIdea.isPresent()) {
            return optionalIdea.get();
        } else {
            return null;
		
	}
	}
	public void delete(Long id) {
		ideaRepo.deleteById(id);
	}
}


