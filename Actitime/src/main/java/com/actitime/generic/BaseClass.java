package com.actitime.generic;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.Login;

public class BaseClass {
	
		static
		{
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		
		}
		public static WebDriver driver;
		@Parameters("browser")
		@BeforeClass
		
		public void openBrowser(@Optional("chrome")String  browser)
		{
			if(browser.equals("chrome"))
			{
				driver=new ChromeDriver();
			}
			else if(browser.equals("firefox"))
			{
				driver=new FirefoxDriver();
				
			}
			Reporter.log("open Browser",true);
			
		}
		@BeforeMethod
		public void login()
		{
			driver.get("https://demo.actitime.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Login l= new Login(driver);
			l.setLogin("admin", "manager");

		}
		@AfterMethod
		public void logout()
		{
			Reporter.log("Logout",true);
			EnterTimeTrack t=new EnterTimeTrack(driver);
			t.getLogoutButton().click();

		}
		
		@AfterClass
		public void closeBrowser()
		{
			Reporter.log("Close Browser",true);
			driver.quit();

		}
	}

