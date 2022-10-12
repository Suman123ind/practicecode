package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceUIe2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
		driver.get("http://spicejet.com"); //URL in the browser
		
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[1]")).click();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		List<WebElement> Locations =driver.findElements(By.cssSelector("div[class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
		for (WebElement Location :Locations){
			if (Location.getText().equalsIgnoreCase("Goa")) {
				
				Location.click();
				break;
			}
			
		}
		
		Thread.sleep(3000);

		List<WebElement> Destinations =driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs'] //div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79'] "));
		for (WebElement Destination : Destinations) {
			if (Destination.getText().equalsIgnoreCase("Hyderabad")) {
				Destination.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		// Error : the required date is not selecting 
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-January-2022'] //div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[3]")).click();
		Thread.sleep(2000);
		
		int i=1;
		while (i<6) {
		
		driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
		i++;

		}
		
		//driver.findElement(By.cssSelector("div[data-testid='home-page-travellers-done-cta']")).click(); 
		// done button, to click it we need to know how to scroll 
		
		driver.findElement(By.cssSelector("div[data-testid='home-page-flight-cta']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector(".css-76zvg2.r-homxoj.r-1x35g6.r-1kfrs79.r-15d164r.r-38x2cy")).getText());
		driver.findElement(By.cssSelector(".css-76zvg2.r-jwli3a.r-1i10wst.r-1kfrs79")).click();
	}

}
