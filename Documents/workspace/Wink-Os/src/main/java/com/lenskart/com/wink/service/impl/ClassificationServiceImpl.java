package com.lenskart.com.wink.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lenskart.com.wink.dao.ClassificationRepository;
import com.lenskart.com.wink.model.Classification;
import com.lenskart.com.wink.service.ClassificationService;


@Service
public class ClassificationServiceImpl implements ClassificationService{

	
	@Override
	public List<Classification> getAllClassification() {
		List<Classification> classificationNames = classificationRepository.findAll();
		return classificationNames;
		
	}

	
	@Autowired
	private ClassificationRepository classificationRepository;
	private static final Logger logger = Logger.getLogger(ClassificationServiceImpl.class.getName());
	@Override
	public Classification getClassificationById(Integer id) {
		return classificationRepository.findOneClassificationById(id);
	}

}
