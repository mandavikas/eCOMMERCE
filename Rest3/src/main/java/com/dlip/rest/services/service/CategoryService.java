package com.dlip.rest.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dilip.rest.Entity.Category;
import com.dilip.rest.repository.CategoryRepository;
import com.dlip.rest.services.dto.CategoryDto;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository repo;

	public String delCategory(String categoryName) {
		
	   repo.deleteById(categoryName);
		
	   return "deleted succefuly";
	}

	public String addCategory(CategoryDto category) {
		
	    Category category1 = new Category();

		
		category1.setCategoryName(category.getCategoryName());
	    category1.setDescription(category.getCategoryDescription());
	    
	    
	    repo.save(category1);

	    return "Added successfully";
	}
	
	
	

}
