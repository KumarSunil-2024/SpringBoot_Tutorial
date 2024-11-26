package com.report;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pdf")
//@Primary
public class PdfReport implements IReport{

	@Override
	public void generate() {
		System.out.println("Constructor::::::::PdfReport");
	}

}
