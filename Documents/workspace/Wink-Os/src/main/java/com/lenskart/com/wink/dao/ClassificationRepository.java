package com.lenskart.com.wink.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.lenskart.com.wink.model.Classification;

public interface ClassificationRepository extends CrudRepository<Classification, Integer>{
	
	public List<Classification> findAll();
	
	public Classification findOneClassificationById(Integer id);
	
}
