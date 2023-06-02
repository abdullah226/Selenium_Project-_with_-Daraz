package pages;

import org.openqa.selenium.By;

public class DarazLoginPage  extends BasePage{
	public String LOGIN_PAGE_URL="https://member.daraz.com.bd/user/login";
	public By EMAIL=By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]");
	public By PASSWORD=By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
	public By LOGIN=By.xpath("//button[contains(text(),'LOGIN')]");
	public By ERROR_MASSEGE=By.xpath("//div[@class=\"next-feedback-content\"]");
	
	public void DoLogin(String UserName, String Password) {
		WriteToText(EMAIL, UserName);
		WriteToText(PASSWORD, Password);
		ClickOnElement(LOGIN);
		
	}
}
