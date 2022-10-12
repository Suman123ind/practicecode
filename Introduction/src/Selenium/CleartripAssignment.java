package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CleartripAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@aria-label='Tue Jan 04 2022']")).click();
		
		
WebElement	StaticDropdown	= driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[1]"));
		
		Select dropdown = new Select(StaticDropdown);
		
		dropdown.selectByIndex(5);
		
		
		
WebElement	child = driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[2]"));
		
		Select ch = new Select(child);
		
		ch.selectByIndex(4);
	
	
		driver.findElement(By.xpath("//a[@class='td-none hover:td-underline px-4 mt-1 weak']")).click();
		Thread.sleep(3000);
		
	

		driver.findElement(By.xpath("//a[@class='td-none hover:td-underline px-4 mt-1 weak']")).sendKeys("indiGo");
		
		driver.findElement(By.xpath("(//div[@class='col flex flex-middle'])[6]")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//span[@class='to-ellipsis o-hidden ws-nowrap fs-3 c-white']")).getText());
		
		
		

	}

}
