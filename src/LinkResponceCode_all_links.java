import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
 

public class LinkResponceCode_all_links {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "E:\\chromedrivers\\97 version\\chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
		op.setHeadless(false);
		op.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(op);
		
		//maximize browser
		driver.manage().window().maximize();
		
		//global wait
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
		
		//hit url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//scroll down to footer
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,2200)", args);
		
		//
		List<WebElement> links=driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		
		int activelink_count=0;
		int brokenlink_count=0;
		
		//openconnections
		
		for(WebElement l : links){
			
			String url=l.getAttribute("href");
			
			
			Thread.sleep(4000);
			
			//openconnections
			
			HttpURLConnection conn= (HttpURLConnection) new URL(url).openConnection();
			
			//
			conn.setRequestMethod("HEAD");
			conn.connect();
			
			
			int statusCode=conn.getResponseCode();
			if(statusCode<400) {
				
				System.out.println(url+" is a active link, with responce code = "+statusCode);
				activelink_count++;
				 
			}else {
				System.out.println(url+" is a broken link, with responce code = "+statusCode);
				brokenlink_count++;
			}
			
			
			
			
			
		}
		
		System.out.println();
		System.out.println("active link count = "+activelink_count);
		System.out.println("broken link count = "+brokenlink_count);
		 
		
		driver.quit();
		
		
		 
	 
	}

}
