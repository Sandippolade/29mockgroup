package pomPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\ChromeDriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		 driver.get("https://www.flipkart.com");
		
		
		
		
	}
}

