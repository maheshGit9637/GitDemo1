import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.apache.commons.io.FileUtils;

public class LinkResponceCode {

	public static void main(String[] args) throws IOException {
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
		driver.get("https://www.facebook.com/");
		
		//
		String url=driver.findElement(By.partialLinkText("Forgotten passwor")).getAttribute("href");
		
		System.out.println(url);
		
		//openconnections
		
		HttpsURLConnection conn= (HttpsURLConnection) new URL(url).openConnection();
		
		conn.setRequestMethod("HEAD");
		conn.connect();
		int responceCode=conn.getResponseCode();
		
		System.out.println("responce Code : "+responceCode);
		
		if(responceCode<400) {
		Assert.assertTrue(true);
		}else {
		
			System.out.println("broken link");
			Assert.assertTrue(true);
		}
		
		 
		driver.quit();
		
		
		 
	 
	}

}
