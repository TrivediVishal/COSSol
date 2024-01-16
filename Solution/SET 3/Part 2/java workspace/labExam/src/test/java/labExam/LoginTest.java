package labExam;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	
	@Test
	public void textBox()
	{
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://practice.automationtesting.in/my-account/");
		 driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Rajat");
		driver.findElement(By.id("password")).sendKeys("test@113");
        driver.findElement(By.name("login")).click();
		
		WebElement lblError = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li"));
		String actError = lblError.getText();
		assertEquals(actError, " A user could not be found with this email address.");
	}
		
}