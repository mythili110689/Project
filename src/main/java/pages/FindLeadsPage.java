package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	public FindLeadsPage() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//input[@name='firstName'])[3]")
	WebElement eleFirstName;
	public FindLeadsPage typeFirstName(String fname) {
		type(eleFirstName,fname);
		return this;
	}
	@FindBy(xpath = "//span[text()='Email']")
	WebElement eleClickEmail;
	public FindLeadsPage clickEmail()
	{
		click(eleClickEmail);
		return this;
	}
	@FindBy(name = "emailAddress")
	WebElement eleEmail;
	public FindLeadsPage typeEmail(String email)
	{
		type(eleEmail,email);
		return this;
	}
	@FindBy(xpath = "//button[text()='Find Leads']")
	WebElement eleFindleads;
	public FindLeadsPage clickFindLeads() throws InterruptedException {
		click(eleFindleads);
		Thread.sleep(3000);
		return this;
	}
	
	@FindBy(xpath = "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")
	WebElement eleIdName;
	public ViewLeadPage clickLeadName()   {
		click(eleIdName);
		return new ViewLeadPage();
	}
	public String getLeadName() {
		String leadName = getText(eleIdName);
		return leadName;
	}
	
	@FindBy(xpath = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleFirstId;
	public ViewLeadPage clickId()   {    
		click(eleFirstId);
		return new ViewLeadPage();
	
	}
	public String getFirstId() {
	String text = getText(eleFirstId);
	return text;
	}
	public FindLeadsPage clickMergeId() {
		clickWithNoSnap(eleFirstId);
		return new FindLeadsPage();
	}
	@FindBy(name="id")
	WebElement eleLeadId;
	public FindLeadsPage enterId(String leadIddata) {
		type(eleLeadId, leadIddata);
		return this;
	}
	@FindBy(className="x-paging-info")
	WebElement eleRecord;
	public FindLeadsPage verifyMsg(String expectedText) {
		
		verifyExactText(eleRecord, expectedText);
	    return this;
	}
	
}







