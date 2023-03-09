package test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import base.Baseclass1;
import pom.Aminitvpage;
import pom.Bestsellerspage;
import pom.Homepage;

public class Testformtv {
	static WebDriver driver;
	Homepage hp;
	Aminitvpage mtv;
	Bestsellerspage bs;
	
	@BeforeClass
	public void BeforeClass() {
		driver = Baseclass1.getwebdriver();
	}
	@BeforeMethod
	public void BeforeMethode() {
		hp = new Homepage(driver);
		mtv = new Aminitvpage(driver);
		bs = new Bestsellerspage(driver);
	}
	@Test
	public void clickonmtv() throws InterruptedException {
		hp.clickonminitv();
		String actualtext = mtv.getlobotoverifyclick();
		AssertJUnit.assertEquals(actualtext, "Web Series");
//		driver.navigate().back();
	}
	@Test
	public void clickonbestSeller() {
		hp.clickonbestsellerbtn();
		String actualtext=bs.gettextfrombestseller();
		Assert.assertEquals(actualtext, "Amazon Bestsellers");
//		driver.navigate().back();	
	}
	
	
	
	@AfterMethod
	public void afetrmethode() throws InterruptedException {
//		Thread.sleep(10000);
		driver.navigate().back();
		
	}
	@AfterClass
	public void afterClass() {
		System.out.println("afetr class called");
	}

}
