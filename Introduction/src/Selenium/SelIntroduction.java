package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Chrome browser
		//ChromeDriver driver = new ChromeDriver(); // this obj can access only chromedriver class methods.
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

		
		//WebDriver driver = new ChromeDriver(); // This obj can now access all the web classes like chrome,firefox,msedge

		// chromedriver.exe -> chrome browser 
		
		// webdriver.chrome.driver -> value of path
		
		
		// Firefox driver
		
		// Firefox -> geckodriver 
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Suman\\OneDrive\\Documents\\geckodriver-v0.30.0-win64"\\geckodriver);
		
		//WebDriver driver = new FirefoxDriver();
		
		
		//Microsoft edge
		//Edge driver
		
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Suman\\OneDrive\\Documents\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.netflix.com/browse");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.quit();
	}

}
