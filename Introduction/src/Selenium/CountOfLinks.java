package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Count of Total links from the entire page.
		int totalCount = driver.findElements(By.tagName("a")).size();
		System.out.println("The total Links counts --" + totalCount);

		// Count of links from the footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		int footerCount = footerDriver.findElements(By.tagName("a")).size();
		System.out.println("Total links in footer section -- " + footerCount);

		// Count of links from the column
		WebElement ColumnDriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int ColumnCount = ColumnDriver.findElements(By.tagName("a")).size();
		System.out.println("Total links in Column section --" + ColumnCount);

		// Click on each link in the column and check pages are opening
		for (int i = 1; i < ColumnDriver.findElements(By.tagName("a")).size(); i++) {

			String Click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(Click);
		}
		// Print the Titles of the Each tab by iterator

		Set<String> tabs = driver.getWindowHandles(); // it is having 4 windows in his hands
		Iterator<String> it = tabs.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			String title = driver.getTitle();
			System.out.println(title);
		}

	}

}
