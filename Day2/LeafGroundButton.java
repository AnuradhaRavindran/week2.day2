package Week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/home.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt=\"Buttons\"]")).click();
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		WebElement findElement = driver.findElement(By.id("position"));
	    Point position = findElement.getLocation();
		System.out.println("Position of button(x,y) is : " +position);
		WebElement findcolor = driver.findElement(By.id("color"));
		System.out.println(findcolor.getCssValue("background-color"));
		WebElement size = driver.findElement(By.id("size"));
		System.out.println(size.getSize());

	}

}
