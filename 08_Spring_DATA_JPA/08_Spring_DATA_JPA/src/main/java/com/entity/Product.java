package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.TableGenerator;

@Entity
public class Product {

	@Id
	//@SequenceGenerator(name="pid",sequenceName="pid_sequ")
	@TableGenerator(initialValue=100,name="pid",table="pid_seq_table")
	@GeneratedValue(strategy=GenerationType.TABLE,generator="pid")
	private Integer pid;
	private String pName;
	private Double pPrice;
	
	public Product(){
		
	}

	public Product(Integer pid, String pName, Double pPrice) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.pPrice = pPrice;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Double getpPrice() {
		return pPrice;
	}

	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	
}

