package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		//C:\Users\Suman\OneDrive\Documents\chromedriver_win32\\chromedriver.exe"

		WebDriver driver = new ChromeDriver();

		/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		
		  System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		  driver.findElement(By.id("checkBoxOption1")).click();
		  System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		// driver.findElement(By.id("checkBoxOption1")).click();
		 

		// Count the number of checkboxes

		// for one element - findElement
		// for multipe element - findElements

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());*/
		
		// Assertion types used for this below code.
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		//driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		

	}

}
