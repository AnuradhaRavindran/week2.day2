package Week2.Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt=\"ListBox\"]")).click();
		WebElement trainingProgram = driver.findElement(By.xpath("//select[@id=\"dropdown1\"]"));
		Select trainPro = new Select(trainingProgram);
		trainPro.selectByIndex(1);
		WebElement trainingProgramtext = driver.findElement(By.xpath("//select[@name=\"dropdown2\"]"));
		Select trainProText = new Select(trainingProgramtext);
		trainProText.selectByValue("2");
		WebElement trainText  = driver.findElement(By.xpath("//select[@id=\"dropdown3\"]"));
		Select trainProText1 = new Select(trainText);
		trainProText1.selectByVisibleText("UFT/QTP");
		WebElement dropDwnoption = driver.findElement(By.xpath("//select[@class=\"dropdown\"]"));
		Select drdwn  = new Select(dropDwnoption);
		//drdwn.selectByVisibleText("Selenium");
		List<WebElement> options = drdwn.getOptions();
		int size = options.size();
		for(int i =1;i<size;i++)
		{
			WebElement eachElement = options.get(i);
			String text = eachElement.getText();
			System.out.println(text);
		}
		driver.findElement(By.xpath("//select[@class=\"dropdown\"]")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("Loadrunner");
		WebElement drop = driver.findElementByXPath("(//div[@class='example'])[6]/select");
		Select dd = new Select(drop);
		dd.selectByValue("1");
		dd.selectByValue("3");
	
	}

}
