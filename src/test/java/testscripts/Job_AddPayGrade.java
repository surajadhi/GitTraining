package testscripts;

import pageobjects.Job_AddPayGradePage;

public class Job_AddPayGrade extends Job_AddPayGradePage {
	public   void verifytitle() {
		verifyTitleActtoExp(gettxtTitle(), "Add Pay Grade");
	}

	public   void AddPaycode() {
		 enteredText(getFieldName(),"Name",prop.getProperty("PayGradeName"));
		 clickWebElement(getBtnSave() ,"Add Button");	
		 clickWebElement(getBtnAdd() ,"Add Button");
		 enteredText(getFieldCurrency(),"Currency",prop.getProperty("CurrencyName"));
		 enteredText(getFieldMinimumSalary(),"Minimum Salary",prop.getProperty("MinSal"));
		 enteredText(getFieldMaximumSalary(),"Maximum Salary",prop.getProperty("MaxSal"));
		 clickWebElement(getBtnSaveCurrency() ,"Save Button");
		 
		 
		 
	
		 
	}
	
}
