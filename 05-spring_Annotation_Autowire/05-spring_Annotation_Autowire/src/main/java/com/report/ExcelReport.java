package com.report;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReport implements IReport{

	@Override
	public void generate() {
		System.out.println("Constructor::::::::ExcelReport");
	}

}
