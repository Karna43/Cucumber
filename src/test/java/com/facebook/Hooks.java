package com.facebook;
import io.cucumber.core.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.facebook.basefunctions.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void launchingBrowser(Scenario scenario) {
		BaseClass.browserLaunch();
		BaseClass.goToUrl("https://www.facebook.com");
		final byte[] source= ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(source, "image/png");
	}
	
	@After
	public void closingBrowser(Scenario scenario) {
		final byte[] source= ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(source, "image/png");
		//BaseClass.browserQuit();
		
	}
}
