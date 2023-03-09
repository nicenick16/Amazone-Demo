package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bestsellerspage {
	WebDriver driver;
	
	@FindBy(xpath="//*[text()=\"Amazon Bestsellers\"]")
	private WebElement amazonetext;

	
	public Bestsellerspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String gettextfrombestseller() {
		return amazonetext.getText();
	}
}
