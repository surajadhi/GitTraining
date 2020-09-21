package testscripts;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects._1_LoginPage;

public class _1_Login extends _1_LoginPage{
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}
	
	@Test
	public void  LoginTest() throws InterruptedException, AWTException {
	
	enteredText(getTbUsername(),"UserName",prop.getProperty("Loginname"));
	enteredText(getTbPassword(),"Password",prop.getProperty("Password"));
	clickWebElement(getBtnName(),"Login");
	}
	
}
