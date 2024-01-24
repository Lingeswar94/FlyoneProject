package FlyoneTestPage;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import CommonFunction.ExcelProvider;
import CommonFunction.LanuchBrowser;

public class PassengerPage extends LanuchBrowser {

	public static WebDriver driver;

	public PassengerPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//select[@class='form-control']")
	public static WebElement Gender;

	@FindBy(xpath = "//input[@autocomplete='new-firstnameAdult1']")
	public static WebElement Firstname;

	@FindBy(xpath = "//input[@autocomplete='new-lastnameAdult1']")
	public static WebElement Lastname;

	@FindBy(xpath = "//input[@id='passenger[Adult1][dateOfBirth]']")
	public static WebElement DOB;

//	@FindBy(xpath="//div[@class='CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1']/div[2]/select")
	// div[@class='CalendarMonthGrid_month__horizontal
	// CalendarMonthGrid_month__horizontal_1']//div[@class='CalendarMonth_caption
	// CalendarMonth_caption_1']//div//div[1]//select[1]
	@FindBy(xpath = "//div[@class='CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1']//div[@class='CalendarMonth_caption CalendarMonth_caption_1']//div//div[1]//select[1]")
	public static WebElement Month;

	@FindBy(xpath = "//div[@class='CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1']//div[2]//select[@style='font-size: 15px;']")
	public static WebElement Year;
	// div[@class='CalendarMonthGrid_month__horizontal
	// CalendarMonthGrid_month__horizontal_1']//div[2]//select[1]
	// div[@class='CalendarMonthGrid_month__horizontal
	// CalendarMonthGrid_month__horizontal_1']//div[2]//select[@style='font-size:
	// 15px;']
	@FindBy(xpath = "//td[@aria-label='Monday, June 6, 1994']")
	public static WebElement Date;
	// select[@name='passenger[Adult1][nationalityCode]']
	@FindBy(xpath = "//select[@name='passenger[Adult1][nationalityCode]']")
	public static WebElement Nationality;

	@FindBy(xpath = "//input[@name='passenger[Adult1][passport]']")
	public static WebElement Passportnumber;

	@FindBy(xpath = "//select[@name='passenger[Adult1][passportCountryCode]']")
	public static WebElement Document;

	@FindBy(xpath = "//input[@id='passenger[Adult1][passportIssuedDate]']")
	public static WebElement Dateofissue;
	// div[@class='CalendarMonthGrid_month__horizontal
	// CalendarMonthGrid_month__horizontal_1']//div[@class='CalendarMonth_caption
	// CalendarMonth_caption_1']//div//div[1]//select[1]
	// div[@class='CalendarMonthGrid_month__horizontal
	// CalendarMonthGrid_month__horizontal_1']//div[@class='CalendarMonth_caption
	// CalendarMonth_caption_1']//div//div[1]//select[1]
	@FindBy(xpath = "//div[@class='CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1']//div[@class='CalendarMonth_caption CalendarMonth_caption_1']//div//div[1]//select[1]")
	public static WebElement issuemonth;

	@FindBy(xpath = "//div[@class='CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1']//div[2]//select[1]")
	public static WebElement issueyear;

	@FindBy(xpath = "//td[@aria-label='Tuesday, May 10, 2016']")
	public static WebElement issuedate;

	@FindBy(xpath = "//div[@class='form-group mb-0']//div[@class='inline-group']//div[@class='form-control has-content']//div[@class='SingleDatePicker SingleDatePicker_1']//div//input[contains(@id,'passenger')]")
	public static WebElement Expiry;

	@FindBy(xpath = "//div[@class='CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1']//div[@class='CalendarMonth_caption CalendarMonth_caption_1']//div//div[1]//select[1]")
	public static WebElement Expirymonth;

	@FindBy(xpath = "//div[@class='CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1']//div[2]//select[1]")
	public static WebElement Expiryyear;

	@FindBy(xpath = "//td[@aria-label='Tuesday, June 12, 2029']")
	public static WebElement Expirydate;

	@FindBy(xpath = "//input[@id='emailValidation']")
	public static WebElement Email;

	@FindBy(xpath = "//input[@id='cnfmEmailValidation']")
	public static WebElement Conformemail;

	@FindBy(xpath = "//div[contains(@class,' css-tlfecz-indicatorContainer')]")
	public static WebElement Countrycode;

	@FindBy(xpath = "//div[@class=' css-11unzgr']/div")
	public static List<WebElement> Countryselect;

	@FindBy(xpath = "//input[@name='contactdetail[phoneNo]']")
	public static WebElement phonenumber;

	@FindBy(xpath = "//button[@class='btn addons_icon btn-block btn-selected btn btn-primary']")
	public static WebElement SMS;

	@FindBy(xpath = "//input[@id='payId_270']")
	public static WebElement Cardtype;

	@FindBy(xpath = "//input[@id='cardnumber1']")
	public static WebElement cardnumber1;
	@FindBy(xpath = "//input[@id='cardnumber2']")
	public static WebElement cardnumber2;
	@FindBy(xpath = "//input[@id='cardnumber3']")
	public static WebElement cardnumber3;
	@FindBy(xpath = "//input[@id='cardnumber4']")
	public static WebElement cardnumber4;

	@FindBy(xpath = "//input[@id='cardholder']")
	public static WebElement cardname;

	@FindBy(xpath = "//select[@name='cardInfo[expMonth]']")
	public static WebElement cardExpirymonth;

