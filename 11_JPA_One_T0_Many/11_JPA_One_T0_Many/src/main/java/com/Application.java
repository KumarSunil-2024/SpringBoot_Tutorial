package com;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.entity.Address;
import com.entity.Employee;
import com.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		Employee e = new Employee();
		e.setEmpName("Raja");
		e.setEmpSalary(4000.0);

		Address a1 = new Address();
		a1.setCity("Hyd");
		a1.setState("TG");
		a1.setCountry("India");
		a1.setEmp(e);

		Address a2 = new Address();
		a2.setState("AP");
		a2.setCountry("India");
		a2.setEmp(e);

		List<Address> addrList = Arrays.asList(a1, a2);
		e.setAdd(addrList);
	    EmployeeRepository empRepository = context.getBean(EmployeeRepository.class);
		empRepository.save(e);
		System.out.println("Record.............Inserted");
	}

}
