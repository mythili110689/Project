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
//public class CreateLead {
//	public ChromeDriver driver;
//	@Given("Launch the browser")
//	public void launchBrowser() {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//	  driver = new ChromeDriver();
//		}
//	@And("Maximize the browser")
//	public void maximize() {
//		driver.manage().window().maximize();
//			}
//	@And("Set timeout")
//	public void timeOut() {
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		}
//	@And("Load URL")
//	public void loadUrl() {
//		driver.get("http://leaftaps.com/opentaps");
//			}
//	@And("Enter Username (.*)")
//	public void typeUsername(String uName) {
//		driver.findElementByName("USERNAME").sendKeys(uName);
//		
//	}
//	@And("Enter password (.*)")
//	public void typePassword(String password) {
//		driver.findElementByName("PASSWORD").sendKeys(password);
//	}
//	@And("Click Login")
//	public void clickLogin() {
//		driver.findElementByClassName("decorativeSubmit").click();
//	}
//	@And("Click Crmsfa")
//	public void clickCrmsfa() {
//		driver.findElementByLinkText("CRM/SFA").click();
//	}
//	@And("Click Leads")
//	public void clickLeads() {
//		driver.findElementByLinkText("Leads").click();
//	}
//	@And("Click Create Lead")
//	public void createLead() {
//		driver.findElementByLinkText("Create Lead").click();
//	}
//	@And("Enter CompanyName (.*)")
//	public void enterCname(String cName) {
//		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
//	}
//	@And("Enter FirstName (.*)")
//	public void enterFname(String fName) {
//		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
//	}
//	@And("Enter LastName (.*)")
//	public void enterLname(String lName) {
//		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
//	}
//	@When("Click CreateLead Button")
//	public void clickClead() {
//		driver.findElementByName("submitButton").click();
//	}
//	@Then("Verify PageTitle")
//	public void verifyTitle() {
//	   String title = driver.getTitle();
//	   if(title.contains("View Lead")) {
//		   System.out.println("The title is matched" +title );
//	   }else {
//		   System.out.println("The title is not matched" +title );
//	   }
//	}
//	
//		
//	}
//	
