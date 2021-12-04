package mmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePick {
public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.makemytrip.com/");
    Thread.sleep(1000);
    WebElement elementPopup =driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]"));
    elementPopup.click();
    
    driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
    Thread.sleep(3000);
    //driver.findElement(By.xpath(" //div[@class=\"DayPicker-Day\"][contains(@aria-label,'Dec 25 2021')]")).click();
   // driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/label[1]")).click();
    
  driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[5]/div[6]")).click();
    Thread.sleep(3000);
    driver.close();
}
}
