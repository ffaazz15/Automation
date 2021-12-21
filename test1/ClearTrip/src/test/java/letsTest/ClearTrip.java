package letsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@class='c-grey-50 fs-4 pl-2 fw-300 td-none flex flex-middle']")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[2]/div[1]"))
				.click();
		Thread.sleep(1000); // round trip Selection

		// Mumbai Arrival

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("mumbai");
		driver.findElement(By.xpath("//p[contains(text(),'Mumbai, IN - Chatrapati Shivaji Airport (BOM)')]")).click();
		Thread.sleep(1000);

		// Delhi destination
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[5]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("Delhi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'New Delhi, IN - Indira Gandhi Airport (DEL)')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/select[1]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//div[@class='mb-4']//select[@class='bc-neutral-100 bg-transparent']//option[contains(@class,'fs-3 hover:bg-secondary-500 c-pointer hover:c-white')][contains(text(),'5')]"))
				.click();
		Thread.sleep(2300);

///date selection starts here

		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/button[1]"))
				.click();
		Thread.sleep(2000);
		String flag = "False";
		while (flag == "False") {

			if (driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Thu Dec 23 2021')]"))
					.size() > 0) {

				WebElement date = driver.findElement(
						By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Thu Dec 23 2021')]"));
				date.click();
				date.sendKeys(Keys.ENTER);
				flag = "True";
				Thread.sleep(2000);
			}

			else {
				Thread.sleep(2000);
				driver.findElement(By.xpath(
						"/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/div[2]/ul/div[2]/div/div[1]/div[2]/svg/g/path[3]"))
						.click();
			}
		}

		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/button[2]"))
				.click();
		Thread.sleep(2000);
		String flag2 = "False";
		while (flag2 == "False") {

			if (driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Wed Jan 05 2022')]"))
					.size() > 0) {

				WebElement dat = driver.findElement(
						By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Wed Jan 05 2022')]"));
				dat.click();
				dat.sendKeys(Keys.ENTER);
				flag = "True";
				Thread.sleep(2000);
			}

			else {
				Thread.sleep(2000);
				driver.findElement(By.xpath(
						"/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/div[2]/ul/div[2]/div/div[1]/div[2]/svg/g/path[3]"))
						.click();/// date ka kaam khalas
				
			}break;
		}
		
		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[2]/button[1]"))
				.click();
		

	}
}
