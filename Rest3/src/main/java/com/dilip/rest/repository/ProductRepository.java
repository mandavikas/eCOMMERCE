package com.dilip.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.dilip.rest.Entity.Product;

@Component
public interface ProductRepository extends JpaRepository<Product,Integer> {


}
