package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", "H:\\Testing\\chromedriver.exe");
  //   WebDriver driver = new FirefoxDriver();
	   WebDriver driver = new ChromeDriver();
	   driver.get("http:\\google.com");
	   driver.manage().window().maximize();
	   driver.close();
	   
	   
	   
}

}
