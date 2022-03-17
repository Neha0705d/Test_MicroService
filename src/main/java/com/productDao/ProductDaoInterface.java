package com.productDao;

import java.util.List;

import com.microservices.Product;

public interface ProductDaoInterface {

	void addProductDaoInterface(Product p1);

	List<Product> getproduct();

	boolean deleteproduct(Integer id);

	Product getproductid(Integer id);

	boolean updateproduct(Product p1);

}
