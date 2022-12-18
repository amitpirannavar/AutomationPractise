package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingpage {
	
	public WebDriver driver;
	
	
	public landingpage(WebDriver driver) {
	     this.driver = driver;
	     PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@class='login']")
	WebElement Sign_In;


	public WebElement Sign_In() {
		return Sign_In;
	}
}
