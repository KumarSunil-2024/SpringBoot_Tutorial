package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
	
	@Query(value="call getProducts()",nativeQuery=true)
	public List<Product> getAllProduct();
	
	/*
	 DELIMITER $$

CREATE PROCEDURE getProducts()
BEGIN
    SELECT * FROM PRODUCT;
END$$

DELIMITER ;

-- Calling the stored procedure
CALL getProducts();

	 */

}
