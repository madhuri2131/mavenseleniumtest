package locators;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassEx {
  @Test
  public void test() throws InterruptedException {
	//Test case
		
			//step1: Open browser --chrome
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(); // Class
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//step2: Open Google application
			driver.get("https://www.google.com/");
			
			//step3: Enter any keyword ---selenium
			
			driver.findElement(By.name("q")).sendKeys("selenium");
			
			//step4: Then perform Search --click button
			
			driver.findElement(By.name("btnK")).click();
			System.out.println("Execution complete");
			
		}
  }
