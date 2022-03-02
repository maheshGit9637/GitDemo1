import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
 

public class Assignment_6_practice_php {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedrivers\\97 version\\chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
		op.setHeadless(true);
		WebDriver driver=new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		//global wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		
		//hit url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//grab the checkbox option=2
		WebElement checkbox2=driver.findElement(By.xpath("//label/input[@id='checkBoxOption2']"));
		//click on checkbox option2
		checkbox2.click();
		//confirm if second options is clicked
		Assert.assertTrue(checkbox2.isSelected());
		
		//grab the text which is checked
		 WebElement checkbox_label=driver.findElement(By.xpath("//label/input[@id='checkBoxOption2']/parent::label"));
		String checked=checkbox_label.getText();
		System.out.println(checked);
		
		//get dropdown webelement
		WebElement dropdown_element=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		//select dropdown and click on option=checkbox_label
		Select drop=new Select(dropdown_element);
		drop.selectByVisibleText(checked);
		
		//input the string in textbox
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(checked);
		
		//click on alert button
		
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		//check if popup massage and word
		
		String x=driver.switchTo().alert().getText();
		
		if(x.contains(checked)) {
			
			System.out.println(x);
			System.out.println("popup massage is having 'option2' which is preselected");
		}
		
		
		//accept the alert and close the browser
		driver.switchTo().alert().accept();
			
		
		Thread.sleep(4000);
		
		 driver.quit();
		
		//https://www.path2usa.com/travel-companions
	}
		
		
	}


