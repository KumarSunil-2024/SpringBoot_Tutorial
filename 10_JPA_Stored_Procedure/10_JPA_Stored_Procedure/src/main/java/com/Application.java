package com;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.entity.Product;
import com.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		ProductRepository pRe = context.getBean(ProductRepository.class);
		List<Product> pr = pRe.getAllProduct();
		pr.forEach(System.out::println);
	}

}
