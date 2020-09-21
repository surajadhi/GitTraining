package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import resources.Baselibrary;



public class _1_Organization_LocationPage extends Baselibrary  {
	
	
	@FindBy(linkText="Admin")
	By linkAdmin;
	
	@FindBy(linkText="Organization")
	By linkOrganization;
	
	@FindBy(linkText="Locations")
	By LinkLocations;
	
	@FindBy(id="searchLocation_name")
	By tbLocationName;
	
	@FindBy(id="searchLocation_city")
	By tbCity;
	
	@FindBy(id="searchLocation_country")
	By tbCountry;
	
	@FindBy(id="btnSearch")
	By btnSearch;
	
	@FindBy(id="btnReset")
	By btnReset;
	
	@FindBy(id="btnAdd")
	By btnAdd;
	
	@FindBy(id="btnDelete")
	By btnDelete;
	
	@FindBy(id="resultTable")
	By tblLocation;
	
	@FindBy(xpath="//body//td[2]")
	By txtVal;
	
	@FindBy(id="ohrmList_chkSelectRecord_4")
	By chkboxSele;
	
	@FindBy(id="dialogDeleteBtn")
	By dialogDeleteBtn;
	
	@FindBy(xpath="//input[@class='btn reset']")
	By dialogCancelBtn;

	public  WebElement getLinkAdmin() {
		return webElement( linkAdmin);
	}

	public WebElement getLinkOrganization() {
		return webElement( linkOrganization);
	}

	public WebElement getLinkLocations() {
		return webElement( LinkLocations);
	}

	public WebElement getTbLocationName() {
		return webElement( tbLocationName);
	}

	public WebElement getTbCity() {
		return webElement(tbCity);
	}

	public WebElement getTbCountry() {
		return webElement(tbCountry);
	}

	public WebElement getBtnSearch() {
		return webElement(btnSearch);
	}

	public WebElement getBtnReset() {
		return webElement(btnReset);
	}

	public WebElement getBtnAdd() {
		return webElement(btnAdd);
	}

	public WebElement getBtnDelete() {
		return webElement(btnDelete);
	}

	public WebElement getTblLocation() {
		return webElement(tblLocation);
	}

	public WebElement getTxtVal() {
		return webElement(txtVal);
	}

	public WebElement getChkboxSele() {
		return webElement(chkboxSele);
	}

	public WebElement getDialogDeleteBtn() {
		return webElement(dialogDeleteBtn);
	}

	public WebElement getDialogCancelBtn() {
		return webElement(dialogCancelBtn);
	}

	
	



	

	
}
