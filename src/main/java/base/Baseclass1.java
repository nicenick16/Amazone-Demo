package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass1 {
	
	static WebDriver driver;
	
	public static WebDriver getwebdriver(){
		
//		System.setProperty("webdriver.chrome.driver","D:\\QANikhil\\automation software\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		return driver;

		
	}
	
}
		
	


