package FlyoneTestPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import CommonFunction.ExcelProvider;
import CommonFunction.LanuchBrowser;

public class SearchPage extends LanuchBrowser{
	
	//WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='inboundcity']")
	public static WebElement departurecity;

	@FindBy(xpath = "//*[normalize-space()='One way']")
	public static WebElement oneway;

	@FindBy(xpath = "//input[@id='outboundcity']")
	public static WebElement outboundcity;

	@FindBy(xpath = "//*[@class='pika-next']")
	public static WebElement Departuredate;

	@FindBy(xpath = "//*[@data-pika-day='6']")
	public static WebElement date;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-block btn-form']")
	public static WebElement searchbutton;

	public void Departcity() {
		SearchPage.departurecity.sendKeys(excelProvider.getstringdata("Route", 0, 1));
		SearchPage.departurecity.sendKeys(Keys.ENTER);
	}

	public void Arrcity() {
		SearchPage.outboundcity.sendKeys(excelProvider.getstringdata("Route", 1, 1));
		 SearchPage.outboundcity.sendKeys(Keys.ENTER);
	}

	public void departuredate() {
		Departuredate.click();
	}

	public void departdate() {
		date.click();
	}

	public void onewaytrip() {
		oneway.click();
	}

	public void searchbutton() {
		searchbutton.click();
	}
}
