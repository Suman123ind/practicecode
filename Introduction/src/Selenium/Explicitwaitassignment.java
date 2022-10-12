package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		WebDriverWait W = new WebDriverWait(driver,7);
		
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		
		W.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		
		System.out.println(driver.findElement(By.id("results")).getText());

	}

}
