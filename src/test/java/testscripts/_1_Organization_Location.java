package testscripts;



import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects._1_LoginPage;
import pageobjects._1_Organization_LocationPage;
import pageobjects._2_Organization_AddLocationPage;
import resources.Baselibrary;

public class _1_Organization_Location extends  Baselibrary{
	
	WebDriver driver;
	
	
	 
	  static _1_Organization_LocationPage lp=new _1_Organization_LocationPage();
	  static _2_Organization_AddLocationPage alp=new _2_Organization_AddLocationPage();
	  static _1_LoginPage logp=new _1_LoginPage();
	  
	  @BeforeTest
		public void initialize() throws IOException {
			driver=initializeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			
		}
		
		@Test
		public void  LoginTest() throws InterruptedException, AWTException {
		
		enteredText(logp.getTbUsername(),"UserName",prop.getProperty("Loginname"));
		enteredText(logp.getTbPassword(),"Password",prop.getProperty("Password"));
		clickWebElement(logp.getBtnName(),"Login");
		}
	  
	@Test(priority=1)
	public static void locationpagenavigation() {
		
		bl.clickWebElement(lp.getLinkAdmin(), "Admin Menu");
		bl.clickWebElement(lp.getLinkOrganization(), "Organization Menu");
		bl.clickWebElement(lp.getLinkLocations(), "Location Menu");
	}
	@Test
	public static void location() {  
	 bl.clickWebElement(lp.getBtnAdd(), "Add Button");
	 bl.enteredText(alp.getLocation_name(), "Location_Name Field",prop.getProperty("LocationName"));
	 bl.selectdropdownvalue(alp.getLocation_country(), "selectByVisibleText", prop.getProperty("LocationCountryName"));
	 bl.enteredText(alp.getLocation_province(), "State/Province Field", prop.getProperty("Location_State/Province"));
	 bl.enteredText(alp.getLocation_city(), "City Field", prop.getProperty("Location_City"));
	 bl.enteredText(alp.getLocation_address(), "Address Field", prop.getProperty("Location_Address"));
	 bl.enteredText(alp.getLocation_zipCode(), "Zipcode field", prop.getProperty("Location_ZipCode"));
	 bl.enteredText(alp.getLocation_phone(), "Phone field", prop.getProperty("Location_Phone"));
	 bl.enteredText(alp.getLocation_fax(),"fax field",prop.getProperty("Location_Fax"));
	 bl.enteredText(alp.getLocation_notes(), "Notes", prop.getProperty("Location_Notes"));   
	}
	
	@Test
	public static void locationcancel() {
		bl.clickWebElement(alp.getBtnCancel(), "Cancel Button");	
	}
	
	@Test(priority=4)
	public static void locationsave() {
		location();
		bl.clickWebElement(alp.getBtnSave(), "Save Button");
	}
	
	@Test(priority=5)
	public static void searchlocation() {
		bl.enteredText(lp.getTbLocationName(), "Location Name", prop.getProperty("LocationName"));
		bl.enteredText(lp.getTbCity(), "City Name", prop.getProperty("Location_City"));
		bl.selectdropdownvalue(lp.getTbCountry(), "Country Name",prop.getProperty("LocationCountryName") );	
	}
	
	@Test(priority=6)
	public static void resetlocation() {
		bl.clickWebElement(lp.getBtnReset(), "Reset Button");
	}
	
	@Test(priority=7)
	public static void searchdeletelocation() {
		searchlocation();
		bl.clickWebElement(lp.getBtnSearch(), "Search Button");
		bl.webtableclass(lp.getTblLocation(), lp.getTxtVal(), "Required Value", lp.getChkboxSele());
		bl.clickWebElement(lp.getBtnDelete(), "Delete Button");
		bl.deletebuttonClick(lp.getDialogCancelBtn(), "Dialog Cancel Button");
	}
	

}
