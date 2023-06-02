package utilites;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriverSetup {
	private static String browserName= System.getProperty("brower","chrome");
	private static final ThreadLocal<WebDriver> LOCAL_DRIVER=new ThreadLocal<>();
	
	public static void setDriver(WebDriver driver) {
		BaseDriverSetup.LOCAL_DRIVER.set(driver);
		
	}
	public static WebDriver getDriver() {
		return LOCAL_DRIVER.get();
	}
	
	public static WebDriver getBrower(String browserName) {
		switch(browserName.toLowerCase()) {
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			//options.setAcceptInsecureCerts(true);
			//@SuppressWarnings("rawtypes")
			//Map prefs = new HashMap<>();
			//prefs.put("profile.default_content_setting_values.notifications", 1);
			//options.setExperimentalOption("prefs", prefs);
			//ChromeDriver driver = new ChromeDriver(options);
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver(options);
			//return new ChromeDriver();
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		default:
			throw new RuntimeException("Browser not found! Using given name:" + browserName);
		}
		
	}
	
	@BeforeMethod 
	
	public static synchronized void SetBroweser() {
		WebDriver WebDriver= getBrower(browserName);
		WebDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriver.manage().window().maximize();
		setDriver(WebDriver);
		
	}
	
	@AfterMethod
	
	public static synchronized void quitBrowser() {
		getDriver().quit();
	}


}
