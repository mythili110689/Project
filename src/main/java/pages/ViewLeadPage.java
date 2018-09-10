package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="viewLead_firstName_sp")
	WebElement eleCapname;
	public ViewLeadPage getCapname(String expectedText) {
		
		verifyExactText(eleCapname,expectedText);
		return new ViewLeadPage() ;
	}
	@FindBy(linkText="Edit")
	WebElement eleEdit;
	@And("Click Edit")
	public EditLeadPage clickEdit() {
		click(eleEdit);
		return new EditLeadPage();
	}
	
	@FindBy(linkText="Duplicate Lead")
	WebElement eleDuplicate;
	public DuplicateLeadPage clickDuplicate() {
		click(eleDuplicate);
		return new DuplicateLeadPage();
	}
	
	@FindBy(linkText="Delete")
	WebElement eleDelete;
	@And("Click Delete")
	public LeadsPage clickDelete() {
		click(eleDelete);
		return new LeadsPage();
	}
	

}
