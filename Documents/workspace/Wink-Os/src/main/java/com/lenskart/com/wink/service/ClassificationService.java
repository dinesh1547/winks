package com.lenskart.com.wink.service;

import java.util.List;

import com.lenskart.com.wink.model.Classification;

public interface ClassificationService {
	/**
	 * 
	 * @return all classification available
	 */
	public List<Classification> getAllClassification();
	/**
	 * 
	 * @param id
	 * @return classification name by classificationId
	 * @throws CatalogException
	 * @throws Exception
	 */
	public Classification getClassificationById(Integer id) ;
}
