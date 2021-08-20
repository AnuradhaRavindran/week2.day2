package Week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt=\"Checkbox\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[4]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[5]/input")).click();
		WebElement selenium = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		if(selenium.isSelected())
		{
			System.out.println("The Checkbox Selenium is Selected");
		}
		else
		{
			System.out.println("The Checkbox Selenium is not Selected");
		}
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input")).click();
		WebElement deSelect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		if(deSelect.isSelected())
		{
			System.out.println("The Checkbox is not deselected");
		}
		else
		{
			System.out.println("The Checkbox is  deselected");
		}
		for(int i=1 ; i<=5;i++)
		{
			driver.findElement(By.xpath("//div[text()=\'Option " + i + "\']/input")).click();
		}
		
		

}
}

