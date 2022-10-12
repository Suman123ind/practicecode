package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class SslCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions c = new ChromeOptions();
		c.setAcceptInsecureCerts(true);
		c.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.get("");
		
		

	}

}
