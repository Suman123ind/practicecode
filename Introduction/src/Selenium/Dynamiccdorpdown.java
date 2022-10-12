package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamiccdorpdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // From Location Tab
		driver.findElement(By.xpath("//a[@value='BLR']")).click(); // from location bengalore will be selected.
		Thread.sleep(2000);
		
		// we have selected the Destination location using xpath locator Based on Index value
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();//To location Chennai will be selected.
		
		// We can also select the Destination location using parent child relationship
		// parent child relationship = Parent Xpath child Xpath (A small space will be given between parent and child xpath)
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		

	}

}
