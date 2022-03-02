import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;

public class TakesScreenshot_practice {

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
		driver.get("https://www.google.com/");
		
		//screenshot
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination=new File("C:\\Users\\Admin\\eclipse-workspace\\Testing1\\Failed TC SS\\screenshot1.png");
		
		//fileutils
		
		FileUtils.copyFile(source, destination);
		
		 
		driver.quit();
		
		
		 
	 
	}

}
