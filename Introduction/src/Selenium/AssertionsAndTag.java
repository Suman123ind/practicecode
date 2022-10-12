package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionsAndTag {
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		String PasswordText = driver.findElement(By.cssSelector("form p")).getText(); // The resetpassword text is stored in PasswordText.
		
		// PasswordText = Please use temporary password 'rahulshettyacademy' to Login.
		String [] PasswordArray =PasswordText.split("'");
		// now the text is splitted into two parts 
		// Left hand side - 0th index -   Please use temporary password
		// Right hand side - 1st index -  rahulshettyacademy' to Login.
		//String [] PasswordArray2 = PasswordArray[1].split("'");
		// now PasswordArray is having  rahulshettyacademy' to Login. , when we again split this 
		// 0th index will be rahulshettyacademy
		// 1st index will be to login.
		// now we will save the 0th index text in PasswordArray 2 array and we will store that value in password variable and we will return it.
		//String Password =PasswordArray2[0];
		String Password =PasswordArray[1].split("'")[0]; // We can write like this in single line, it is written from above commented code.
		return Password;
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name = "Rahul";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		String password =getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		
		driver.findElement(By.name("inputPassword")).sendKeys(password);

		driver.findElement(By.className("signInBtn")).click();

		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText()); // tagName locator is used
		
		//in the below line the Assertion concept is used, assertion is used to compare the actual and expected results which helps in running testcases.
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		
		// if you dont want to write tagname, then you can use * , if there are multipe you cannot use it.
		driver.findElement(By.xpath("//*[text()='Log Out']")).click(); 

		driver.close();


		
		
		

	}

}
