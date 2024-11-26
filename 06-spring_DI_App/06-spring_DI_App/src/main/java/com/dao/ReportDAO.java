package com.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDAO {

	public String getData(Integer id) {
		if(id==100) {
			return "Sunil";
		}else if(id==101) {
			return "Kumar";
		}else {
			return "Name Not Found";
		}
	}
}
