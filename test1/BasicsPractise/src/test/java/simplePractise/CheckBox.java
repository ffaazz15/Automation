package simplePractise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String args[]) throws InterruptedException  {

		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		

		        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		        driver.manage().window().maximize();
		        driver.findElement(By.id("checkBoxOption1")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.id("checkBoxOption3")).click();
	}
}
