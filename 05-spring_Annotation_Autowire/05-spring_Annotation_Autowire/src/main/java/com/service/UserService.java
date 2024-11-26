package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.report.IReport;

@Service
public class UserService {

	@Autowired
	@Qualifier("excel")
	//private IReport ireport;
	private IReport excelReport;
	
	@Autowired
	@Qualifier("pdf")
	private IReport pdfReport;
	
	public void report() {
		System.out.println("Report Working.........");
		excelReport.generate();
		//System.out.println("Injected SuccessFully...."+ireport.getClass().getName());
	}
}
