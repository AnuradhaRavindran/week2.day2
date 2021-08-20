package Week2.Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("HyperLink")).click();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		WebElement withoutClick = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a"));
	    String attribute = withoutClick.getAttribute("href");
		System.out.println("Find where am supposed to go without clicking me? : " +attribute);
		 driver.findElement(By.linkText("Verify am I broken?")).click();
		 String title = driver.getTitle();
		 String actualTitle = "HTTP Status 404 – Not Found";
		 if(actualTitle.equals(title))
		 {
			 System.out.println("This Link is Broken");
		 }
		 else
		System.out.println("Not Broken");
		driver.navigate().back();
		String homePage2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/a")).getAttribute("href");
		String homePage1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a")).getAttribute("href");
		if(homePage1.equals(homePage2))
		{
			System.out.println("Both Links Are going to homePage");
		}
		else
		{
			System.out.println("Both Links Are  not going to homePage");
		}
			
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The no of Links are : " +links.size());
		
	}

}
