package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updatedropdown {
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click(); // It will click on the dropdown
		Thread.sleep(3000);
		
		int i = 1;
		while (i<5) {
		 
		 driver.findElement(By.id("hrefIncAdt")).click(); // it will click on the Adult '+' button for 9 times.

              i++;
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		
		int j=0;
		for (j=0;j<=3;j++) {
			
			
			driver.findElement(By.id("hrefIncChd")).click(); // it will click on the Child '+' button for
			
		}

		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		

	}

}
