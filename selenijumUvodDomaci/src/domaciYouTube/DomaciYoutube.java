package domaciYouTube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DomaciYoutube {

	

public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Driver\\ChromeDriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void openYoutube() {
		driver.navigate().to(Elements.URL);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Elements.clickSearch(driver, "Rick Astley");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Elements.clickLupa(driver);
		Elements.clickPesma(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://www.youtube.com/watch?v=bulnaaE_zxM";
		Assert.assertEquals(actual, expected);
		}

}
