package AutomationPractisee;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjects.landingpage;
import PageObjects.Register;

public class login extends Base {
	
	@Test 
	public void loginTest() throws IOException {
		
	WebDriver driver = initializationDriver();

	Properties prop = new Properties();
	String proppath = System.getProperty("user.dir")+"\\src\\main\\java\\AutomationPractisee\\data.properties";
	FileInputStream fis = new FileInputStream(proppath);
	prop.load(fis);
	String url = prop.getProperty("browser");
	driver.get(prop.getProperty("url"));

	
	landingpage land = new landingpage(driver);
	land.Sign_In().click();
	
	Register rg = new Register(driver);
	rg.EmailInput().sendKeys(prop.getProperty("emailinput"));
	rg.CreateAccount().click();
	rg.genderSelector().click();
	rg.FirstName().sendKeys(prop.getProperty("firstname"));
	rg.LastName().sendKeys(prop.getProperty("lastname"));
	rg.Email().clear();
	rg.Email().sendKeys(prop.getProperty("email"));
	rg.Password().sendKeys(prop.getProperty("password"));
	
	WebElement days = driver.findElement(By.id("days"));
	Select select = new Select(days);
	select.selectByValue("26");
	
	Select dropdown = new Select(driver.findElement(By.id("months")));
	dropdown.selectByIndex(3);
	
	WebElement years = driver.findElement(By.id("years"));
	Select select2 = new Select(years);
	select2.selectByValue("1998");
	
	rg.checkbox().click();
	rg.companyName().sendKeys(prop.getProperty("companyname"));
	rg.Address().sendKeys(prop.getProperty("address"));
	rg.cityName().sendKeys(prop.getProperty("city"));
	
	
	rg.countryselect().click();

	Select country = new Select(driver.findElement(By.id("id_country")));
	country.selectByIndex(1);
	
	Select state = new Select(driver.findElement(By.id("id_state")));
	state.selectByIndex(6);
	
	rg.zipcode().sendKeys("59131");

	
	rg.phonenumber().sendKeys(prop.getProperty("phonenumber"));
	rg.myAddress().clear();
	rg.myAddress().sendKeys(prop.getProperty("myAddress"));
	rg.RegisterSubmit().click();
	
	
	
	
	
	}
	
	

	
	
	

}
