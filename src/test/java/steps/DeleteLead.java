package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DeleteLead {
	public ChromeDriver driver;
	@Given("Launching browser")
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
			}
	@And("Maximizing browser")
	public void maximize() {
		driver.manage().window().maximize();
				}
	@And("Timeout")
	public void timeOut() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			}
	@And("Load the URL")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps");
				}
    @And("Enter userName (.*)")
	public void typeUsername(String uName) {
		driver.findElementById("username").sendKeys(uName);
			
		}
	@And("Enter Password (.*)")
	public void typePassword(String password) {
		driver.findElementById("password").sendKeys(password);
		}
	@And("Login")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		}
	@And("Click CRMSFA")
	public void clickCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
		}
	@And("Click the Leads")
	public void Leads() {
		driver.findElementByLinkText("Leads").click();
		}
	@And("Click Find Leads")
	public void clickFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
	    }
	@And("Enter First Name (.*)")
	public void enterName(String name) {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(name);
	}
	@And("Click FindLeads Button")
	public void findLeads() {
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
	   }
	@And("Click Id")
	public void clickId() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		}
	@And("Click Delete")
	public void clickDelete() {
		driver.findElementByLinkText("Delete").click();
		}
	@And("Enter Id")
	public void enterid(String id) {
		String leadId = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByName("id").sendKeys(leadId);
	}
	@Then("verify the message")
	public void verifyMsg(String message) {
		String msg = driver.findElementByClassName("x-paging-info").getText();
		if(msg.equals(message))	{
			System.out.println("The message is verified" + msg);
		}else {
			System.out.println("The message is not verified");
		}
	}
}
