package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderDateMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		//write a while loop to select month
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("July")) {
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}
		//Select date using for loop
		//grab the common attribute
		//put into list
		//iterate the list
		List <WebElement> dates =driver.findElements(By.className("day"));
		
		for (WebElement date:dates) {
			if (date.getText().equalsIgnoreCase("7")) {
				date.click();
				break;
			}
		}

	}

}
