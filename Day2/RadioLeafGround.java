package Week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioLeafGround {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Radio Button")).click();
		driver.findElement(By.xpath("(//input[@class=\"myradio\"])[1]")).click();
		WebElement option = driver.findElement(By.xpath("//label[@for=\"Checked\"]"));
		option.click();
		boolean selected = option.isSelected();
		if(selected)
		{
			System.out.println("This is default Radio button : ");
		}
		else
		{
			System.out.println("This is not  default Radiobutton : ");
		}
		int size = driver.findElements(By.xpath("//input[@name=\"age\"]")).size();
		System.out.println("The no of radio buttons are : " +size);
		for(int i = 0;i<size;i++)
		{
			driver.findElements(By.xpath("//input[@name=\"age\"]")).get(0).click();
		}
	

	}

}
