package utils;

import java.util.List;

import javax.xml.xpath.XPath;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilsMethods {
	@Test
	public static WebDriver LaunchChrome() {
		WebDriverManager.chromedriver().setup();
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.google.com");
//		webDriver.manage().window().maximize();
//		webDriver.findElement(By.linkText(""));
		System.out.println(webDriver.getTitle());
		return webDriver;
	}

	@Test
	public static void selectRadio(WebDriver driver)
	{
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> radios = driver.findElements(By.name("group1"));
		for (WebElement rb : radios) 
		{
			if(rb.getAttribute("value").equalsIgnoreCase("Milk"))
			{
				rb.click();
				break;
			}
		}
	}
	@Test
	public static void searchByName(WebDriver driver) {
		System.out.println("in method searh");
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Lata Mangeshkar");
//		System.out.println("click the links");
		WebElement x =  driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i"));
		x.click();
		System.out.println("click the links");
	}
	@Test
	public static  void registration(WebDriver driver) {
		driver.get(" https://demo.automationtesting.in/Register.html");
		
	}
	@Test
	public static void search(WebDriver driver) {
		System.out.println("in method searh");
		driver.get("https://www.yelp.com/");
		driver.findElement(By.xpath("//*[@id=\"search_description\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"search_description\"]")).sendKeys("Resturant ");
		
//		driver.findElement(By.xpath("/html/body")).sendKeys("laptop");
		System.out.println("click the links");
		WebElement x =  driver.findElement(By.xpath("//*[@id=\"header_find_form\"]/div[3]/button"));
		x.click();
		System.out.println("click the links");
	}
	
}
