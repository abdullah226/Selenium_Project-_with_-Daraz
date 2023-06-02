package testcases;


import org.testng.annotations.Test;

import pages.DarazHomePage;
import utilites.BaseDriverSetup;

public class DarazHomePageTest extends BaseDriverSetup{
	
	DarazHomePage darazHomePage=new DarazHomePage();
	
	@Test
	public void TestHomePageScroll() {
		getDriver().get(darazHomePage.HOME_PAGE_URL);
		darazHomePage.ScrollToElement(darazHomePage.payment);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
