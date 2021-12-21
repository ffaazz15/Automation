package letsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderExclusive {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.cleartrip.com/flights");
	Thread.sleep(3000);
	

	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/button[1]")).click();
	  Thread.sleep(2000);
	  String flag = "False";
	  while(flag=="False") {
		   
		   if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Thu Dec 23 2021')]")).size()>0) {
		    
		   WebElement date=driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Thu Dec 23 2021')]"));
		   date.click();
		   date.sendKeys(Keys.ENTER);
				   flag="True";
		   Thread.sleep(2000);
		   }
		   
		   else {
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/div[2]/ul/div[2]/div/div[1]/div[2]/svg/g/path[3]")).click();
		   }
		  }
	  
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/button[2]")).click();
	Thread.sleep(2000);
	String flag2 = "False";
	while(flag2=="False") {
		   
		   if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Wed Jan 05 2022')]")).size()>0) {
		    
		   WebElement dat=driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Wed Jan 05 2022')]"));
		   dat.click();
		   dat.sendKeys(Keys.ENTER);
				   flag="True";
		   Thread.sleep(2000);
		   }
		   
		   else {
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/div[2]/ul/div[2]/div/div[1]/div[2]/svg/g/path[3]")).click();
		   }
		  }
	
}
}
