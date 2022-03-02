import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webalerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedrivers\\97 version\\chromedriver.exe");
		
		
		// Create Object of ChromeOption Class
		ChromeOptions option=new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver=new ChromeDriver(option);
		
		//hit url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//send keys id name
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("john f kennedy");
		 
		
		//click on alert so alert is displayed
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//confirm alert=confirmbtn
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		
		driver.switchTo().alert().dismiss();
		 
		
		

	}

}
