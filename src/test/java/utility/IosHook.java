package utility;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class IosHook {


	private static IOSDriver driver;
	public AppiumDriverLocalService service;

	@Before("@SmokeTest")
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//Pshende//Downloads//chromedriver-win64//chromedriver.exe");
//		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Before("@Alert")
	public void setUpAppium() throws MalformedURLException {

		service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//Pshende//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		XCUITestOptions options = new XCUITestOptions();
		options.setDeviceName("Iphone 13");
		options.setApp("D://cucumberseleniumappium//App//UIKitCatalog.app"); 
		options.setPlatformVersion("15.5"); // IOS version
//		appium-> webdriver agent -> IOS Apps
		options.setWdaLaunchTimeout(Duration.ofSeconds(20));
		
		driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);

	
	}
		
	

	@After
	public void tearDown() {
		driver.quit();
		service.stop();
	}

	public static IOSDriver getDriver() {
		return driver;
	}


}
