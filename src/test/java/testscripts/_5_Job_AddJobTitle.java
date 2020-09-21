package testscripts;

import org.testng.annotations.Test;

import pageobjects._5_Job_AddJobTitlePage;

public class _5_Job_AddJobTitle extends _5_Job_AddJobTitlePage{
	@Test(priority=11)
	public static void verifytitle() {
		verifyTitleActtoExp( getTxtPageTitle(), "Add Job Title");
	}
	@Test(priority=12)
	public static void AddUser()   {
		
		 enteredText(getTbJobTitle(),"Job Title",prop.getProperty("JobTitle"));
		 enteredText(getTbDescription(),"Job Description",prop.getProperty("JobDescription"));
		 clickWebElement(getBtnSave(),"Save Buton");	
	}

}
