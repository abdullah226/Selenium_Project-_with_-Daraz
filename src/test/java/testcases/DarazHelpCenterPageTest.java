package testcases;

import org.testng.annotations.Test;

import io.qameta.allure.Description;

import static org.testng.Assert.assertEquals;


import pages.DarazHelpCenterPage;
import utilites.BaseDriverSetup;

public class DarazHelpCenterPageTest extends BaseDriverSetup{
	DarazHelpCenterPage DarazHelpCenterPage=new DarazHelpCenterPage();
	
	@Test(description="Test Help Center Page Title")
	@Description("Test help Center Page Title Description using Allure.")
	public void TestHelpCenterPageTitle() {
		getDriver().get(DarazHelpCenterPage.HELP_CENTER_URL);
		assertEquals(getDriver().getTitle(),DarazHelpCenterPage.HELP_CENTER_TITLE);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DarazHelpCenterPage.TakeScreenShort("Help Center page");
		
	}
	
	@Test
	public void TestHelpCenterPageUrl() {
		getDriver().get(DarazHelpCenterPage.HELP_CENTER_URL);
		assertEquals(getDriver().getCurrentUrl(),DarazHelpCenterPage.HELP_CENTER_URL);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DarazHelpCenterPage.TakeScreenShort("Help Center page");
		
	}
}

