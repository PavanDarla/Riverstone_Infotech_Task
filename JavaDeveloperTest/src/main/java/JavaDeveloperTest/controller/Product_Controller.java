package JavaDeveloperTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaDeveloperTest.model.Product;
import JavaDeveloperTest.service.Product_Interface;

@RestController
@SuppressWarnings("unused")
public class Product_Controller {

	
	 
	@Autowired
	private Product_Interface product_Interface;
	
	
	//This method is used to Retrieve the All Products
	@GetMapping("/getAllProducts")
	public ResponseEntity<List<Product>>getAllProducts(){
		List<Product>products =	product_Interface.getAllProducts();
		
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
		
	}
	
	
}
