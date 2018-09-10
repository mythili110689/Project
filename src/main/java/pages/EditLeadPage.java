package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	
	public EditLeadPage() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="updateLeadForm_companyName")
	WebElement eleName;
	@And("Enter companyName (.*)")
	public EditLeadPage typeNewName(String newName) {
		type(eleName,newName);
		return new EditLeadPage();
	}
	@FindBy(name="submitButton")
	WebElement eleupdate;
	@When("Click Update")
	public ViewLeadPage clickUpdate() {
		click(eleupdate);
		return new ViewLeadPage();
	}
	
}
