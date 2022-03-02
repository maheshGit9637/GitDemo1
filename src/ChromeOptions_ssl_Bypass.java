import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_ssl_Bypass {

	public static void main(String[] args) {
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
		driver.get("https://expired.badssl.com/");
		//
		System.out.println("get me title "+driver.getTitle());

	}

}
