package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import resources.Baselibrary;

public class _2_Organization_AddLocationPage extends Baselibrary{
	
	@FindBy(id="location_name")
	By location_name;
	
	@FindBy(id="location_country")
	By location_country;
	
	@FindBy(id="location_province")
	By location_province;
	
	@FindBy(id="location_city")
	By location_city;
	
	@FindBy(id="location_address")
	By location_address;
	
	@FindBy(id="location_zipCode")
	By location_zipCode;
	
	@FindBy(id="location_phone")
	By location_phone;
	
	@FindBy(id="location_fax")
	By location_fax;
	
	@FindBy(id="location_notes")
	By location_notes;
	
	@FindBy(id="btnSave")
	By btnSave;
	
	@FindBy(id="btnCancel")
	By btnCancel;

	public WebElement getLocation_name() {
		return  webElement(location_name);
	}

	public WebElement getLocation_country() {
		return  webElement(location_country);
	}

	public WebElement getLocation_province() {
		return  webElement(location_province);
	}

	public WebElement getLocation_city() {
		return  webElement(location_city);
	}

	public WebElement getLocation_address() {
		return  webElement(location_address);
	}

	public WebElement getLocation_zipCode() {
		return  webElement(location_zipCode);
	}

	public WebElement getLocation_phone() {
		return  webElement(location_phone);
	}

	public WebElement getLocation_fax() {
		return  webElement(location_fax);
	}

	public WebElement getLocation_notes() {
		return  webElement(location_notes);
	}

	public WebElement getBtnSave() {
		return  webElement(btnSave);
	}

	public WebElement getBtnCancel() {
		return  webElement(btnCancel);
	}

	
	

	
		
}
