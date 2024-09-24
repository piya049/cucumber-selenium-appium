package stepdefinations;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Hook;

public class AppiumScenario {
	
	private WebDriver driver;
	
	public AppiumScenario() {
		this.driver = Hook.getDriver();
		// TODO Auto-generated constructor stub
	}

	@Given("I open the application")
	public void i_open_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Accessibility']")).isDisplayed()); 
	}

	@When("I tap on Accessibility")
	public void i_tap_on_accessibility() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@text='Accessibility']")).click(); 
	}

	@Then("I validate the Custom view")
	public void i_validate_the_custom_view() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Custom View']")).isDisplayed(), "Custom view is not displayed");
	}
	
}
