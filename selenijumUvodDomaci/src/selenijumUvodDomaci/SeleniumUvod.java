package selenijumUvodDomaci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUvod {
	
	private static final String URL = "http://demo.guru99.com/test/newtours/";
	private static final String REGISTER_LINK = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a";
	private static final String FIRST_NAME ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input";
	private static final String LAST_NAME="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input";
	private static final String PHONE = "phone";
	private static final String  MAIL = "input#userName";
	private static final String  ADRESS = "address1";
	private static final String CITY = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input";
	private static final String PROVINCE ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input";
	private static final String POST_CODE ="postalCode" ;
	private static final String COUNTRY = "select[name=country] option[value=ALGERIA]";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Public\\Driver\\ChromeDriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(REGISTER_LINK)));
		
		WebElement regist = driver.findElement(By.xpath(REGISTER_LINK));
		regist.click();
		WebElement firstName = driver.findElement(By.xpath(FIRST_NAME));
		firstName.sendKeys("Pera");
		WebElement lastName = driver.findElement(By.xpath(LAST_NAME));
		lastName.sendKeys("Peric");
		WebElement phone = driver.findElement(By.name(PHONE));
		phone.sendKeys("123456");
		WebElement mail = driver.findElement(By.cssSelector(MAIL));
		mail.sendKeys("123456");
		WebElement adress = driver.findElement(By.name(ADRESS));
		adress.sendKeys("Pere Mike 12");
		WebElement city = driver.findElement(By.xpath(CITY));
		city.sendKeys("Belgrade");
		WebElement province = driver.findElement(By.xpath(PROVINCE));
		province.sendKeys("Jajinci Republic");
		WebElement postalCode = driver.findElement(By.name(POST_CODE));
		postalCode.sendKeys("11222");
		
		WebElement country = driver.findElement(By.cssSelector(COUNTRY));
		country.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(COUNTRY)));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();

	}

}
