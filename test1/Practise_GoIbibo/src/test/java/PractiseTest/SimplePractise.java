package PractiseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class SimplePractise {
	
	

@Test
	public void test1() throws Throwable { //to test oneway-roundtrip-multicity
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
//		
//		WebElement element = driver.findElement(By.id("roundTrip"));
//		element.click();
//		Thread.sleep(1000);
//		WebElement element1 = driver.findElement(By.xpath("//span[@id='multiCity']"));
//		element1.click();
//		Thread.sleep(1000);
//		WebElement element2 = driver.findElement(By.cssSelector("#oneway"));
//		element2.click();
//		Thread.sleep(1000);
//		WebElement element3 = driver.findElement(By.xpath("//a[contains(text(),'Trains')]"));
//		element3.click();
//		Thread.sleep(100);
//		WebElement element4 = driver.findElement(By.xpath("//a[contains(text(),'Cabs')]/span"));
//		element4.click();
//		Thread.sleep(300);
//	WebElement element5 = driver.findElement(By.xpath("//li/a[contains(text(),'Flights')]/span"));
//		element5.click();
//		
		//------->time to select to and from dates
		
		
		WebElement ele6 = driver.findElement(By.cssSelector("input[id='gosuggest_inputSrc']"));
		ele6.clear();
		ele6.sendKeys("BOM");
		Thread.sleep(2000);
		ele6.sendKeys(Keys.ARROW_DOWN);
		ele6.sendKeys(Keys.ENTER);
		
	
		WebElement ele7 = driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']"));
		ele7.clear();
		ele7.sendKeys("LON");
		Thread.sleep(2000);
		ele6.sendKeys(Keys.ARROW_DOWN);
		ele6.sendKeys(Keys.ENTER);
	}
}

