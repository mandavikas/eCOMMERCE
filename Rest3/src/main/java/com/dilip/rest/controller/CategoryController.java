package com.dilip.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dlip.rest.services.dto.CategoryDto;
import com.dlip.rest.services.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	CategoryService service;
	
	@DeleteMapping("/category/del/{categoryName}")
	public String delCategory(@PathVariable String categoryName)
	{
		return service.delCategory(categoryName);
	}

	@PostMapping("/category/add")
	public String addCategory(@RequestBody CategoryDto category)
	{
		
	   return service.addCategory(category);
	}
}
