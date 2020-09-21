package testscripts;


import org.testng.annotations.Test;

import pageobjects._3_Usermgt_AddUserPage;

public class _3_Usermgt_AddUser extends _3_Usermgt_AddUserPage{
	@Test(priority=5)
	public static void verifytitle() {
		verifyTitleActtoExp(gettxtTitle(), "Add User");
	}	

	@Test(priority=6)
	public static void AddUser()   {
		 selectdropdownvalue(getDdUserrole(),"selectByVisibleText",prop.getProperty("UserRole"));
		 enteredText(getTbEmployeeName(),"Employee Name",prop.getProperty("EmployeeName"));
		 enteredText(getTbUsername(),"Username",prop.getProperty("Username"));
		 selectdropdownvalue(getDdStatus(),"selectByVisibleText",prop.getProperty("Status"));
		 enteredText(getTbPassword(),"Password",prop.getProperty("UserPassword"));
		 enteredText(getTbConfirmPassword(),"Confirm Password",prop.getProperty("UserConfirmPassword"));
		 clickWebElement(getBtnSave(),"Save Buton");	
	}
	
	
}