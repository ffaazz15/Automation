package simplePractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggest {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement suggestBox = driver.findElement(By.cssSelector("#autocomplete"));
		suggestBox.clear();
		suggestBox.click();
		Thread.sleep(1000);
		suggestBox.sendKeys("Ind");
		Thread.sleep(1000);

		// to select the element
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

	}

}
