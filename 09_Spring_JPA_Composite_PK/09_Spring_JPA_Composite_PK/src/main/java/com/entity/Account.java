package com.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Account {

	private String holdName;
	private String holdBranch;
	
	@EmbeddedId
	private AccountPK accountPk;
	
	public Account() {
		
	}

	public Account(String holdName, String holdBranch, AccountPK accountPk) {
		super();
		this.holdName = holdName;
		this.holdBranch = holdBranch;
		this.accountPk = accountPk;
	}

	public String getHoldName() {
		return holdName;
	}

	public void setHoldName(String holdName) {
		this.holdName = holdName;
	}

	public String getHoldBranch() {
		return holdBranch;
	}

	public void setHoldBranch(String holdBranch) {
		this.holdBranch = holdBranch;
	}

	public AccountPK getAccountPk() {
		return accountPk;
	}

	public void setAccountPk(AccountPK accountPk) {
		this.accountPk = accountPk;
	}

	@Override
	public String toString() {
		return "Account [holdName=" + holdName + ", holdBranch=" + holdBranch + ", accountPk=" + accountPk + "]";
	}
	
}
