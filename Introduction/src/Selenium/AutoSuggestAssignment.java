package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Actions A = new Actions(driver);
		
		A.moveToElement(driver.findElement(By.id("autocomplete"))).click().sendKeys("ind").build().perform();
		Thread.sleep(2000);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	  // System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
        
        JavascriptExecutor Js = (JavascriptExecutor) driver;
        String text = Js.executeScript("return document.getElementById('autocomplete').value").toString();
        System.out.println("Text written in the box is- " + text);
		

	}

}
