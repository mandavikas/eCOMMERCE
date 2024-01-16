package com.dilip.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilip.rest.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category,String> {

	Category findByCategoryName(Category category);

}
