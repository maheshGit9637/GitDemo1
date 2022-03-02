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
 

public class practice_calenderUI {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedrivers\\97 version\\chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
		op.setHeadless(true);
		WebDriver driver=new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		//global wait
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
		
		//hit url
		driver.get("https://www.path2usa.com/travel-companions");
		
		//grab element date
		WebElement calender_pick=driver.findElement(By.xpath("//input[@id='travel_date']"));
		calender_pick.click();
		
		//click on active date or today's date
	WebElement active_date=	driver.findElement(By.xpath("//table[@class=' table-condensed']//tr/td[@class='active day']"));
		
	//select todyas day
	active_date.click();
	
	//print selected date on console
	System.out.println("selected date by scrpt = "+driver.findElement(By.xpath("//div/input[@id='travel_date']")).getText());
//	Assert.assertEquals(0, calender_pick.getText());
	
		
	}
		
		
	}


