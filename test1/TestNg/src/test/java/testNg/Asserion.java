package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asserion {

	@org.testng.annotations.Test
	public void Test() throws InterruptedException {

		String Expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedText = "search";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, Expectedtitle);

		String actualtext = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		Assert.assertEquals(actualtext, expectedText, "dek bhai galat hai");
		Thread.sleep(3000);

		driver.close();
	}

}
