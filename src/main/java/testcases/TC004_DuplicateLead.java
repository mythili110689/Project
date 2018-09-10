package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DuplicateLead extends ProjectMethods {
	@BeforeTest //(groups="common")
	public void setData() {
		testCaseName = "TC004_DuplicateLead";
		testDescription ="Duplicate a lead";
		category = "Smoke";
		authors= "Mythi";
		testNodes = "Leads";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public  void duplicateLead(String Uname, String pword,String email, String title) throws InterruptedException   {
		String leadName = new LoginPage()
		.typeUsername(Uname)
		.typePassword(pword)
		.clickLogin()
		.clickCrmSfa()
		.clickLeads()
		.clickFindLeads()
		.clickEmail()
		.typeEmail(email)
		.clickFindLeads()
		.getLeadName();
		new FindLeadsPage()
		.clickLeadName()
		.clickDuplicate()
		.checkTitle(title);
		new CreateLeadPage()
		.clickCreateLead()
		.getCapname(leadName);
	}

}
