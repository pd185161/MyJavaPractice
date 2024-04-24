import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pd185161\\OneDrive - NCR Corporation\\Desktop\\Selenium\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		
		
//		driver.get("https://www.browserstack.com");
//		driver.findElement(By.id("test")).click();
//		
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
//		
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("test"))));
//		
//		FluentWait fw = new FluentWait(driver);
//		fw.withTimeout(Duration.ofSeconds(0));
//		fw.pollingEvery(Duration.ofSeconds(0));
//		fw.ignoring(NoSuchElementException.class);
//		
//		fw.until(ExpectedConditions.alertIsPresent());
//		
//		
//		Alert alert = driver.switchTo().alert();
//		alert.getText();
		
		
		
		//Fibonacci series 
//		int num =5;
//		int fact =1;
//		
//		for (int i=1; i<=num; i ++)
//		{
//			fact = fact*i;
//		}
//		
//		System.out.println(fact);
//		
//		int febCount = 15;
//		int[] feb = new int[febCount];
//		feb[0]= 0;
//		feb[1]= 1;
//		
//		for (int i=2; i<febCount; i++)
//		{
//			feb[i]= feb[i-1]+feb[i-2];
//		}
//		
//		for (int i = 0; i<febCount;i++)
//		{
//			System.out.println(feb[i]+" ");
//		}
			
	}

}
