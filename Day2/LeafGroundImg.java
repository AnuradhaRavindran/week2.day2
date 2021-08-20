package Week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImg {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/home.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt=\"Images\"]")).click();
		driver.findElement(By.xpath("//img[@onclick=\"window.location='../home.html';\"][1]")).click();
		String homepagetitle = driver.getTitle();
		String actualHomePageTitle = "TestLeaf-Selenium";
		if(homepagetitle.equals(actualHomePageTitle))
		{
			System.out.println("The Link is Going to homePage");
		}
		else
		{
			System.out.println("The Link is  not Going to homePage");
		}
		driver.navigate().back();
		
		WebElement brokenImg = driver.findElement(By.xpath("(//label[@for=\"position\"])[1]"));
		String attribute = brokenImg.getAttribute("src");
		System.out.println("you can not click this image : " +attribute);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("HTTP"))
		{
			System.out.println("This image is Broken");
		}
		else
		{
			System.out.println("This image  is not Broken");
		}
		driver.findElement(By.xpath("(//label[@for=\"position\"])[2]")).click();
		
		
		
	}

}
