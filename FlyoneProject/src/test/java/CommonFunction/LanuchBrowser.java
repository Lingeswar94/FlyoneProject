package CommonFunction;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanuchBrowser {
	public static Properties properties;
	public static WebDriver driver;
	public static ExcelProvider excelProvider;

	public Properties Loadbrowser() throws IOException {

		FileInputStream fileInputStream = new FileInputStream("./Config/Config.properties");
		properties = new Properties();
		properties.load(fileInputStream);
		return properties;
	}

	@BeforeSuite
	public void ChooseBrowser() throws IOException {
		Loadbrowser();
		String Browser = properties.getProperty("Browser");
		String Url = properties.getProperty("Url");
		// ChromeOptions option = new ChromeOptions();
		// option.addArguments("--remote-allow-origins=*");
		if (Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Unable to choose Browser");
		}
		driver.navigate().to(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@BeforeTest
	public void DataProvider() throws IOException {
		excelProvider = new ExcelProvider();

	}

	@AfterMethod
	public void TeardownMethod(ITestResult result) throws AWTException, IOException {
		if (result.getStatus() == result.FAILURE) {
			Helper.getscreenshot(driver);
		}
	}

	@AfterSuite
	public void Teardown() {
		// driver.quit();
	}
}
