package com.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_dts")
public class Student {

	@Id
	@Column(name="sId")
	private Integer id;
	
	@Column(name="sName")
	private String name;
	
	@Column(name="sRank")
	private Long rank;
	
	@Column(name="sGender")
	private String gender;
	
	@Column(name="ACTIVE_SW")
	private String activeS;
	
	@CreationTimestamp
	@Column(name="Created_Date",updatable=false)
	private LocalDate createDate;
	
	@CreationTimestamp
	@Column(name="Updated_Date",insertable=false)
	private LocalDate updateDate;
	public Student() {
		
	}
	public Student(Integer id, String name, Long rank, String gender, String activeS) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.gender = gender;
		this.activeS = activeS;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getRank() {
		return rank;
	}
	public void setRank(Long rank) {
		this.rank = rank;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getActiveS() {
		return activeS;
	}
	public void setActiveS(String activeS) {
		this.activeS = activeS;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public LocalDate getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + ", gender=" + gender + ", activeS=" + activeS
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}
	
	
}
