import java.util.Iterator;
import java.util.List;
import java.util.Set;
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

public class Assignment_5_count_of_Links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedrivers\\97 version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicitly wait global wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// hit url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//get all links on webpage
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("all links count"+allLinks.size());
		
		WebElement footer=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		
		System.out.println("footer link count = "+footer.findElements(By.tagName("a")).size());

		//check footer link working
		List<WebElement> footerlinks=footer.findElements(By.xpath(" //tr/td[1]/ul/li"));
		
		//
		
//		
		
		
	}

}
