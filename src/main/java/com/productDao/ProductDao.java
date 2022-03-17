package com.productDao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.microservices.Product;
	@Repository
public class ProductDao implements ProductDaoInterface{
	@Autowired
	SessionFactory sf;
	@Override
	public void addProductDaoInterface(Product p1) {
		// TODO Auto-generated method stub
		Session session= (Session) sf.getCurrentSession();
		org.hibernate.Transaction t1=session.beginTransaction();
		session.save(p1);
		t1.commit();
	}
	@Override
	public List<Product> getproduct() {
		// TODO Auto-generated method stub
		Session session= (Session) sf.getCurrentSession();
		org.hibernate.Transaction t1=session.beginTransaction();
	List<Product> list=(List<Product>) session.createQuery("from Product").list();
		t1.commit();
		return list;
	}
	@Override
	public boolean deleteproduct(Integer id) {
		// TODO Auto-generated method stub
		Session session= (Session) sf.getCurrentSession();
		org.hibernate.Transaction t1=session.beginTransaction();
		Product p1=(Product) session.get(Product.class, id);
		session.delete(p1);
		t1.commit();
		return true;
	}
	@Override
	public Product getproductid(Integer id) {
		// TODO Auto-generated method stub
		Session session= (Session) sf.getCurrentSession();
		org.hibernate.Transaction t1=session.beginTransaction();
		return (Product) session.get(Product.class,id);
	}
	@Override
	public boolean updateproduct(Product p1) {
		// TODO Auto-generated method stub
		Session session= (Session) sf.getCurrentSession();
		org.hibernate.Transaction t1=session.beginTransaction();
		session.saveOrUpdate(p1);
		t1.commit();
		return true;
	}
	
	
	

}
