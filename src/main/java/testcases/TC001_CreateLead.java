package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods {

  @BeforeTest //(groups="common")
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testDescription = "Create a lead";
		category = "Smoke";
		authors= "Mythili";
		testNodes = "Leads";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public  void createLead(String Uname, String pword,String Cname, String fname, String lname, String cityName)   {
//		create lead steps
		new LoginPage()
		.typeUsername(Uname)
		.typePassword(pword)
		.clickLogin()
		.clickCrmSfa()
		.clickLeads()
		.clickCreateLeads()
		.typeCname(Cname)
		.typeFname(fname)
		.typeLname(lname)
		.typeCityname(cityName)
		.clickCreateLead()
		.getCapname(fname);

		
	}


}
