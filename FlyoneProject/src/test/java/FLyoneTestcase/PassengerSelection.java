package FLyoneTestcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunction.LanuchBrowser;
import FlyoneTestPage.PassengerPage;

public class PassengerSelection extends LanuchBrowser {

	@Test
	public void Passenger() {

		PassengerPage passengerPage = PageFactory.initElements(driver, PassengerPage.class);

		passengerPage.Paxname();
		passengerPage.DOBmonthandNational();
		passengerPage.Passportdocument();
		passengerPage.Contactdetails();
		passengerPage.Carddetails();

	}
}
