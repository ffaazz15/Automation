package test1;

package test1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.id("identifierId")).sendKeys("mohammedfazil196@gmail.com");
		driver.findElement(By.cssSelector("#identifierNext > div > button")).click();
		driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Jesuslove");
		driver.findElement(By.cssSelector("#passwordNext > div > button")).click();
		
		
		
		
		driver.manage().window();
		Thread.sleep(9000);
		driver.close();
		
		
		

	}

}