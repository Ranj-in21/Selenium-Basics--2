package javaAssignment.week3.OOPS;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioX {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String totalItems = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Total number of items: " +totalItems);
		//System.out.println("List of Brands");
			List<WebElement> bagBrandList = driver.findElements(By.xpath("//div[@class='brand']"));
				System.out.println("Size: " +bagBrandList.size());
				System.out.println("Brand List:");
				for (WebElement webElement : bagBrandList) {
					String text = webElement.getText();
					System.out.print(text +",");
				}
			List<WebElement> bagNameList = driver.findElements(By.xpath("//div[@class='nameCls']"));
				System.out.println("\nSize: " +bagNameList.size());
				System.out.println("Bag Names:");
				for (WebElement webElement : bagNameList) {
					String text = webElement.getText();
					System.out.print(text +",");
				}
		
		
		
	}

}
