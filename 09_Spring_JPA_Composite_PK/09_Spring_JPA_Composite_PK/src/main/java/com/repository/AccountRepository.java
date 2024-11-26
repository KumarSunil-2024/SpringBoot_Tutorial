package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Account;
import com.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account,AccountPK>{

}
