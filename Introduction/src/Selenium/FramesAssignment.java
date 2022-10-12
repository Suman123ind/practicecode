package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		
	   int size = driver.findElements(By.tagName("frameset")).size();
	    System.out.println("Total Frames --" + size);
	    
		driver.switchTo().frame(0); // Switching the Outer Frame  
		
		size = driver.findElements(By.tagName("frame")).size();       
	    System.out.println("Total Frames --" + size);
	    
	    driver.switchTo().frame(1); // Switching to innerframe
	    
	    System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
	    
	    
	 /*   driver.get("http://the-internet.herokuapp.com/");



	    driver.findElement(By.linkText("Nested Frames")).click();



	    driver.switchTo().frame("frame-top");
 


	    driver.switchTo().frame("frame-middle");



	    System.out.println(driver.findElement(By.id("content")).getText());*/
		
	}

}
