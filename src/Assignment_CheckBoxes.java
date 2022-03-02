import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
 

public class Assignment_CheckBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedrivers\\97 version\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Implicitly wait global wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//hit url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		List checkboxes=driver.findElements(By.xpath("//label //input[@type='checkbox']"));
		
		// 1. Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		
		WebElement checkbox1=driver.findElement(By.xpath("(//label //input[@type='checkbox'])[1]"));
		
		checkbox1.click();
		
		Assert.assertTrue(checkbox1.isSelected());
		
		
		checkbox1.click();
		
		
		Assert.assertFalse(checkbox1.isSelected());
		
		
		
		
		// 2. number of  checkboxes present=
		
		System.out.println(checkboxes.size());
		
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		 
		
			
			
		}
		
		
		
		
	}


