package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ReportDAO;

@Service
public class ReportService {

	private ReportDAO reportDao;
	

	public ReportService() {
		System.out.println("0-Param Constructor");
	}
	@Autowired
	public void setReportDAO(ReportDAO reportDao) {
		System.out.println("Setter Method");
		this.reportDao=reportDao;
	}
	
//	public ReportService() {
//        this.reportDao = new ReportDAO(); // Ensure reportDao is instantiated
//    }
//	

	@Autowired
	 public ReportService(ReportDAO reportDao) { // Constructor injection
	        this.reportDao = reportDao;
         System.out.println("Param Constructor");
	    }
	
	public void printName(Integer userId) {
		String nameById=reportDao.getData(userId);
		System.out.println(nameById);
	}
}
