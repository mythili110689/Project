package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods {
	
	@FindBy(xpath="//div[text()='Duplicate Lead']")
	WebElement eleDupTitle;
	public DuplicateLeadPage checkTitle(String title) {
		verifyTitle(title);
		return this;
		
	}
}
