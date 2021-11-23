package test1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;]
		
public class mouseClick {
	



	public class MouseAction {
		public static void handleMouseMovement(WebDriver driver) throws InterruptedException {
			driver.get("https://www.youtube.com/");
			WebElement element = driver.findElement(By.linkText("search"));
	        Actions action = new Actions(driver);
	        action.moveToElement(element).perform();
			Thread.sleep(3000);
		driver.close();
		}

	}
} ////*[@id="performance-intro"]/div/div/div[1]/div/button/span
