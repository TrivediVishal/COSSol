package tester;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.UtilsMethods;

public class Tester {

	WebDriver driver = new ChromeDriver();

	@BeforeClass
	public static void ChromeSetup() {
		WebDriverManager.chromedriver().setup();
	}

	@Test
	public void TestMyChrome() {
		// UtilsMethods utilsMethod = new UtilsMethods();
//		wd = UtilsMethods.LaunchChrome();
//		UtilsMethods.selectRadio(wd);
//		UtilsMethods.searchByName(driver);
		UtilsMethods.search(driver);
//		UtilsMethods.registration(driver);
	}
}
