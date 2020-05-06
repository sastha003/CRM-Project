package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Signup.signUP;

public class crmRunner {
	WebDriver driver;

	@BeforeTest
	// Chrome Browser Open
	public void chrome() {
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://api.cogmento.com/register/");
	}
//		// firefox Browser Open
//		public void firefox() {
//			System.setProperty("webdriver.gecko.driver", "E:/Selenium/geckodriver.exe");
//			driver = new FirefoxDriver();
//			driver.manage().window().maximize();
//			driver.manage().deleteAllCookies();
//			driver.get("https://api.cogmento.com/register/");
//		}
	
	@Test (priority = 0)
	public void verifysignups() throws InterruptedException {
		signUP signup = new signUP(driver);
		signup.registerdata("sastha003@gmail.com", "8015150919");
		signup.signupButton();
	}
			

}

