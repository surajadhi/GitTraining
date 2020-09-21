package testscripts;

import org.testng.annotations.Test;

import pageobjects._6_Job_EmploymentStatusPage;

public class _6_Job_EmploymentStatus extends _6_Job_EmploymentStatusPage{
	
	@Test(priority=14)
	public void EmploymentStatusTest() {
		
		 clickWebElement(getLinkAdmin(),"Admin");
		 clickWebElement(getLinkjob(),"Job");
		 clickWebElement(getLinkEmploymentStatus(),"Job Titles");
		 verifyTitleActtoExp(getPagetitle(), "Job Titles");
		clickWebElement(getBtnAdd(),"Add");
		enteredText(getBtnLogin(),"UserName",prop.getProperty("EmploymentStatus_Name"));
		clickWebElement( getCancel(),"Cancel");
		clickWebElement(getBtnAdd(),"Add");
		enteredText(getBtnLogin(),"UserName",prop.getProperty("EmploymentStatus_Name"));
		clickWebElement(getSave(),"Add");
		webtableclass( getEmployeementStatusGrid(),getRequiredRow(),prop.getProperty("EmploymentStatus_Name"),getRequiredCheckbox());//prop.getProperty("Username")
		clickWebElement(getBtnDelete(),"Delete Button");	
		deletebuttonClick(getTbdialogdeletbutton(),"Ok Button");
	}

}
