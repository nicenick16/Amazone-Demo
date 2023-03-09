package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Aminitvpage {
	WebDriver driver;
	
	@FindBy (xpath="//*[text()=\"Web Series\"]")
	private WebElement textdata;
	
	public Aminitvpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	    this.driver = driver ;
		
	}
	public String  getlobotoverifyclick() throws InterruptedException {
		Thread.sleep(5000);
		return textdata.getText();
		
	}

}
