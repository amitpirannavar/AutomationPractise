package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountlogintest {
	public WebDriver driver;
	public Accountlogintest(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	    @FindBy(xpath="(//input[@id='email'])[1]")
	     WebElement loginEmail;
	    @FindBy(xpath="//input[@name='passwd']")
	     WebElement loginPassword;
	    @FindBy(xpath="//button[@id='SubmitLogin']")
	     WebElement submit;
	    @FindBy(xpath="//p[@class='info-account']")
	     WebElement textMessage;
	    @FindBy(xpath="//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]")
	     WebElement Tshirts;
	    @FindBy(xpath="//div[@class='selector']")
	     WebElement SelectOption;
	    @FindBy(xpath="//option[@value='name:asc']")
	     WebElement Selectoption3;
	    @FindBy(xpath="//div[@class='product-image-container']/a/img")
	     WebElement imgclick;
	    @FindBy(xpath="//input[@class='text']")
         WebElement shirtqty;
	    @FindBy(xpath="//div[@id='uniform-group_1']")
	     WebElement size;
	    
	    public WebElement size()
	    {
	    	return size;
	    }
	    public WebElement shirtqty()
	    {
	    	return shirtqty;
	    }
	    public WebElement imgclick()
	    {
	    	return imgclick;
	    }
	    
	    public WebElement Selectoption3()
	    {
	    	return Selectoption3;
	    }
	    
	    public WebElement SelectOption()
	    {
	    	return SelectOption;
	    }
	    
	    public WebElement textMessage()
	    {
	    	return textMessage;
	    }
	 

		public WebElement loginEmail()
	    {
	    	return loginEmail;
	    }
	    public WebElement loginPassword()
	    {
	    	return loginPassword;
	    }
	    public WebElement submit()
	    {
	    	return submit;
	    }
		public WebElement Tshirts() {
			// TODO Auto-generated method stub
			return Tshirts;
		}
}
