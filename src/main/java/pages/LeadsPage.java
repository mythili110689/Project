package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class LeadsPage extends ProjectMethods {

	public LeadsPage() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLead;
	@And("Click Create Lead")
	public CreateLeadPage clickCreateLeads() {
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	@FindBy(linkText="Find Leads")
	WebElement eleFindLead;
	@And("Click Find Leads")
	public FindLeadsPage clickFindLeads() {
		click(eleFindLead);
		return new FindLeadsPage();
	}
	@FindBy(linkText="Merge Leads")
	WebElement eleMergeLead;
	
	public MergeLeadsPage clickMergeLeads() {
		click(eleMergeLead);
		return new MergeLeadsPage();
	}
	
	
}







