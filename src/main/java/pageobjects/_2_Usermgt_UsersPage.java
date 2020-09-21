package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Baselibrary;

public class _2_Usermgt_UsersPage extends Baselibrary {
	//static By tbUsername=By.cssSelector("input#txtUsername");
	static By linkAdmin=By.linkText("Admin");
	static By linkUserManagement=By.linkText("User Management");
	static By linkUsers=By.linkText("Users");
	static By txtTitle=By.xpath("//h1[contains(text(),'System Users')]");
	static By tbUsername=By.cssSelector("input#searchSystemUser_userName");
	static By ddUserrole=By.cssSelector("select#searchSystemUser_userType");
	static By tbEmployeename= By.cssSelector("input#searchSystemUser_employeeName_empName");
	static By ddStatus=By.id("searchSystemUser_status");
	static By btnSearch=By.id("searchBtn");
	static By btnReset=By.id("resetBtn");
	static By btnAdd=By.id("btnAdd");
	static By btnDelete=By.id("btnDelete");
	static By checkboxSelect=By.name("chkSelectAll");
	static By tbResulttable=By.id("resultTable");
	//private static String i;
	static By tbRequiredRow=By.xpath(".//*[@id='resultTable']/tbody/tr[\"+i+\"]/td[2]");
	static By tbSelectCheckbox=By.xpath(".//*[@id='resultTable']/tbody/tr[\"+j+\"]/td[1]/input");
	static By tbdialogdeletbutton=By.id("dialogDeleteBtn");
	
	public static WebElement gettbResulttable() {
		return webElement(tbResulttable);
	}
	
	public static WebElement gettbRequiredValue() {
		return webElement(tbRequiredRow);
	}
	
	
	public static WebElement gettbSelectCheckbox() {
		return webElement(tbSelectCheckbox);
	}
	
	public static WebElement gettbdialogdeletbutton() {
		return webElement(tbdialogdeletbutton);
	}
	
	
	public static WebElement getlinkAdmin() {
		return webElement(linkAdmin);
	}
	public static WebElement getlinkUserManagement() {
		return webElement(linkUserManagement);
	}
	public static WebElement getlinkUsers() {
		return webElement(linkUsers);
	}
	public static WebElement gettxtTitle() {
		return webElement(txtTitle);
	}
	
	
	public static WebElement getpagetitle() {
		return webElement(linkUsers);
	}
	
	public static WebElement getTbUsername() {
		return webElement(tbUsername);
	}
	public static WebElement getDdUserrole() {
		return webElement(ddUserrole);
	}
	public static WebElement getTbEmployeename() {
		return webElement(tbEmployeename);
	}
	public static WebElement getDdStatus() {
		return webElement(ddStatus);
	}
	public static WebElement getBtnSearch() {
		return webElement(btnSearch);
	}
	public static WebElement getBtnReset() {
		return webElement(btnReset);
	}
	public static WebElement getBtnAdd() {
		return webElement(btnAdd);
	}
	public static WebElement getBtnDelete() {
		return webElement(btnDelete);
	}
	public static WebElement getCheckboxSelect() {
		return webElement(checkboxSelect);
	}
	
	
	

}
