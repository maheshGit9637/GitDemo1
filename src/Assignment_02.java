import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
 

public class Assignment_02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedrivers\\97 version\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Implicitly wait global wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//hit url
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//name
		WebElement name=driver.findElement(By.name("name"));
		
		//email
		WebElement email=driver.findElement(By.name("email"));
		
		//password
		WebElement password=driver.findElement(By.id("exampleInputPassword1"));
		
		//checkbox1
		WebElement checkbox1=driver.findElement(By.id("exampleCheck1"));
		
		//dropdown using select
		
		WebElement dropdown=driver.findElement(By.xpath("//div[@class='form-group'] /select"));
		Select s=new Select(dropdown);
		
		//checkbox = student
		WebElement studentcheck=driver.findElement(By.xpath(" //label[contains(text(),'Student')]"));
		
		//date select
		WebElement date=driver.findElement(By.xpath("//input[@type='date']"));
		
		
		
		//submit click
		
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		
		//success alert
		
		
		
		//actions
		
		name.sendKeys("john carter");
		email.sendKeys("john@gmail.com");
		password.sendKeys("password@123");
		checkbox1.click();
		s.selectByIndex(0);
		s.selectByIndex(1);
		date.sendKeys("10-02-2022");
		submit.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
		WebElement succcessmsg=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		System.out.println(succcessmsg.getText());
		
		
		
		
		 
		
	}
		
		
	}


