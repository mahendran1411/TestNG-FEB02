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
public void LaunchBrowser() {
	launchChrome();
	winMax();

}
@AfterClass
public void BrowserClose() {
	closeChrome();

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
@Test
private void Test() {
	LoginPojo l = new LoginPojo();
	fill(l.getAmazonsearchbox(), "sony home theater");
	btnClick(l.getAmazonsearchclick());

}
}
