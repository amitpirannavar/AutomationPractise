package AutomationPractisee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public  WebDriver driver;
	public static Properties prop;
	
	public WebDriver  initializationDriver() throws IOException {
		
	    
//		Properties prop = new Properties();
//		String proppath = System.getProperty("user.dir")+"\\src\\main\\java\\AutomationPractisee\\data.properties";
//		FileInputStream fis = new FileInputStream(proppath);
//		prop.load(fis);
		
		properties();
		
		String browserName = prop.getProperty("browser");
		
        if(browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else if(browserName.equalsIgnoreCase("ie")) {
			
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			
		}else if(browserName.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		return driver;
		}

	public static void properties() throws IOException
	{
	    prop = new Properties();
		String proppath = System.getProperty("user.dir")+"\\src\\main\\java\\AutomationPractisee\\data.properties";
		FileInputStream fis = new FileInputStream(proppath);
		prop.load(fis);
		
	}

//	public void takeScreenshot(String testName,WebDriver driver) throws IOException
//	{
//		File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String destinationFilePath = System.getProperty("user.dir")+"\\screenshots\\"+testName+".png";
//		FileUtils.copyFile(SourceFile,new File(destinationFilePath));
//	}

}
