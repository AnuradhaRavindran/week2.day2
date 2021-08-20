package Week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Ram");
		driver.findElement(By.id("lastNameField")).sendKeys("R");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Raj");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("A");
		driver.findElement(By.name("departmentName")).sendKeys("Computers");
		driver.findElement(By.name("description")).sendKeys("This is create Contact Test Case");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ramraj234@gmail.com");
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stateDropDwn = new Select(state);
		stateDropDwn.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("This is TestLeaf Application");
		driver.findElement(By.xpath("(//input[@class=\"smallSubmit\"])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
