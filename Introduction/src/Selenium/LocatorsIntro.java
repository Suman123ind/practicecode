package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		
  
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//<input type="text" placeholder="Username" id="inputUsername" value=""> ----- ID Locator
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		//<input type="password" placeholder="Password" name="inputPassword" value=""> ---- Name Locator
		driver.findElement(By.name("inputPassword")).sendKeys("Hello123");
		
		//<button class="submit signInBtn" type="submit">Sign In</button> ------ ClassName Locator 
		driver.findElement(By.className("signInBtn")).click();
		
		//<p class="error">* Incorrect username or password </p> ---------- CSS locator --- 1) Tagname.className
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//<a href="#" xpath="1">Forgot your password?</a> ---- LinkText Locator 
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000); // this java code will pause the selenium code for 1 sec , here 1000 = 1 sec.
		
		//<input type="text" placeholder="Name" xpath="1"> --- Xpath Locator
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John"); // customized Xpath
		
		//<input type="text" placeholder="Email" xpath="1"> ---- CSS selector
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@rsa.com"); // customized CSS Selector 
		
		//clear the text from the above mail box
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); // [2] is index value in xpath
		
		// Enter another mail ID using the CSS selector based on Index value from the above weblink
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
	
		//<input type="text" placeholder="Phone Number" xpath="1"> --- Xpath locator using the \\parent to \child concept
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9848564690");
		
		//<button class="reset-pwd-btn" xpath="1">Reset Login</button> --- use css selector
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		//<p class="infoMsg" xpath="1">Please use temporary password 'rahulshettyacademy' to Login. </p> --- CSS Selector using Parent child
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//the below line is combination of parent to child traverse, inder and customized Xpath , here Div = parent tagname, button = child tagname.
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		Thread.sleep(1000);
		
		//ID selector is written in the form of Css Selector  
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rahul");
		
		// The below line of locator is regular expression for css selector
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		
		// The below line of locator is regular expression for Xpath selector

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		}

}
