package Signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signUP {

	WebDriver driver;

	@FindBy(xpath = "//input[@name='email']")
	WebElement emailId;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement phonenumber;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement signup;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement agreeButton;
	@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
	WebElement robotcheck;

	public signUP(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	public void registerdata(String username, String phone) throws InterruptedException {
		emailId.sendKeys(username);
		phonenumber.sendKeys(phone);
		agreeButton.click();
		Thread.sleep(5000);

	}

	public void signupButton() {
		signup.click();
	}

}
