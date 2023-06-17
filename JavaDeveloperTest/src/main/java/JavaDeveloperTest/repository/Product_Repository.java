package JavaDeveloperTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import JavaDeveloperTest.model.Product;

public interface Product_Repository extends JpaRepository<Product, Integer> {

}
