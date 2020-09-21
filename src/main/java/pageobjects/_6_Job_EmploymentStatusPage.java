package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import resources.Baselibrary;

public class _6_Job_EmploymentStatusPage extends Baselibrary {
	

	@FindBy(linkText="Admin")
	WebElement linkAdmin;
	
	@FindBy(linkText="Job Titles")
	WebElement linkjob;
	
	@FindBy(linkText="Employment Status")
	WebElement linkEmploymentStatus;
	

	@FindBy(linkText="Job Titles")
	WebElement pagetitle;
	
	@FindBy(id="btnAdd")
	WebElement btnAdd;
	
	@FindBy(id="btnDelete")
	WebElement btnDelete;
	
	@FindBy(name="login")
	WebElement btnLogin;
	
	@FindBy(name="empStatus[name]")
	WebElement Name;
	
	@FindBy(id="btnSave")
	WebElement Save;
	
	@FindBy(id="btnCancel")
	WebElement Cancel;
	
	@FindBy(id="resultTable")
	WebElement EmployeementStatusGrid;
	
	@FindBy(xpath=".//*[@id='resultTable']/tbody/tr[\\\"+i+\\\"]/td[2]")
	WebElement RequiredRow;
	
	@FindBy(xpath=".//*[@id='resultTable']/tbody/tr[\\\"+j+\\\"]/td[1]/input")
	WebElement RequiredCheckbox;
	
	@FindBy(id="dialogDeleteBtn")
	WebElement tbdialogdeletbutton;

	public WebElement getLinkAdmin() {
		return linkAdmin;
	}

	public WebElement getLinkjob() {
		return linkjob;
	}

	public WebElement getLinkEmploymentStatus() {
		return linkEmploymentStatus;
	}

	public WebElement getPagetitle() {
		return pagetitle;
	}

	public WebElement getBtnAdd() {
		return btnAdd;
	}

	public WebElement getBtnDelete() {
		return btnDelete;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getName() {
		return Name;
	}

	public WebElement getSave() {
		return Save;
	}

	public WebElement getCancel() {
		return Cancel;
	}

	public WebElement getEmployeementStatusGrid() {
		return EmployeementStatusGrid;
	}

	public WebElement getRequiredRow() {
		return RequiredRow;
	}

	public WebElement getRequiredCheckbox() {
		return RequiredCheckbox;
	}

	public WebElement getTbdialogdeletbutton() {
		return tbdialogdeletbutton;
	}
	
	
	
	
	
	
	
}


