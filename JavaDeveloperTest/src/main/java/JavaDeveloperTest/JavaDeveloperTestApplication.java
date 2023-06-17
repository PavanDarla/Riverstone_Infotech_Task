package JavaDeveloperTest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import JavaDeveloperTest.model.Product;
import JavaDeveloperTest.repository.Product_Repository;
import JavaDeveloperTest.service.Product_Interface;
@SuppressWarnings("unused")
@SpringBootApplication
public class JavaDeveloperTestApplication implements CommandLineRunner{

	@Autowired
	private Product_Interface product_Interface;
	
	/*
	 * This Method is used to Calculate the Total price
	 * args:List<Product>
	 * return type:double
	 */
	public static double calculateTotalPrice(List<Product> products) {
		double totalPrice = 0;
		for (Product product : products) {
		totalPrice += product.getPrice();
		}
		return totalPrice;
		}
	
	 	
	 
	
	public static void main(String[] args) {
		SpringApplication.run(JavaDeveloperTestApplication.class, args);
	   	 
		 
	}
	
	

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub

	List<Product> productList = new ArrayList<>(); 
	 productList.add(new Product(1, "Product A", 10.0)); 
 productList.add(new Product(2, "Product B", 15.0)); 
 productList.add(new Product(3, "Product C", 20.0)); 

	//this is used to save the products into database
 product_Interface.saveAllProducts(productList);
 
 double totalPrice = calculateTotalPrice(productList);
 System.out.println("Total Price: " + totalPrice);
 
 
 
 
	
}

}
