package org.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class JvmReport {
	public static void getJvmReport(String jvmpath,String jsonpath) {
		//file creation - target location
		File F = new File(jvmpath);
		
		// add details to the report using Configuration class
		Configuration c = new Configuration(F, "Threadless");
		c.addClassifications("application", "threadless");
		c.addClassifications("Done by", "venkat");
		c.addClassifications("platform", "chromebrowser");
		
		
		// add the json path into list
		List<String> L = new ArrayList();
		L.add(jsonpath);
		
		//to generate report by usin generateareports()---m
		ReportBuilder r = new ReportBuilder(L, c);
		Reportable R = r.generateReports();
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
