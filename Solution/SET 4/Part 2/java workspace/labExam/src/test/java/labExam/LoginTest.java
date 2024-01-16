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
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver.manage().window().maximize();
		driver.findElement(By.id("login1")).sendKeys("Rajat");
		driver.findElement(By.id("password")).sendKeys("test@113");
        driver.findElement(By.name("proceed")).click();
		
//		WebElement lblError = driver.findElement(By.id("div_login_error"));
//		String actError = lblError.getText();
//		assertEquals(actError, " Temporary error occured[#5001], please try again.");
	}
		
}