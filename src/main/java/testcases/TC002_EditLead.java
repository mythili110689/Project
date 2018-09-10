package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_EditLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC002_EditLead";
		testDescription ="Edit a lead";
		category = "Smoke";
		authors= "Mythili";
		testNodes = "Leads";
		dataSheetName="TC002";
		
	}
	@Test(dataProvider="fetchData")
	public  void editLead(String Uname, String pword,String fname,String UpdatedName) throws InterruptedException  {
		new LoginPage()
		.typeUsername(Uname)
		.typePassword(pword)
		.clickLogin()
		.clickCrmSfa()
		.clickLeads()
		.clickFindLeads()
		.typeFirstName(fname)
		.clickFindLeads()
		.clickId()
		.clickEdit()
        .typeNewName(UpdatedName)
        .clickUpdate();
        
	}
}
