import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment_5_newtabopening {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedrivers\\97 version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicitly wait global wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// hit url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//get links count
		WebElement homelink=driver.findElement(By.xpath("//button[contains(text(),'Home')]"));
		 
		
		//open link in new tab
		String newtabClick=Keys.chord(Keys.LEFT_CONTROL,Keys.ENTER);
		homelink.sendKeys(newtabClick);
		
		//open second link in new tab
		driver.findElement(By.xpath("//a[@id='opentab']")).sendKeys(newtabClick);
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		String parentwindow=it.next();
		String homewindow=it.next();
		String tabwindow=it.next();
		
		driver.switchTo().window(parentwindow);
		System.out.println("url : "+driver.getCurrentUrl()+" title :  "+driver.getTitle());
		
		driver.switchTo().window(homewindow);
		System.out.println("url : "+driver.getCurrentUrl()+" title :  "+driver.getTitle());
		
		driver.switchTo().window(tabwindow);
		System.out.println("url : "+driver.getCurrentUrl()+" title :  "+driver.getTitle());
		
		
		 
		 driver.quit();
		
	}

}
