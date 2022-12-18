package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	WebDriver driver;
	
	public Register(WebDriver driver) 
	{
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	    @FindBy(xpath="//input[@id='email_create']")
	    WebElement EmailInput;
	    
	    @FindBy(xpath="//span[normalize-space()='Create an account']")
	    WebElement CreateAccount;
	    
	    @FindBy(xpath="//div[@id='uniform-id_gender1']")
	    WebElement genderSelector;
	    
	    @FindBy(xpath="//input[@id='customer_firstname']")
	    WebElement FirstName;
	    
	    @FindBy(xpath="//input[@id='customer_lastname']")
	    WebElement LastName;
	    
	    
	    @FindBy(xpath="//input[@id='email']")
	    WebElement Email;
	    
	    
	    @FindBy(xpath="//input[@id='passwd']")
	    WebElement Password;
	    
	    @FindBy(xpath="//input[@id='optin']")
	    WebElement checkbox;
	    
	    @FindBy(xpath="//input[@id='company']")
	    WebElement companyName;
	    
	    @FindBy(xpath="//input[@id='address1']")
	    WebElement Address;
	   
	    @FindBy(xpath="//input[@id='city']")
	    WebElement cityName;
	    
	    @FindBy(xpath="//input[@id='postcode']")
	    WebElement zipcode;
	   
	    @FindBy(xpath="//div[@id='uniform-id_country']")
	    WebElement countryselect;
	    
	    @FindBy(xpath="//input[@id='phone_mobile']")
	    WebElement phonenumber;
	 
	    @FindBy(xpath="//input[@id='alias']")
	    WebElement myAddress;
	    
	    @FindBy(xpath="//button[@id='submitAccount']")
	    WebElement RegisterSubmit;
	    
	    
	public WebElement EmailInput() 
	{
		
		return EmailInput;
	}
	public WebElement CreateAccount() 
	{
		return CreateAccount;
	}
	public WebElement genderSelector()
	{
		return genderSelector;
	}
	public WebElement FirstName()
	{
		return FirstName;	
	}
	public WebElement LastName()
	{
		return LastName;
		
	}
	public WebElement Email()
	{
		return Email;
	}
	public WebElement Password()
	{
		return Password;
	}
	public WebElement checkbox() 
	{
		return checkbox;
		
	}
	public WebElement companyName()
	{
		return companyName;
	}
	public WebElement Address()
	{
		return Address;
	}
	public WebElement cityName()
	{
		return cityName;
	}
	public WebElement zipcode()
	{
		return zipcode;
	}
	public WebElement countryselect()
	{
		return countryselect;
	}
	public WebElement phonenumber()
	{
		return phonenumber;
	}
	public WebElement myAddress()
	{
		return myAddress;
	}
	public WebElement RegisterSubmit()
	{
		return RegisterSubmit;
	}
}
