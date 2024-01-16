package com.dilip.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dilip.rest.Entity.Product;
import com.dlip.rest.services.dto.ProductInformation;
import com.dlip.rest.services.service.ProductService;

@RestController
public class ProductController
{
	@Autowired
	ProductService service;
	
	@PostMapping("/product/add")
	public String addProduct(@RequestBody ProductInformation productinformation)
	{
		return service.addProduct(productinformation);
		
		
	}
	
	@GetMapping("/product/get")
	public List<ProductInformation> getProucts() {
	    // This line prints the list of products to the console
	    System.out.println(service.getProducts());

	    // This line returns the list of products, which gets automatically serialized to JSON
	    return service.getProducts();
	}

	
}