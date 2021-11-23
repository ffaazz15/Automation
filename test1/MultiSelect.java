package test1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

	@Test
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.w3.org/TR/wai-aria-practices/examples/checkbox/checkbox-1/checkbox-1.html");	
        
    	WebElement radioBtn = driver.findElement(By.xpath("//*[@id=\"ex1\"]/div/ul/li[2]/div"));
		radioBtn.click();
		
		
		WebElement radioBtn2 = driver.findElement(By.xpath("//*[@id=\"ex1\"]/div/ul/li[3]/div"));
		radioBtn2.click();
		
		
		Thread.sleep(2000);
		driver.close();
	}
	
}