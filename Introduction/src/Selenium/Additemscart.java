package Selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Additemscart {
	
	public static void addItems(WebDriver driver,String [] items) {
		
		int j=0;

	List<WebElement> products  = driver.findElements(By.cssSelector("h4.product-name"));
	
	for (int i=0;i<products.size();i++) {
		String[] name =products.get(i).getText().split("-");
		String formattedName=name[0].trim();
		
		// Here we need to convert Array to Arraylist
        List<String> itemsList = Arrays.asList(items);
        

        if (itemsList.contains(formattedName)) {
        	j++;
        	
        	driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
        	
        	if (j==items.length) {
        		break;
        	}
        }

		
	}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		String [] items = {"Carrot","Apple","Mushroom","Banana","Onion","Corn"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver, items);
		
	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

	}

}
