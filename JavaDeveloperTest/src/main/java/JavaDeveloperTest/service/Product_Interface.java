package JavaDeveloperTest.service;

import java.util.List;

import JavaDeveloperTest.model.Product;

public interface Product_Interface {

	public List<Product>getAllProducts();
	
	public void saveAllProducts(List<Product> products);
}
