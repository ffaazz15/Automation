package mmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;



public class radio {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
Thread.sleep(3000);
//		driver.findElement(By.xpath("//@li[text()='Multi City']//span[@class='tabsCircle appendRight5']")).click();
	
		driver.findElement(By.xpath("//div[@class ='fsw_inputBox searchCity inactiveWidget ']/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='hsw_autoComplePopip autoSuggestPlugin']/div/input")).sendKeys("Pune");
		List<WebElement>dynamicList=driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
		
		for (int i=0;i<dynamicList.size();i++) {
			
			String text = dynamicList.get(i).getText();
			System.out.println("text is "+text);
			if(text.contains("Pune")) {
				dynamicList.get(i).click();
				break;
			}
			
		}
		//driver.close();
	}

}
