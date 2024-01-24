package FLyoneTestcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunction.LanuchBrowser;
import FlyoneTestPage.AddonPage;

public class AddonSelecting extends LanuchBrowser {

	@Test
	public void AddonSelected() {

		AddonPage addonPage = PageFactory.initElements(driver, AddonPage.class);
		addonPage.Baggageselect();
		addonPage.BaggageGuarntee();
		addonPage.Baggagecontinue();
		addonPage.conformSeat();
		addonPage.seatselecting();
	}
}
