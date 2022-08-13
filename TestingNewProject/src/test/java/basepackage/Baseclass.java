package basepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pageLayer.ComHomepade;
import com.pageLayer.ComLoginpage;


public class Baseclass {
	
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\ChromeDriver.exe");
	  driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	
	 driver.get("https://www.opencart.com");
	 }
	
	@AfterClass
	 public void clear()   {
     
		 driver.quit();
	
	 }

      @Test
     public void loginpage() {
    	  ComLoginpage log =new ComLoginpage(driver);
      
          log.logn();
          log.email("sandippolade2012@gmail.com");
          log.pass("3330");
          log.clicklogin();
      }
      
      @Test(dependsOnMethods= {"loginpage"})
      public void homepade1() {
    	  ComHomepade ch=new ComHomepade(driver);
    	  
    	  ch.cickdemo();
      }
      
      
      
      
      
      
      
      
}
