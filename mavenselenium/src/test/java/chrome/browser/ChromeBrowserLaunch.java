package chrome.browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowserLaunch {
	// template // Ctrl+ space bar --> enter
 public static void main(String[] args) throws Exception {
	 // open chrome browser
	 WebDriverManager.chromedriver().setup(); // invoke chrome driver	 
	 WebDriver driver = new ChromeDriver(); // chrome browser
	
	 // open application --google
	 driver.get("https://www.google.com/");
	 //wait
	 Thread.sleep(3000);
	 //close browser
	 driver.close();
}
}
