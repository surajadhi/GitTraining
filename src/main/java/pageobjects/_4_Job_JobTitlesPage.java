package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Baselibrary;

public class _4_Job_JobTitlesPage extends Baselibrary {	
	 By linkAdmin=By.linkText("Admin");
	  By linkjob= By.linkText("Job");
	 By linkjobtitles= By.linkText("Job Titles");
	  By txtPagetitle=By.xpath("//h1[contains(text(),'Job Titles')]");
	  By btnAdd=By.id("btnAdd");
	  By btnDelete=By.id("btnDelete");
	  By tbResulttable=By.id("resultTable");
	  By tbRequiredRow=By.xpath(".//*[@id='resultTable']/tbody/tr[\"+i+\"]/td[2]");
	  By tbSelectCheckbox=By.xpath(".//*[@id='resultTable']/tbody/tr[\"+j+\"]/td[1]/input");
	  By tbdialogdeletbutton=By.id("dialogDeleteBtn");
	
	public   WebElement getlinkAdmin() {
		return webElement(linkAdmin);
	}
	
	public   WebElement getlinkjob() {
		return webElement(linkjob);
	}
	
	public   WebElement getlinkjobtitles() {
		return webElement(linkjobtitles);
	}
	
	public   WebElement gettxtPagetitle() {
		return webElement(txtPagetitle);
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
	public   WebElement getTbRequiredRow() {
		return webElement(tbRequiredRow);
	}
	public   WebElement getTbSelectCheckbox() {
		return webElement(tbSelectCheckbox);
	}
	public   WebElement getTbdialogdeletbutton() {
		return webElement(tbdialogdeletbutton);
	}
	

}
