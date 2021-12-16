package simplePractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.simplelogin.io/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("fazil.com");
		driver.findElement(By.id("password")).sendKeys("wasq");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		Thread.sleep(4000);
		driver.quit();

	}

}
