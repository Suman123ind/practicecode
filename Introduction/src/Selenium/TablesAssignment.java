package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//To Scroll the webpage
		 JavascriptExecutor Js = (JavascriptExecutor)driver; 
		 Js.executeScript("window.scrollBy(0,500)");
		 
		 //to print the number of Rows
		 WebElement table =driver.findElement(By.xpath("//table[@class='table-display']/tbody"));
		List<WebElement> totalRows= table.findElements(By.tagName("tr"));
		System.out.println("Total num of rows--"+ totalRows.size());
		
		//to print the number of Columns
		List<WebElement> totalCol = totalRows.get(1).findElements(By.tagName("td"));
		System.out.println("Total num of columns--" + totalCol.size());
		
		//print the text from row.
		String text = driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[3]")).getText();
		System.out.println(text);
		 

		
		//Instructor code for this assignment 
		/*
		 driver.get("http://qaclickacademy.com/practice.php");



WebElement table=driver.findElement(By.id("product"));



System.out.println(table.findElements(By.tagName("tr")).size());



System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());



List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



System.out.println(secondrow.get(0).getText());



System.out.println(secondrow.get(1).getText());



System.out.println(secondrow.get(2).getText());

}

}
		 */

		
	}

}
