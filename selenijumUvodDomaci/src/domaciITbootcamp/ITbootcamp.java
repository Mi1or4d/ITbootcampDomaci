package domaciITbootcamp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class ITbootcamp {
	
	public static final String URL="https://itbootcamp.rs/";
	public static final String LOGO="div.logo-wrapper";
	public static final String LUPA = "/html/body/div/header/div[2]/div/div/div[2]/a/i";
	public static final String POLJE =" input.form-control[placeholder=Search] ";

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Driver\\ChromeDriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
		
		//driver.navigate().to(URL); *** ovo je isto kao ovo ispod
String url = "https://itbootcamp.rs/";
driver.get(url);

System.out.println(driver.manage().window().getSize()); 

		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOGO)));
		
		String actual = driver.getCurrentUrl();
		String expected = URL;
		Assert.assertEquals(actual, expected);
		
		
		/*WebDriver.Window windowSize = driver.manage().window();
		Dimension d = new Dimension(1050, 708);
		windowSize.setSize(d);*/
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(LUPA)).click();
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(POLJE)));
		driver.findElement(By.className(POLJE)).click();
		driver.findElement(By.className(POLJE)).sendKeys("Testiranje");
		
	}

}
