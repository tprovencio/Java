package com.dojo.ideas.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo.ideas.models.Idea;

@Repository
public interface IdeaRepo extends CrudRepository<Idea, Long>{
	List<Idea> findAll();
	
	Long deleteByNameStartingWith(String search);

}
