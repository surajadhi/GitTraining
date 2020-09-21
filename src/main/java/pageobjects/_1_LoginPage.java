package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Baselibrary;

public class _1_LoginPage extends Baselibrary {
	static By tbUsername = By.cssSelector("input#txtUsername");
	static By tbPassword = By.id("txtPassword");
	static By btnName = By.id("btnLogin");

	public WebElement getTbUsername() {
		return webElement(tbUsername);
		/****test**/
	}

	public WebElement getTbPassword() {

		return webElement(tbPassword);
	}

	public WebElement getBtnName() {
		// clickWhenReady(btnName, 10);
		return webElement(btnName);
	}

}
