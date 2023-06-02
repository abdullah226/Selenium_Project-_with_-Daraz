package testcases;
//import static org.testng.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.DarazHomePage;
import pages.DarazLoginPage;
import utilites.BaseDriverSetup;
import utilites.DataSet;

public class DarazLoginPageTest extends BaseDriverSetup{ 
	
	DarazHomePage darazHomePage= new DarazHomePage();
	DarazLoginPage darazLoginPage= new DarazLoginPage();

	
	@Test (dataProvider = "invalid", dataProviderClass = DataSet.class)
	public void TestLoginWithIvalidPhoneNumber(String username, String password, String ErrorMessage) {
		getDriver().get(darazHomePage.HOME_PAGE_URL);
		darazHomePage.ClickOnElement(darazHomePage.SIGN_UP_BUTTON);
		darazLoginPage.WriteToText(darazLoginPage.EMAIL, username);
		darazLoginPage.WriteToText(darazLoginPage.PASSWORD, password);
		darazLoginPage.TakeScreenShort("Login Info");
		darazLoginPage.ClickOnElement(darazLoginPage.LOGIN);
		darazLoginPage.TakeScreenShort("Login");
		//assertEquals(darazLoginPage.getElement(darazLoginPage.ERROR_MASSEGE).getText(), ErrorMessage); 			
	}

}
