package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Hook;

public class Wifisetting {

private WebDriver driver; 
	
	public Wifisetting() {
		this.driver = Hook.getDriver();
		// TODO Auto-generated constructor stub
	}
	
	@Given("I open the new application")
	public void i_open_the_new_application() {
		Assert.assertTrue(driver.findElement(AppiumBy.accessibilityId("Preference")).isDisplayed());
	}
	
	@When("I tap on Preference")
	public void i_tap_on_preference() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	}

	@Then("I tap on the Preference dependencies")
	public void i_tap_on_the_preference_dependencies() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        Thread.sleep(3000);
	}

	@Then("I need to check the checkbox to see the wifi settings")
	public void i_need_to_check_the_checkbox_to_see_the_wifi_settings() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("android:id/checkbox")).click();

	}

	@Then("I Validate wifi settings")
	public void i_validate_wifi_settings() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).isDisplayed());

	}
	
	@Then("I tap on wifi settings")
	public void i_tap_on_wifi_settings() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	}

	@Then("I set the name")
	public void i_set_the_name() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);		
		driver.findElement(By.id("android:id/edit")).sendKeys("Piyush-Wifi");
		driver.findElement(By.id("android:id/button1")).click();
		
	}



	
}
