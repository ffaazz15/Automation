package test1;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3.org/TR/2016/WD-wai-aria-practices-1.1-20161214/examples/radio/radio-1/radio-1.html");
		driver.findElement(By.xpath("//*[@id=\"rg1\"]/div[1]")).click();
		Thread.sleep(1000);
		System.out.println("clicked on radio button");
		driver.close();
		
	}

}
	} ////*[@id="rg1"]/div[1]
}
