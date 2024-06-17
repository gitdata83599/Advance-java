package com.sunbeam.dao;

import java.time.LocalDate;
import java.util.List;

import com.sunbeam.entities.Category;
import com.sunbeam.entities.Product;

public interface ProductDao {
	String signUp(Product product);
	Product getProductDetailsbyId(Long productId);
	
	//display products
	List<Product> getAllProducts();
	
	String applyDiscount(Category category,double discount);
      
	//delete user details
	String deleteUserDetails(Long productId);
}
