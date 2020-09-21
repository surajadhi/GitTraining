package testscripts;



import org.testng.annotations.Test;
import pageobjects._2_Usermgt_UsersPage;

public class _2_Usermgt_User extends _2_Usermgt_UsersPage {
	@Test(priority=2)
	public static void NavigateUserMgt_Users()   {
				 
		 clickWebElement(getlinkAdmin(),"Admin");
		 clickWebElement(getlinkUserManagement(),"User Management");
		 clickWebElement(getlinkUsers(),"Users");	 
		 
	}
	@Test(priority=3)
	public static void verifytitle() {
		verifyTitleActtoExp(gettxtTitle(), "System Users");
	}
	
	@Test(priority=4)
	public static void ClickAdd() {
		
		clickWebElement(getBtnAdd(),"Add Buton");	
		
	}
	@Test(priority=7)
	public static void deleteuser() {
		
		webtableclass(gettbResulttable(),gettbRequiredValue(),prop.getProperty("Username"),gettbSelectCheckbox());//prop.getProperty("Username")
		clickWebElement(getBtnDelete(),"Add Button");	
		deletebuttonClick(gettbdialogdeletbutton(),"Ok Button");
		enteredText( getTbUsername(),"Username",prop.getProperty("Username"));
		enteredText( getDdUserrole(),"UserRole",prop.getProperty("UserRole"));
		enteredText( getTbEmployeename(),"EmployeeName",prop.getProperty("EmployeeName"));
		selectdropdownvalue( getDdStatus(),"selectByVisibleText",prop.getProperty("Status"));
		clickWebElement(getBtnSearch(),"Search Buton");
		noRecordsInGrid(gettbResulttable());
		

	}
	
	

}
