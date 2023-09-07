package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles",glue="org.Step",dryRun=false
,strict=true,tags= {"@valid or @payment"},plugin= {"pretty",
"json:C:\\Users\\DELL\\eclipse-workspace\\Threadlesscucumber\\All reports\\JsonReport\\Th.json"}
)
public class RunnerAll {
	@AfterClass
	public static void tc1() {
		JvmReport.getJvmReport("All reports\\JVMReport", "All reports\\JsonReport\\Th.json");
		
		
		
		
		
		
	}
	
		

	}
	


