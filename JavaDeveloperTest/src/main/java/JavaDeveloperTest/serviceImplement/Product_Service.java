package JavaDeveloperTest.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaDeveloperTest.model.Product;
import JavaDeveloperTest.repository.Product_Repository;
import JavaDeveloperTest.service.Product_Interface;

@Service
 
public class Product_Service implements Product_Interface {
 	
	@Autowired
	private Product_Repository product_Repository;

	
	
	
	// This is used to Retrieve all the Products from the DataBase
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product>products=	product_Repository.findAll();
		
		return products;
	}

	
	
	// This is used to Save the all Products into BataBase
	@Override
	public void saveAllProducts(List<Product> products) {
		// TODO Auto-generated method stub
		product_Repository.saveAllAndFlush(products);
	}
	
	

}
