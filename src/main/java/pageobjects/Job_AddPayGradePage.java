package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import resources.Baselibrary;

public class Job_AddPayGradePage extends Baselibrary{
	
	
	
	
	 By txtTitle=By.xpath("//h1[contains(text(),'Add Pay Grade')],'Add Pay Grade')]");
	 By fieldName=By.id("payGrade_name");
	 By btnSave=By.id("btnSave");
	 By btnAdd=By.id("btnAddCurrency");
	 By fieldCurrency=By.id("payGradeCurrency_currencyName");
	 By fieldMinimumSalary=By.id("payGradeCurrency_minSalary");
	 By fieldMaximumSalary=By.id("payGradeCurrency_maxSalary");
	 By btnSaveCurrency=By.id("btnSaveCurrency");
	 By tbSelectCheckbox=By.xpath(".//*[@id='tblCurrencies']/tbody/tr[\"+j+\"]/td[1]/input");
	
	public  WebElement gettxtTitle() {
		return webElement(txtTitle);
	}
	public  WebElement getFieldName() {
		return webElement(fieldName);
	}
	public  WebElement getBtnSave() {
		return webElement(btnSave);
	}
	public  WebElement getBtnAdd() {
		return webElement(btnAdd);
	}
	public  WebElement getFieldCurrency() {
		return webElement(fieldCurrency);
	}
	public  WebElement getFieldMinimumSalary() {
		return webElement(fieldMinimumSalary);
	}
	public  WebElement getFieldMaximumSalary() {
		return webElement(fieldMaximumSalary);
	}
	public  WebElement getBtnSaveCurrency() {
		return webElement(btnSaveCurrency);
	}
	public  WebElement getTbSelectCheckbox() {
		return webElement(tbSelectCheckbox);
	}
	
}
