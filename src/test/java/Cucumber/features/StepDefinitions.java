package Cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.BeforeTest;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	WebDriver driver;

	@Given("^The user is a registered user$")
	public void the_user_is_a_registered_user() throws Throwable {
		

	}

	@When("^valid Username & Password is entered$")
	public void valid_Username_Password_is_entered() throws Throwable {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"lib/phantomjs.exe");
		WebDriver driver = new  PhantomJSDriver(caps);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//driver.findElement(By.name("userName")).sendKeys("poorvi");
		//driver.findElement(By.name("password")).sendKeys("poorvi");
		//driver.findElement(By.name("login")).click();
	    
	    
	}

	@Then("^Display success message$")
	public void display_success_message() throws Throwable {
		

	}

	@When("^valid trip details are entered$")
	public void valid_trip_details_are_entered() throws Throwable {
		

	}

	@Then("^click on continue$")
	public void click_on_continue() throws Throwable {
		

	}

	@When("^A flight is selected$")
	public void a_flight_is_selected() throws Throwable {
		

	}

	@Then("^Click on continue button$")
	public void click_on_continue_button() throws Throwable {
		

	}

	@When("^the passenger details are entered$")
	public void the_passenger_details_are_entered() throws Throwable {
		

	}

	@Then("^Click on secure purchase & click on logout$")
	public void click_on_secure_purchase_click_on_logout() throws Throwable {
		

	}

}
