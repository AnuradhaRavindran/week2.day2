package Week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("98");
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		driver.findElement(By.xpath("//button[text() = \"Find Leads\"]")).click();
		String text1 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		//Thread.sleep(2000);
		System.out.println(text1);
		//element.getText();
		if (text1.equals("No records to display")) 
		{
			System.out.println("Text matching");
		}
		else
		{
			System.out.println("Text is  not  matching");
		}
		driver.close();
		
		
		
		

	}

}
