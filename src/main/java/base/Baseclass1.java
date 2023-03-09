package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass1 {
	
	static WebDriver driver;
	
	public static WebDriver getwebdriver(){
		

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		return driver;

		
	}
	
}
		
	


