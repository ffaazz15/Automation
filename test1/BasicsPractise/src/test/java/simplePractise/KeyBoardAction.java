package simplePractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		Actions act = new Actions(driver);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 10");
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		driver.close();

	}

}
