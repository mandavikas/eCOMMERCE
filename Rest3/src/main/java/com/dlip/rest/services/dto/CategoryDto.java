package com.dlip.rest.services.dto;

public class CategoryDto {
	
	String CategoryName;
	String CategoryDescription;
	
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public String getCategoryDescription() {
		return CategoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		CategoryDescription = categoryDescription;
	}
	@Override
	public String toString() {
		return "CategoryDto [CategoryName=" + CategoryName + ", CategoryDescription=" + CategoryDescription + "]";
	}
	
	

}
