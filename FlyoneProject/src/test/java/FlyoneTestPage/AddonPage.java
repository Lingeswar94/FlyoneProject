package FlyoneTestPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddonPage {
	public	static WebDriver driver;
	public AddonPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	@FindBy(xpath="//li[3]//div[2]//div[1]//button[2]//i[1]")
	public static WebElement PrepaidBag;

	@FindBy(xpath="//button[@class='btn addons_icon btn-selected  btn btn-primary']")
	public static WebElement BaggageGuarntee;

	@FindBy(xpath="//button[@class='btn btn-continue ml-20']")
	public static WebElement Baggagecontinue;

	@FindBy(xpath="//button[normalize-space()='Accept']")
	public static WebElement conformSeat;

	@FindBy(xpath="//button[@class='dontaccept btn btn-primary']")
	public static WebElement seatcancel;

	@FindBy(xpath="//button[normalize-space()='Accept']")
	public static WebElement seatselecting;

	@FindBy(xpath="//button[@class='btn btn-continue btn btn-primary']")
	public static WebElement seatcontinue;

	
	public void Baggageselect() {
		AddonPage.PrepaidBag.click();
	}
	public void BaggageGuarntee() {
		AddonPage.BaggageGuarntee.click();
	}
	public void Baggagecontinue() {
		AddonPage.Baggagecontinue.click();
	}
	public void conformSeat() {
		AddonPage.conformSeat.click();
	}
	public void seatselecting() {
		AddonPage.seatselecting.click();
	}
	
	
}
