package Week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement from = driver.findElement(By.id("src"));
	   	from.sendKeys("C");
	   	Thread.sleep(2000);
		from.sendKeys(Keys.DOWN);
	   	from.sendKeys(Keys.ENTER);
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("B");
		Thread.sleep(2000);
		to.sendKeys(Keys.DOWN);
	   	to.sendKeys(Keys.ENTER);
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//td[@class='current day']/following-sibling::td"));
		date.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		Thread.sleep(7000);
		//driver.findElement(By.xpath("//div[@class='close']")).click();
		driver.findElement(By.xpath("(//label[@for='bt_SLEEPER'])[1]")).click();
		Thread.sleep(4000);
		String text = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(  text + "Busesfound");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//label[@for='bt_SLEEPER'])[1]")).click();
		Thread.sleep(4000);
		String text2 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(text2+ "Busesfound");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@for='bt_SLEEPER'][1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//label[@for='bt_AC'])[1]")).click();
		Thread.sleep(4000);
		String text3 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("There are" + text3 + "are Found");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//label[@for='bt_NONAC'])[1]")).click();
		Thread.sleep(4000);
		String text4 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("There are"  + text4 +  "are Found");
		
	
		
		
	}

}
