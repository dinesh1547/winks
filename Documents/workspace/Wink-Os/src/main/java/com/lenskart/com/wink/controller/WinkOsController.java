/**
 * 
 */
package com.lenskart.com.wink.controller;

import org.apache.log4j.Logger;
import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiAuthNone;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.jsondoc.core.annotation.ApiResponseObject;
import org.jsondoc.core.annotation.ApiVersion;
import org.jsondoc.core.pojo.ApiStage;
import org.jsondoc.core.pojo.ApiVisibility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lenskart.com.wink.model.Classification;
import com.lenskart.com.wink.service.ClassificationService;

/**
 * This class is used to get return accessories associated with a particular
 * brand
 * 
 * @author dinesh
 *
 */
@Api(name = " Accesories APIs", description = "Product Accessories API", group = "Catalog", visibility = ApiVisibility.PUBLIC, stage = ApiStage.RC)
@ApiVersion(since = "1.0", until = "2.0")
@ApiAuthNone
@RestController
@RequestMapping(value = "/")
public class WinkOsController  {

	
	

	/**
	 * 
	 * @param productId
	 *            unique identifier for product
	 * @return Product Model object for associated productId
	 * @throws Exception
	 */

	@ApiMethod(path = "classification-id/{id}", description = "Get Product ", produces = {
			MediaType.APPLICATION_JSON_VALUE }, responsestatuscode = "200- if success <br/> 404 - in case if given parameters are incorrect")
	@RequestMapping(value = "classification-id/{id}", method = RequestMethod.GET)
	public @ApiResponseObject Classification getClassificationById(@PathVariable @ApiPathParam(name = "id", description = "classification Id") Integer id)  {
	
		return classificationService.getClassificationById(id);
	}

	

	

	@Autowired
	private ClassificationService classificationService;

	private static final Logger logger = Logger.getLogger(WinkOsController.class.getName());

}
