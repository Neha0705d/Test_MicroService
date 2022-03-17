package com.service;

import java.util.List;

import com.microservices.Product;

public interface ProductServicenterface {

	void addProductServicenterface(Product p1);

	List<Product> getproduct();

	void deleteproduct(Integer id);

	Product getproductid(Integer obj);

	boolean updateproduct(Product p1);

}
