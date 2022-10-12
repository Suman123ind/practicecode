package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Section11Assessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
	 System.out.println(driver.findElement(By.cssSelector("label[for='bmw']")).getText());
	 String Option =driver.findElement(By.cssSelector("label[for='bmw']")).getText();
	 
	 
	 WebElement staticDropdown =driver.findElement(By.id("dropdown-class-example"));
	 Select S = new Select(staticDropdown);
	 S.selectByVisibleText(Option);
	 
	 driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys(Option);
	 driver.findElement(By.id("alertbtn")).click();
	 
	 String text=  driver.switchTo().alert().getText();

     if(text.contains(Option))

     {

    System.out.println("Alert message success");

     }

     else {

    System.out.println("Something wrong with execution");

}

       
	 
	 driver.switchTo().alert().accept();

	}

}
