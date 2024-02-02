package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
public static void generateJvmReport(String jsonPath) {
	//Business Logic
	//1. Mention the target folder
	File f = new File(System.getProperty("user.dir")+"\\target\\Report\\JvmReport");
	
	//2. Add details to the report using Configuration Class
	Configuration con = new Configuration(f, "Courts");
	con.addClassifications("Domain", "E-Commerce");
	con.addClassifications("Browser", "Egde");
	con.addClassifications("Browser Version", "119");
	con.addClassifications("OS", "Windows");
	con.addClassifications("Windows Version", "Windows 10");
	
	//3. Add json file paths into List<String>
	List<String> li = new ArrayList<String>();
	li.add(jsonPath);
	//4. Create object for ReportBuilder Class
	ReportBuilder r = new ReportBuilder(li, con);
	r.generateReports();

}
}
