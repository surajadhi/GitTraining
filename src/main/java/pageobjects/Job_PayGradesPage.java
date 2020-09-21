package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Baselibrary;

public class Job_PayGradesPage extends Baselibrary{
	  By txtTitle=By.xpath("//h1[contains(text(),'Pay Grades')]");
	  By btnAdd=By.id("btnAdd");
	  By btnDelete=By.id("btnDelete");
	  By tbResulttable=By.id("resultTable");
	  By tbSelectCheckbox=By.xpath(".//*[@id='resultTable']/tbody/tr[\"+j+\"]/td[1]/input");
	
	public   WebElement gettxtTitle() {
		return webElement(txtTitle);
	}
	public   WebElement getBtnAdd() {
		return webElement(btnAdd);
	}
	public   WebElement getBtnDelete() {
		return webElement(btnDelete);
	}
	public   WebElement getTbResulttable() {
		return webElement(tbResulttable);
	}
	public   WebElement getTbSelectCheckbox() {
		return webElement(tbSelectCheckbox);
	}
	
}
