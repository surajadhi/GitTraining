package testscripts;

import org.testng.annotations.Test;

import pageobjects._4_Job_JobTitlesPage;

public class _4_Job_JobTitle extends _4_Job_JobTitlesPage {
	@Test(priority=8)
	public   void NavigateJobTitle()   {
		 
		 clickWebElement(getlinkAdmin(),"Admin");
		 clickWebElement(getlinkjob(),"Job");
		 clickWebElement(getlinkjobtitles(),"JobTitles");	 	 
	}
	
	@Test(priority=9)
	public   void verifytitle() {
		verifyTitleActtoExp(gettxtPagetitle(), "System Users");
	}
	
	@Test(priority=10)
	public   void ClickAdd() {
		
		clickWebElement(getBtnAdd(),"Add Buton");	
		
	}
	
	@Test(priority=13)
	public   void deleteuser() {
		
		webtableclass(getTbResulttable(),getTbRequiredRow(),prop.getProperty("JobTitle"),getTbSelectCheckbox());//prop.getProperty("Username")
		clickWebElement(getBtnDelete(),"Add Button");	
		deletebuttonClick(getTbdialogdeletbutton(),"Ok Button");

	}
	
	

}
