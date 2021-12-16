package simplePractise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class Test {
	
public static void main(String args[]) throws InterruptedException  {


	

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	        driver.manage().window().maximize();
	        
	        
	        driver.findElement(By.id("alertBox")).click();
	     org.openqa.selenium.Alert alert =  driver.switchTo().alert();
	     System.out.println(alert.getText());
	        Thread.sleep(2000);
	        alert.accept();
	        Thread.sleep(2000);
	        driver.quit(); 
	       
	        
	       
	        
}

}