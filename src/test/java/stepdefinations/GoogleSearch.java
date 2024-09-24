package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Hook;

public class GoogleSearch {

	private WebDriver driver;

	public GoogleSearch() {
		this.driver = Hook.getDriver();
	}

	@Given("^I open a browser$")
	public void i_open_a_browser() throws Throwable {

//		System.out.println("Browser is opened");
		Thread.sleep(2000);
		System.out.println("Current URL : " + driver.getCurrentUrl());
	}

	@When("^I navigate to google page$")
	public void i_navigate_to_google_page() throws Throwable {
//		System.out.println("Navigate to google page");
		driver.get("https://www.google.co.in/");

	}

	@And("I enter {string} in search keyword")
	public void i_enter_in_search_keyword(String searchText) throws InterruptedException  {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(searchText);
		Thread.sleep(3000);
	}

	@Then("I tap on search")
	public void i_tap_on_search() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

}
