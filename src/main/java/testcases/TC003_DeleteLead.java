package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_DeleteLead extends ProjectMethods {
	@BeforeTest //(groups="common")
	public void setData() {
		testCaseName = "TC003_DeleteLead";
		testDescription ="Delete a lead";
		category = "Smoke";
		authors= "Mythili";
		testNodes = "Leads";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public  void deleteLead(String Uname,String pword, String fname,String leadId, String errorMsg) throws InterruptedException    {
		String firstId = new LoginPage()
		.typeUsername(Uname)
		.typePassword(pword)
		.clickLogin()
		.clickCrmSfa()
		.clickLeads()
		.clickFindLeads()
		.typeFirstName(fname)
		.clickFindLeads()
		.getFirstId();
		new FindLeadsPage()
		.clickId()
		.clickDelete()
		.clickFindLeads()
		.enterId(leadId)
		.clickFindLeads()
		.verifyMsg(errorMsg);
		
	}

}
