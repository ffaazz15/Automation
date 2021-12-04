package mmt;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;



	import java.util.List;

	
	import org.openqa.selenium.Keys;


	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.Test;



	@Test
	public class RadioButtonSelection {
		
		@Test
		public static void main(String[] args)throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.makemytrip.com/");
	        Thread.sleep(1000);
	        WebElement elementPopup =driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]"));
	        
	        
	        elementPopup.click();
	        
			WebElement element = driver.findElement(By.xpath("//li[@data-cy ='roundTrip']//span"));
			element.click();
			
//			Thread.sleep(500);
//			driver.findElement(By.xpath("//li[@data-cy ='mulitiCityTrip']//span")).click();
//			
		     Actions action=new Actions(driver);
			 driver.findElement(By.id("fromCity")).click();
		     action.sendKeys("Mumbai").perform();
		  

			 action.sendKeys(Keys.ENTER).perform();
			Thread.sleep(3000);
			
//			driver.findElement(By.id("fromCity")).click();
////			driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]"));
		    driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-2\"]/div/div[1]/p[1]")).click();
//			action.sendKeys(Keys.ENTER).perform();

					
			
			Thread.sleep(1000);
		    driver.close();
			
			
			
		}

	}
	

//	public static void main(String[] args) throws Exception {
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://mycab-202b5.web.app/");
//		
//		Thread.sleep(1000);
//		WebElement radioBtn = driver.findElement(By.xpath("//*[@id=\"html\"]"));
//		radioBtn.click();
//		
//		Thread.sleep(2000);
//		driver.close();
//	}

