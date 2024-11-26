package com;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.hibernate.query.Page;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.entity.Product;
import com.entity.Student;
import com.repository.ProductRepository;
import com.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		StudentRepository sRe=context.getBean(StudentRepository.class);
		/*
		System.out.println(sRe.getClass().getName());
		Student s1=new Student();
		s1.setId(102);
		s1.setName("Ragni Kumari");
		s1.setRank(2L);
		s1.setGender("FeMale");
		System.out.println("Record.............Inserted");
		*/
		//Iterable<Student> findall=sRe.findAll();
		//findall.forEach(System.out::println);
		//findall.forEach(s ->System.out.println(s));
		//sRe.deleteById(102);
		//System.out.println("Record.............Deleted");
		
		/*
		Student s1 = new Student(107, "John", 80L, "Male");
		Student s2 = new Student(102, "Alice", 90L, "Female");
		Student s3 = new Student(103, "Orlen", 90L, "Male");
		Student s4 = new Student(104, "Cathy", 100L, "Female");
		Student s5 = new Student(105, "Buttler", 70L, "Male");
		Student s6 = new Student(106, "Smitha", 60L, "Female");

		// Creating a list of students
		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6);

		// Saving all students to the repository
		sRe.saveAll(students);
		*/
		/*
		List<Student> st=sRe.getStudent();
		st.forEach(System.out::println);
		*/
		/*
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Page Number: ");
        int pageNo = s.nextInt();
        
        System.out.print("Enter Page Size: ");
        int pageSize = s.nextInt();
		PageRequest page=PageRequest.of(pageNo-1, pageSize);
		org.springframework.data.domain.Page<Student> findall = sRe.findAll(page);
		List<Student> students=findall.getContent();
		students.forEach(System.out::println);
		
	    */
		
		//List<Student> students = sRe.findAll(Sort.by("name").descending());
		/*
		Student s1=new Student();
		s1.setGender("Male");
		Example<Student> stu = Example.of(s1);
		List<Student> students = sRe.findAll(stu);
		students.forEach(System.out::println);
		*/
		/*
		sRe.insertStudent(106,"Ritik", "Male");
		System.out.println("Delete Successfull");
		*/
		/*
		Student s1=new Student(101,"Sunil",1l,"Male","Y");
		sRe.save(s1);
		System.out.println("Insert Successfull");
		*/
		ProductRepository pRe=context.getBean(ProductRepository.class);
		Product p1=new Product();
		p1.setpName("Earbud");
		p1.setpPrice(10000d);
		pRe.save(p1);
		System.out.println("Insert Successfull");
	}

}
