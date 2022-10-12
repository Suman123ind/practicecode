package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ame");
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		
		for (WebElement option:options) {
			
			if (option.getText().equalsIgnoreCase("India"))
			{
			option.click();	
			break;
			}
			
			}
		
		/*List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option :options)
		{
			if (option.getText().equalsIgnoreCase("Suriname"))
			{
				option.click();
				break;
			}
		}	*/	
		

	}

}
