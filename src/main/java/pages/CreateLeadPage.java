package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	public CreateLeadPage() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCname;
	@And("Enter CompanyName (.*)")
	public CreateLeadPage typeCname(String name ) {
		type(eleCname,name);
		return this;
	}
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFname;
	@And("Enter FirstName (.*)")
	public CreateLeadPage typeFname(String fname)
	{
		type(eleFname,fname);
		return this;
	}
	@FindBy(id="createLeadForm_lastName")
	WebElement eleLname;
	@And("Enter LastName (.*)")
	public CreateLeadPage typeLname(String lname)
	{
		type(eleLname,lname);
		return this;
	}
	
	@FindBy(id="createLeadForm_generalCity")
	WebElement eleCity;
	public CreateLeadPage typeCityname(String cityName)
	{
		type(eleCity,cityName);
		return this;
	}
	
	@FindBy(className="smallSubmit")
	WebElement eleCreate;
	@When("Click CreateLead Button")
	public ViewLeadPage clickCreateLead()
	{
		click(eleCreate);
		return new ViewLeadPage();
	}
}