	@FindBy(xpath = "//select[@name='cardInfo[expYear]']")
	public static WebElement cardExpiryyear;

	@FindBy(xpath = "//input[@id='cvv']")
	public static WebElement cvv;

	@FindBy(xpath = "//input[@id='acceptBillTerms']")
	public static WebElement Condition;

	@FindBy(xpath = "//button[@class='btn btn-continue btn btn-primary']")
	public static WebElement Paynow;
//---------------------------------

	/*
	 * public void genderselecting() { Select select = new
	 * Select(PassengerPage.Gender); select.selectByVisibleText("Male"); }
	 */

	public void Paxname() {
		Select gender = new Select(PassengerPage.Gender);
		gender.selectByVisibleText("Male");
		PassengerPage.Firstname.sendKeys(excelProvider.getstringdata("PaxName", 1, 1));
		PassengerPage.Lastname.sendKeys(excelProvider.getstringdata("PaxName", 2, 1));
		PassengerPage.DOB.click();
	}

	public void DOBmonthandNational() {
		Select month = new Select(PassengerPage.Month);
		month.selectByVisibleText(excelProvider.getstringdata("PaxName", 3, 1));
		Select year = new Select(PassengerPage.Year);
		year.selectByValue(excelProvider.getstringdata("PaxName", 4, 1));
		PassengerPage.Date.click();
		Select national = new Select(PassengerPage.Nationality);
		national.selectByVisibleText(excelProvider.getstringdata("PaxName", 6, 1));
	}

	/*
	 * public void DOByear() { Select select2 = new Select(PassengerPage.Year);
	 * select2.selectByValue("1994"); }
	 */

	/*
	 * public void national() { Select select6 = new
	 * Select(PassengerPage.Nationality); select6.selectByVisibleText("India");
	 * 
	 * }
	 */

	public void Passportdocument() {
		PassengerPage.Passportnumber.sendKeys(excelProvider.getstringdata("PaxName", 7, 1));
		Select doc = new Select(PassengerPage.Document);
		doc.selectByVisibleText(excelProvider.getstringdata("PaxName", 8, 1));
		PassengerPage.Dateofissue.click();
		Select issuemonth = new Select(PassengerPage.issuemonth);
		issuemonth.selectByVisibleText(excelProvider.getstringdata("PaxName", 9, 1));
		Select issueyear = new Select(PassengerPage.issueyear);
		issueyear.selectByVisibleText(excelProvider.getstringdata("PaxName", 10, 1));
		PassengerPage.issuedate.click();
		PassengerPage.Expiry.click();
		Select expirymonth = new Select(PassengerPage.Expirymonth);
		expirymonth.selectByVisibleText(excelProvider.getstringdata("PaxName", 11, 1));
		Select expiryyear = new Select(PassengerPage.Expiryyear);
		expiryyear.selectByVisibleText(excelProvider.getstringdata("PaxName", 12, 1));
		PassengerPage.Expirydate.click();
	}

	/*
	 * public void Issuemonth() { Select issuemonth = new
	 * Select(PassengerPage.issuemonth); issuemonth.selectByVisibleText("May"); }
	 * 
	 * public void Issueyear() { Select issueyear = new
	 * Select(PassengerPage.issueyear); issueyear.selectByVisibleText("2016"); }
	 * 
	 * public void expirymonth() { Select expirymonth = new
	 * Select(PassengerPage.Expirymonth); expirymonth.selectByVisibleText("June"); }
	 * 
	 * public void expiryyear() { Select expiryyear = new
	 * Select(PassengerPage.Expiryyear); expiryyear.selectByVisibleText("2029"); }
	 */

	public void Contactdetails() {
		PassengerPage.Email.sendKeys(excelProvider.getstringdata("PaxName", 13, 1));
		PassengerPage.Conformemail.sendKeys(excelProvider.getstringdata("PaxName", 14, 1));
		PassengerPage.Countrycode.click();
		int size = PassengerPage.Countryselect.size();
		for (int i = 0; i <= size; i++) {
			if (Countryselect.get(i).getText().equalsIgnoreCase(excelProvider.getstringdata("PaxName", 15, 1))) {
				Countryselect.get(i).click();
				break;
			}
		}

		PassengerPage.phonenumber.sendKeys(excelProvider.getstringdata("PaxName", 16, 1));
		PassengerPage.SMS.click();
	}

	public void Carddetails() {
		PassengerPage.Cardtype.click();
		PassengerPage.cardnumber1.sendKeys(excelProvider.getstringdata("PaxName", 17, 1));
		PassengerPage.cardnumber2.sendKeys(excelProvider.getstringdata("PaxName", 17, 2));
		PassengerPage.cardnumber3.sendKeys(excelProvider.getstringdata("PaxName", 17, 3));
		PassengerPage.cardnumber4.sendKeys(excelProvider.getstringdata("PaxName", 17, 4));
		PassengerPage.cardname.sendKeys(excelProvider.getstringdata("PaxName", 18, 1));
		Select cardmonth = new Select(PassengerPage.cardExpirymonth);
		cardmonth.selectByVisibleText(excelProvider.getstringdata("PaxName", 19, 1));
		Select cardyear = new Select(PassengerPage.cardExpiryyear);
		cardyear.selectByVisibleText(excelProvider.getstringdata("PaxName", 20, 1));
		PassengerPage.cvv.sendKeys(excelProvider.getstringdata("PaxName", 21, 1));
		PassengerPage.Condition.click();
		PassengerPage.Paynow.click();
	}
}
