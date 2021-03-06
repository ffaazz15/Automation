package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dragdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		   		
    	WebElement From=driver.findElement(By.xpath("//*[@id='credit3']/a"));
		
    			
        WebElement To=driver.findElement(By.xpath("//*[@id='fourth']/li"));
    	
        
        Actions action = new Actions(driver);
        action.dragAndDrop(From, To).build().perform();
        
		Thread.sleep(1000);
		driver.close();
	}
}
//*[@id="credit2"]/a
//*[@id="credit3"]
//*[@id="fourth"]/a