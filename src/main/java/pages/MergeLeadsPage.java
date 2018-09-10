package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods {
	
	@FindBy(xpath = "//img[@alt='Lookup']")
	WebElement eleFrom;
	public MergeLeadsPage clickFromLead()   {     
		click(eleFrom);
		switchWindow(1);
		return new MergeLeadsPage();
		}
	public void switchWindow(int index) {
		switchToWindow(index);
	}
	@FindBy(xpath = "(//img[@alt='Lookup'])[2]")
	WebElement eleTo;
	public MergeLeadsPage clickToLead()   {     
		click(eleTo);
		switchWindow(1);
		return new MergeLeadsPage();
		}

}
