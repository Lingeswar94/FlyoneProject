package FLyoneTestcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunction.LanuchBrowser;
import FlyoneTestPage.AddonMealservicespage;

public class AddonMealandservices extends LanuchBrowser {

	
	@Test
	public void MealandServices() {
		
		
		AddonMealservicespage addonMealservicespage=	PageFactory.initElements(driver, AddonMealservicespage.class);
		addonMealservicespage.Prioritynotification();
		addonMealservicespage.Ontimeguarantee();
		addonMealservicespage.servicecon();
	}
}
