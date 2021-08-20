package Week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("addhf@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    String text = driver.findElement(By.xpath("(//a[text()='Aishwarya'])[1]")).getText();
	    System.out.println(text);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	    driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
	    String duplicateTitle = driver.getTitle();
	    System.out.println(duplicateTitle);
	    String actualDuplicate = "Duplicate Lead | opentaps CRM";
	    if(actualDuplicate.equals(duplicateTitle))
	    {
	    	System.out.println("Title is matching");
	    }
	    else
	    {
	    	System.out.println("Not matching");
	    }
	    driver.findElement(By.name("submitButton")).click();
	    String text2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
	    if(text==text2)
	    {
	    	System.out.println("My lead name is matching");
	    }
	    else
	    {
	    	System.out.println("My lead name is matching");
	    }		 
	    
	}

}
