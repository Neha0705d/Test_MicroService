package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.microservices.Product;
import com.service.ProductServicenterface;
@Controller
public class ProductController {
	@Autowired
	private ProductServicenterface psi;
	@RequestMapping("Homepage")
	public String home()
	{
		System.out.println(" OPENNG HOME PAGE");
		return "home";
		
	}
	@RequestMapping(method=RequestMethod.POST, value="addproduct")
	public ModelAndView addproduct(@ModelAttribute Product p1)
	{
		psi.addProductServicenterface(p1);
		return new ModelAndView ("home");
		
	}
	@RequestMapping(value="aboutpage")
	public ModelAndView getproduct()
	{
		List<Product> list=psi.getproduct();
		ModelAndView model= new ModelAndView();
		model.addObject("list", list);
		model.setViewName("about");
		return model;
		
	}
	@RequestMapping(value="deleteproduct")
	public ModelAndView deleteproduct(@ModelAttribute Product p1)
	{
		Integer id=p1.getId();
		psi.deleteproduct(id);
		ModelAndView model= new ModelAndView();
		List<Product> list=psi.getproduct();
		model.addObject("list", list);
		model.setViewName("about");
		
		return model;
		
	}
	@RequestMapping(value="updateproduct")
	public ModelAndView getproductid(@ModelAttribute Product p1 )
	{
		Integer obj=p1.getId();
		Product p2=(Product) psi.getproductid(obj);
		ModelAndView model= new ModelAndView("updateproduct");
		model.addObject("Product", p2);
		
		return model;
		
	}
	@RequestMapping(value="updateproduct", method=RequestMethod.POST)
	public ModelAndView updateproduct(@ModelAttribute Product p1)
	{
		
		psi.updateproduct(p1);
		List<Product> list=(List<Product>)psi.getproduct();
		ModelAndView model= new ModelAndView();
		model.addObject("list", list);
		model.setViewName("about");
		return model;
		
	}

}
