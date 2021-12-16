package simplePractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver =  new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.manage().window().maximize();
Actions act = new Actions(driver);
WebElement main = driver.findElement(By.id("mousehover"));

act.moveToElement(main);
driver.findElement(By.xpath("//a[contains(text(),'Reload')]")).click();

try
{
Thread.sleep(3000);
act.click().build().perform();

	}catch(Exception e) {
		System.out.println(e);	
	}

}
}
