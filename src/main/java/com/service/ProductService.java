package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.Product;
import com.productDao.ProductDaoInterface;
@Service
@Transactional
public class ProductService implements ProductServicenterface {
	@Autowired
	ProductDaoInterface p2;
	@Override
	public void addProductServicenterface(Product p1) {
		// TODO Auto-generated method stub
		p2.addProductDaoInterface(p1);
	}
	@Override
	public List<Product> getproduct() {
		// TODO Auto-generated method stub
		List<Product> list=p2.getproduct();
		return list;
	}
	@Override
	public void deleteproduct(Integer id) {
		// TODO Auto-generated method stub
		p2.deleteproduct(id);
	}
	@Override
	public Product getproductid(Integer obj) {
		// TODO Auto-generated method stub
		return p2.getproductid(obj);
	}
	@Override
	public boolean updateproduct(Product p1) {
		// TODO Auto-generated method stub
		
		return p2.updateproduct(p1);
	}


	
}
