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

public class Assignment_4_window_handle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedrivers\\97 version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicitly wait global wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// hit url
		driver.get("https://the-internet.herokuapp.com/");

		// click on multiple window
		driver.findElement(By.linkText("Multiple Windows")).click();

		Thread.sleep(4000);
		// this is parent window

		// click to get new window
		driver.findElement(By.linkText("Click Here")).click();

		Thread.sleep(4000);

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		String parentwindow = it.next();
		String window1 = it.next();

		System.out.println("parent window = " + parentwindow);
		System.out.println("child window = " + window1);

		driver.switchTo().window(window1);
		System.out.println(driver.getCurrentUrl());
		
		// child window text
		String child_window_text = driver.findElement(By.xpath("//div/h3")).getText();
		System.out.println(child_window_text);

		//

		driver.switchTo().window(parentwindow);
		System.out.println(driver.getCurrentUrl());
		String parenet_window_text = driver.findElement(By.tagName("h3")).getText();
		System.out.println(parenet_window_text);

	}

}
