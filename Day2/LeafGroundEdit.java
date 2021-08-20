package Week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt=\"Edit / Text Fields\"]")).click();
		driver.findElement(By.id("email")).sendKeys("Anuravi134@gmail.com");
		WebElement appendElement = driver.findElement(By.xpath("//input[@value=\"Append \"]"));
		//appendElement.clear();
		appendElement.sendKeys("TestLeafSolutions");
	    String appendText = appendElement.getAttribute("value");
	    appendElement.sendKeys(Keys.TAB);
	    System.out.println("The Append text is :  "  +appendText);
		WebElement defaultText = driver.findElement(By.xpath("//input[@value=\"TestLeaf\" ]"));
        String text = defaultText.getAttribute("value");
        System.out.println("The default Text is : " +text);
       	driver.findElement(By.xpath("//input[@value=\"Clear me!!\" ]")).clear();
		WebElement editDis = driver.findElement(By.xpath("//input[@disabled=\"true\" ]"));
		boolean valueenable = editDis.isEnabled();
		System.out.println("This edit text is Disabled : " +valueenable);
		//driver.close();
		
		

	}

}
