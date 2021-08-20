package Week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"CRM\")]")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//a[@class=\"selected\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("Ram");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		String attribute = firstName.getAttribute("name");
		System.out.println(attribute);
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("R");
		driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
		WebElement findElement = driver.findElement(By.id("viewLead_companyName_sp"));
		String text = findElement.getText();
		System.out.println(text);
		
				

	}

}
