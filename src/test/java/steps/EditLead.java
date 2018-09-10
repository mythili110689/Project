//package steps;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class EditLead {
//	
//	public ChromeDriver driver;
//	@Given("Launching browser")
//	public void launch() {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//			}
//	@And("Maximizing browser")
//	public void maximize() {
//		driver.manage().window().maximize();
//				}
//	@And("Timeout")
//	public void timeOut() {
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//			}
//	@And("Load the URL")
//	public void loadUrl() {
//		driver.get("http://leaftaps.com/opentaps");
//				}
//	@And("Enter userName (.*)")
//	public void typeUsername(String uName) {
//		driver.findElementByName("USERNAME").sendKeys(uName);
//			
//		}
//	@And("Enter Password (.*)")
//	public void typePassword(String password) {
//		driver.findElementByName("PASSWORD").sendKeys(password);
//		}
//	@And("Login")
//	public void clickLogin() {
//		driver.findElementByClassName("decorativeSubmit").click();
//		}
//	@And("Click CRMSFA")
//	public void clickCrmsfa() {
//		driver.findElementByLinkText("CRM/SFA").click();
//		}
//	@And("Click the Leads")
//	public void Leads() {
//		driver.findElementByLinkText("Leads").click();
//		}
//	@And("Click Find Leads")
//	public void clickFindLeads() {
//		driver.findElementByLinkText("Find Leads").click();
//	    }
//	@And("Enter First Name (.*)")
//	public void enterName(String name) {
//		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(name);
//	}
//	@And("Click FindLeads Button")
//	public void findLeads() {
//		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
//	   }
//	@And("Click Id")
//	public void clickId() {
//		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
//		}
//	@And("Click Edit")
//	public void clickEdit() {
//		driver.findElementByXPath("//a[text()='Edit']").click();
//		}
//	@And("Enter companyName (.*)")
//	public void comName(String cName) {
//		driver.findElementById("updateLeadForm_companyName").sendKeys(cName);
//		}
//	@When("Click Update")
//	public void clickUpdate() {
//		driver.findElementByName("submitButton").click();
//		}
//	@Then("Verify Updated Cname (.*)")
//	public void verifyName(String upName) {
//		String text = driver.findElementById("updateLeadForm_companyName").getText();
//		if(text.equals(upName)) {
//			System.out.println("The name is matched");
//		}else {
//			System.out.println("The name is not matched");
//		}
// 	}
//	}
//
