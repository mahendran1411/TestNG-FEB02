package org.testing;
// AMAZON SEARCH PRODUCT
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class TestNgExample1 extends BaseClass {
@BeforeClass
public void LaunchBrowser(){
	launchEdge();
	winMax();
}
@AfterClass
public void BrowserClose() {
	closeEdge();

}
@BeforeMethod
public void StartTime() {
	loadUrl("https://www.amazon.in/");
	Date d = new Date();
	System.out.println("Start Time: "+d);

}
@AfterMethod
private void EndTime() {
	Date d = new Date();
	System.out.println("EndTime: "+d);

}
@Test//(enabled=false)
private void Test1() {
	LoginPojo l = new LoginPojo();
	fill(l.getAmazonsearchbox(), "sony home theater");
	btnClick(l.getAmazonsearchclick());

}
@Test
private void Test2() {
	LoginPojo l = new LoginPojo();
	btnClick(l.getAmazonsignin());
	fill(l.getAmazonsignphone(), "12345");
	btnClick(l.getAmazonsigncontinue());

}
}
