package com;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.entity.Account;
import com.entity.AccountPK;
import com.repository.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		AccountRepository accRep = context.getBean(AccountRepository.class);
		/*
		AccountPK ap=new AccountPK();
		ap.setAccId(101);
		ap.setAccType("Saving");
		ap.setAccNum(1234456l);
		
		Account ac=new Account();
		ac.setAccountPk(ap);
		ac.setHoldBranch("Manpur");
		ac.setHoldName("Sunil Kumar");
		
		accRep.save(ac);
		System.out.println("Record Inserted");
		*/
		/*
		AccountPK pk = new AccountPK();
		pk.setAccId(101);         
		pk.setAccType("saving");
		pk.setAccNum(1234456l);
		Optional<Account> findby = accRep.findById(pk);
		System.out.println(findby.get());     
		*/         

	}

}
