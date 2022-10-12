package SeleniumII;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaStreansInSel {
	
	private static String getPrice(WebElement s) {

		// TODO Auto-generated method stub

		String pricevalue = s.findElement(By.xpath("following-sibling::td[2]")).getText();

		return pricevalue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suman\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// sorting using java Stream
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> ElementList = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> originalList = ElementList.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList));
		// pagination

		List<String> discountprice;

		// scan the name column with getText ->Beans->print the price of the Rice

		do

		{

			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

			discountprice = rows.stream().filter(s -> s.getText().contains("Apple"))

					.map(s -> getPrice(s)).collect(Collectors.toList());

			discountprice.forEach(a -> System.out.println(a));

			if (discountprice.size() < 1)

			{

				driver.findElement(By.cssSelector("[aria-label='Next']")).click();

			}

		} while (discountprice.size() < 1);
		
		
		
		
		// Filtering the elements using stream
        driver.findElement(By.id("search-field")).sendKeys("Rice");

        List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));

        //1 results

       List<WebElement> filteredList= veggies.stream().filter(veggie->veggie.getText().contains("Rice")).

        collect(Collectors.toList());

       //1 result

       Assert.assertEquals(veggies.size(), filteredList.size());

	}

	
	}


