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
 

public class Assignment_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedrivers\\97 version\\chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
		op.setHeadless(true);
		WebDriver driver=new ChromeDriver();
		
		
		//hit url
				driver.get("https://rahulshettyacademy.com/loginpagePractise/");
				
				//element username
				WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
				//element password
				WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
				//element login button
				WebElement logbtn=driver.findElement(By.id("signInBtn"));
				//radiobutton
				WebElement radiobtn=driver.findElement(By.xpath("(//span[@class='checkmark'])[2]"));
				
				//okay popup
				WebElement okebtn_pop=driver.findElement(By.xpath( "//div[@class='modal-content']/div[2]/button[2]"));
				 
				//dropdown 
				WebElement dropdown=driver.findElement(By.xpath("//div[@class='form-group']/select"));
				
				username.sendKeys("rahulshettyacademy");
				
				password.sendKeys("learning");
				radiobtn.click();
				 
				WebDriverWait w=new WebDriverWait(driver, 5);
				w.until(ExpectedConditions.visibilityOf(okebtn_pop));
				okebtn_pop.click();
				Select s=new Select(dropdown); 
				s.selectByIndex(1);
				
				
				logbtn.click();
				
				
				//product list from webpage
				
				  
				System.out.println(driver.findElements(By.xpath("(//div[@class='card-body']/h4/a)")));
			 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				System.out.println(driver.findElement(By.xpath("(//div[@class='card-body']/h4/a)")).getText());
				
				List<WebElement> add=driver.findElements(By.xpath("//div[@class='card-footer']/button"));
				
				for (WebElement b:add) {
					
					b.click();
				}
				 
		WebElement	checkout=	driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']"));
		
		System.out.println(checkout.getText());
		
		checkout.click();
		
		List<WebElement> cart_items=driver.findElements(By.xpath("//tr/td[1]/div/div/h4"));
		
		
//		List <WebElement>  actual_cart=cart_items.subList(0, cart_items.size()-2);
		
		
		for (WebElement c: cart_items) {
		
			System.out.println(c.getText());
		} 
		
//		 driver.quit();
		
		
	}
		
		
	}


