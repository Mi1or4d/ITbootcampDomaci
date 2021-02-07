package domaciYouTube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements {
	public static final String URL = "https://www.youtube.com/";
	public static final String SEARCH = "/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div/div[1]/input";  //"input#search.ytd-searchbox";
	public static final String LUPA = "button#search-icon-legacy.style-scope.ytd-searchbox";
	
	
	
	public static void clickSearch (WebDriver driver , String imePesme){
		WebDriverWait we = new WebDriverWait(driver, 15);
		we.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LUPA)));
		driver.findElement(By.xpath(SEARCH)).sendKeys(imePesme);
	}
	
	public static void clickLupa (WebDriver driver){
		driver.findElement(By.cssSelector(LUPA)).click();
	}
	
	public static void clickPesma (WebDriver driver){
		driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[2]/div[1]/ytd-thumbnail/a/yt-img-shadow/img")).click();
	}

}
