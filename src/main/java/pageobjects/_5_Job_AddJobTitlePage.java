package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Baselibrary;

public class _5_Job_AddJobTitlePage extends Baselibrary {
	
	static By txtPageTitle=By.id("saveHobTitleHeading");
	static By tbJobTitle=By.id("jobTitle_jobTitle");
	static By tbDescription=By.id("jobTitle_jobDescription");
	//static By tbJobSpecification=By.
	static By btnSave=By.id("btnSave");
	static By btnCancel=By.id("btnCancel");
	
	
	public static WebElement getTxtPageTitle() {
		return webElement(txtPageTitle);
	}
	public static WebElement getTbJobTitle() {
		return webElement(tbJobTitle);
	}
	public static WebElement getTbDescription() {
		return webElement(tbDescription);
	}
	public static WebElement getBtnSave() {
		return webElement(btnSave);
	}
	public static WebElement getBtnCancel() {
		return webElement(btnCancel);
	}

}
