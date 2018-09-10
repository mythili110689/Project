package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

//import org.junit.Test;

import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods {
	
	@BeforeClass(groups="common")
	public void setData() {
		testCaseName = "TC005_MergeLead";
		testDescription ="Merge two leads";
		category = "Smoke";
		authors= "Mythi";
		testNodes = "Leads";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public  void mergeLead(String Uname, String pword,String fname,String fromLead, String toLead,String errorMsg) throws InterruptedException   {
		new LoginPage()
		.typeUsername(Uname)
		.typePassword(pword)
		.clickLogin()
		.clickCrmSfa()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLead();
		new FindLeadsPage()
		.typeFirstName(fname)		
		.clickFindLeads()
		.clickId()
		
		
		


		
		String leadId = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		clickWithNoSnap(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		switchToWindow(0);
		click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("name", "firstName"),toLead);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(1000);
		clickWithNoSnap(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		switchToWindow(0);
		clickWithNoSnap(locateElement("linktext", "Merge"));
		acceptAlert();
		click(locateElement("linktext", "Find Leads"));
		type(locateElement("xpath", "//input[@name='id']"),leadId);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(1000);
		WebElement eleVerify = locateElement("class", "x-paging-info");
		verifyExactText(eleVerify, errorMag);
	
		
	}

}
