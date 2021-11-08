package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	//template 
	public static void main(String[] args) throws InterruptedException {
		//Test case
		
		//step1: Open browser --chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // Class
		
		//step2: Open Google application
		driver.get("https://www.google.com/");
		
		//step3: Enter any keyword ---selenium
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		//step4: Then perform Search --click button
		Thread.sleep(3000); //wait
		
		driver.findElement(By.name("btnK")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
