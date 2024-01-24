package FlyoneTestPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunction.LanuchBrowser;
import FLyoneTestcase.FlightSelect;

public class FlightResultPage extends LanuchBrowser {

	public static WebDriver driver;

	public FlightResultPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//button[@class='btn-primary btn btn-primary']")
	public static WebElement Chooseflight;

	@FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-block')]//h4[contains(text(),'€ 57')]")
	public static WebElement Standardwithoutclub;

	@FindBy(xpath = "//div[@class='xxs-no-pad col-md-12 col-sm-12 col']//div[1]//div[1]//div[1]//div[3]//div[1]//button[1]")
	public static WebElement Lockfare;
	// div[@class='xxs-no-pad col-md-12 col-sm-12
	// col']//div[1]//div[1]//div[1]//div[3]//div[1]//button[1]
	@FindBy(xpath = "//div[@class='container right-container result-box']//div//div[2]//div[1]//div[1]//div[3]//div[1]//button[1]")
	public static WebElement Changeflex;
	// div[@class='container right-container
	// result-box']//div//div[2]//div[1]//div[1]//div[3]//div[1]//button[1]

	@FindBy(xpath = "//button[@class='btn btn-continue btn btn-primary']")
	public static WebElement continuebtn;

	public void FLightSelecting() {

		FlightResultPage.Chooseflight.click();
	}

	public void Standwithoutclub() {

		FlightResultPage.Standardwithoutclub.click();
	}

	public void Changeflex() {

		FlightResultPage.Changeflex.click();
	}

	public void Continuebuttom() {

		FlightResultPage.continuebtn.click();
	}
}
