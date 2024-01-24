package FLyoneTestcase;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunction.ExcelProvider;
import CommonFunction.LanuchBrowser;
import FlyoneTestPage.SearchPage;

public class SearchFlight extends LanuchBrowser {

	@Test
	public void FlightBooking() throws IOException {

		SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
		//ExcelProvider excelProvider = new ExcelProvider();
		searchPage.Departcity();
		searchPage.Arrcity();
		searchPage.departuredate();
		searchPage.departdate();
		searchPage.onewaytrip();
		searchPage.searchbutton();

	}
}
