package FLyoneTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunction.LanuchBrowser;
import FlyoneTestPage.FlightResultPage;

public class FlightSelect extends LanuchBrowser {

	
	@Test
	public void Flightselected() {
		
		FlightResultPage flightSelect=	PageFactory.initElements(driver, FlightResultPage.class);
		flightSelect.FLightSelecting();
		flightSelect.Standwithoutclub();
		flightSelect.Changeflex();
		flightSelect.Continuebuttom();
		
	}
	
}
