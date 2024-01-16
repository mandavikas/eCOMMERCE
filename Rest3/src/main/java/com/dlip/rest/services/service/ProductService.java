package com.dlip.rest.services.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dilip.rest.Entity.Category;
import com.dilip.rest.Entity.Product;
import com.dilip.rest.repository.CategoryRepository;
import com.dilip.rest.repository.ProductRepository;
import com.dlip.rest.services.dto.ProductInformation;

@Service
@Transactional
public class ProductService {

    @Autowired
    ProductRepository repo;

    @Autowired
    CategoryRepository categoryRepository;

    public String addProduct(ProductInformation productInformation) {
        Product product = new Product();

        product.setDescription(productInformation.getDescription());
        product.setName(productInformation.getName());
        product.setPrice(productInformation.getPrice());
        product.setQuantity(productInformation.getQuantity());

        Category category = new Category();
        category.setCategoryName(productInformation.getCategoryName());

        // Save the category first to ensure it exists in the database
        try {
        category = categoryRepository.findById(productInformation.getCategoryName()).get();
        }
        catch(Exception e)
        {
        		return "no category availbe for this";

        }
       
        // Initialize the products list if it's null
        if (category.getProducts() == null) {
            category.setProducts(new ArrayList<>());
        }

        // Add the product to the category's products list
        category.getProducts().add(product);

        // Set the category for the product
        product.setCategory(category);

        // Save the product
         repo.save(product);
         
         return "added succefully";
    }

   
	public List<ProductInformation> getProducts() {
		
		List<Product> product= repo.findAll();
		
		List<ProductInformation> p=new ArrayList<ProductInformation>();
		
		for(Product P   :product)
		{
			ProductInformation pro=new ProductInformation();
			
			pro.setCategoryName(P.getCategory().getCategoryName());
			pro.setDescription(P.getDescription());
			pro.setName(P.getName());
			pro.setPrice(P.getPrice());
			pro.setQuantity(P.getQuantity());
			
			p.add(pro);
		}
		
		return p;
		
	}

    
}
