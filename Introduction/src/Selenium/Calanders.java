package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calanders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		driver.findElement(By.xpath("//a[@value='BLR']")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click(); // this is selecting the date


		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); // this is not selecting the date-testfail
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) // 0.5=disabled, 1=enabled
		{
			System.out.println("its disabled");
			Assert.assertTrue(true);
		}
		
		else {
			Assert.assertFalse(false);
		}
		
		
		
	}

}
