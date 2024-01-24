package FlyoneTestPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddonMealservicespage {

	public static WebDriver driver;

	public AddonMealservicespage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm btn btn-primary btn-block']")
	public static WebElement Mealtype;

	@FindBy(xpath = "//button[@class='btn_book_now btn btn-link btn-block']")
	public static WebElement choosemeal;

	@FindBy(xpath = "//div[@id='mealsSegmentTab-tabpane-Adult1_SEG_EVNKIV_2']//li[2]//div[1]//button[1]")
	public static WebElement choosemealmed;

	@FindBy(xpath = "//button[@class='btn addons_icon btn-selected btn btn-primary']")
	public static WebElement Prioritynotification;

	@FindBy(xpath = "//button[@class='btn addons_icon btn-selected btn btn-primary']")
	public static WebElement Ontimeguarantee;

	@FindBy(xpath = "//button[@class='btn btn-continue btn btn-primary']")
	public static WebElement servicecon;
	
	
	public void Prioritynotification() {
		AddonMealservicespage.Prioritynotification.click();
	}
	
	public void Ontimeguarantee() {
		AddonMealservicespage.Ontimeguarantee.click();
	}
	public void servicecon() {
		AddonMealservicespage.servicecon.click();
	}
}
