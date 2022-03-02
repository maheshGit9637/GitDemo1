import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class LoginPage_automation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedrivers\\97 version\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Implicitly wait global wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//hit url
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		//element username
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		//element password
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		//element login button
		WebElement logbtn=driver.findElement(By.id("signInBtn"));
		
		username.sendKeys("rahulshettyacademy");
		password.sendKeys("learning");
		logbtn.click();
		
		//select add button related with blackberry
		WebElement add=driver.findElement(By.xpath("(//div[@class='card h-100'])[4] //button"));
		//add blackberry to cart
		add.click();
		
		//scroll actions
		
		
		
		//get how many items added in cart
		
		WebElement checkout=driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']"));
		
//		Assert.assertEquals(null,null);
		
		
		
		
		
		//add 3 rd item to cart
		
		WebElement add3=driver.findElement(By.xpath("(//div[@class='card h-100'])[3] //button"));
		add3.click();
		
		String actual_item_in_cart=checkout.getText();
		System.out.println(actual_item_in_cart);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)", "");
		
		checkout.click();
		
		
	}

}
