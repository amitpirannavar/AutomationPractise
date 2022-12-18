package AutomationPractisee;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream; 
 
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjects.Accountlogintest;
import PageObjects.landingpage;

public class Accountlogin extends Base {
	
    Logger log ;
	WebDriver driver;
	
	@BeforeMethod
	public void openApplication() throws IOException {
		
	    log = LogManager.getLogger(Accountlogin.class.getName());
		Base.properties();
		driver = initializationDriver();
		log.debug("Browser got launched");
		driver.get(prop.getProperty("url"));
		log.debug("Navigated to application URL");
		
	}
	
	@Test
	public void accountlog() throws IOException, InterruptedException {
		
		Base.properties();
		landingpage ld = new landingpage(driver);
		ld.Sign_In().click();
		log.debug("Sign_In Button has been clicked");
		
		Accountlogintest acctest = new Accountlogintest(driver);
		acctest.loginEmail().sendKeys(prop.getProperty("email"));
		log.debug("Email Has Entered");
		acctest.loginPassword().sendKeys(prop.getProperty("password"));
		log.debug("password Has Entered");
		acctest.submit().click();
		log.debug("clicked submit button");
		Thread.sleep(1000);
		SoftAssert soft = new SoftAssert(); 
		String actualtext = acctest.textMessage().getText();
		String expectedtext = "Welcome to your account. Here you can manage all of your personal information and orders.";
		soft.assertEquals(actualtext,expectedtext , "Text is matched");
		System.out.println("Pertectly Logged in");
		acctest.Tshirts().click();
		acctest.SelectOption().click();
		acctest.Selectoption3().click();
		Thread.sleep(3000);
		acctest.imgclick();
		acctest.shirtqty().sendKeys("1");
		acctest.size().click();
	}
	

	@AfterMethod
	public void driverCloser()
	{
		driver.close();
		log.debug("driver got closed");
	}

}
