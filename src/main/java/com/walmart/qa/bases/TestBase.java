package com.walmart.qa.bases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.walmart.qa.utils.TestUtils;
import com.walmart.qa.utils.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebEventListener eventListener;
	public static EventFiringWebDriver e_driver;
	public TestBase() {
	
		try {
			prop = new Properties(); 	
			FileInputStream file = new FileInputStream("C:\\Users\\Bimal\\eclipse-workspace\\Walmart\\src\\main\\java\\com\\walmart\\qa\\config\\config.properties");
			prop.load(file);
		}catch(FileNotFoundException e){
			e.printStackTrace();		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void Intialization() {
		String browserName  = prop.getProperty("browser");
		if (browserName.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bimal\\Desktop\\bimsfg\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("GoogleChrome")) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bimal\\Desktop\\bimsfg\\chromedriver.exe");
			driver = new ChromeDriver();

		 
		}
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
			driver.manage().window().maximize(); 
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(TestUtils.page_timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtils.implicit_wait, TimeUnit.SECONDS);
			
			String url = prop.getProperty("url");
			driver.get(url);
			
		
		

	}

}
