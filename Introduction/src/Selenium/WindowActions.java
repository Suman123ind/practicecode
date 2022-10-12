package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Set<String> windows =driver.getWindowHandles();
	    Iterator<String> it = windows.iterator();
	    String ParentID =it.next();
	    String ChildID =it.next();
	    
	    driver.switchTo().window(ChildID);
	    System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
	    driver.switchTo().window(ParentID);
	    System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
			

	}

}
