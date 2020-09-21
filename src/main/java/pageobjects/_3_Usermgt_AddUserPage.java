package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Baselibrary;

public class _3_Usermgt_AddUserPage extends Baselibrary {
	//static By tbUsername=By.cssSelector("input#txtUsername");
	static By txtTitle=By.cssSelector("#UserHeading");
	static By ddUserrole=By.cssSelector("select#systemUser_userType");
	static By tbEmployeeName=By.cssSelector("input#systemUser_employeeName_empName");
	static By tbUsername=By.cssSelector("input#systemUser_userName");
	static By ddStatus=By.cssSelector("select#systemUser_status");
	static By tbPassword=By.id("systemUser_password");
	static By tbConfirmPassword=By.id("systemUser_confirmPassword");
	static By btnSave=By.id("btnSave");
	static By btnCancel=By.id("btnCancel");
	
	public static WebElement gettxtTitle() {
		return webElement(txtTitle);
	}
	
	public static WebElement getDdUserrole() {
		return webElement(ddUserrole);
	}
	public static WebElement getTbEmployeeName() {
		return webElement(tbEmployeeName);
	}
	public static WebElement getTbUsername() {
		return webElement(tbUsername);
	}
	public static WebElement getDdStatus() {
		return webElement(ddStatus);
	}
	public static WebElement getTbPassword() {
		return webElement(tbPassword);
	}
	public static WebElement getTbConfirmPassword() {
		return webElement(tbConfirmPassword);
	}
	public static WebElement getBtnSave() {
		return webElement(btnSave);
	}
	public static WebElement getBtnCancel() {
		return webElement(btnCancel);
	}
	
	
}
