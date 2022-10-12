package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Statdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//The address of the dropdown is saved in staticDropdown variable and find element returns the webelement.
    	WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
    	
    	// for a static dropdowns we use the Select class. we need to give the address of the dropdown which we saved in variable staticDropdown
		Select dropdown = new Select(staticDropdown); 
		
		//1st method using index we can click on the option using index of the option.
		// As in static dropdowns the options are fixed and wont change, for that reason we can use the indexes.
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		

		
		

	}

}
