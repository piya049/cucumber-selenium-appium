package stepdefinations;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.IosHook;

public class IphoneBasic {

	private static IOSDriver driver;

	public IphoneBasic() {
		this.driver = IosHook.getDriver();
	}

	@When("I tap on Alert Views")
	public void i_tap_on_alert_views() {

		driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();

	}

	@Then("I tap on the Text Entry")
	public void i_tap_on_the_text_entry() {

		driver.findElement(AppiumBy.iOSClassChain("**//XCUIElementTypeStaticText[`label =='Text Entry'`]")).click();
		driver.findElement(AppiumBy.iOSClassChain("**//XCUIElementTypeCell")).sendKeys("Hello World");
		driver.findElement(AppiumBy.accessibilityId("OK")).click();
	}

}
