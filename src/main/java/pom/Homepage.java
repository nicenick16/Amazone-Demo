package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	
	@FindBy(xpath="(//a[contains(@href,\"/minitv?ref_\")])[1]") 
	private WebElement mtvbtn ;
	@FindBy (xpath = "//*[contains(@href,\"/gp/bestsellers/?ref_=nav_cs_bestsellers\")]")
	private WebElement bestsellerbtn ;
	
	public Homepage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickonminitv() {
		mtvbtn.click();        
	}
	public void clickonbestsellerbtn() {
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(bestsellerbtn));
		bestsellerbtn.click();
	}

}
