package pages;

import org.openqa.selenium.By;

public class DarazHomePage extends BasePage {
	public String HOME_PAGE_URL="https://www.daraz.com.bd/#";
	public By SIGN_UP_BUTTON= By.xpath("//a[contains(text(),'Signup / Login')]");
	public By CUSTOMER_CARE=By.xpath("//span[contains(text(),'CUSTOMER CARE')]");
	public By HELP_CENTER=By.xpath("//body/div[@id='J_LzdSiteNav']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/ul[1]/li[1]/a[1]");
	public By SAVE_MORE_APPS=By.xpath("//a[@id='topActionDownload']");
	public By DARAZ_DONATES=By.xpath("//body/div[@id='J_LzdSiteNav']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]");
	public By DARAZ_AFLET_PROGRAM=By.xpath("//body/div[@id='J_LzdSiteNav']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/a[1]");
	public By LANGUAGE=By.xpath("//span[contains(text(),'ভাষা')]");
	public By payment = By.xpath("//h3[normalize-space()='Payment Methods']");
	

}