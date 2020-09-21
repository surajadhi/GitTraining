package testscripts;
import pageobjects.Job_PayGradesPage;

public class Job_PayGrades extends Job_PayGradesPage {
	
	public   void verifytitle() {
		verifyTitleActtoExp(gettxtTitle(), "Add User");
	}


	public   void clickAddUser() {
		clickWebElement(getBtnAdd(),"Add Buton");	
	}
	
	
	
	
	
}
