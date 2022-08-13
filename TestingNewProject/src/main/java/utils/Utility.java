package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.collect.DiscreteDomain;

public class Utility {
   
	public static void captureScreenshot() throws InterruptedException, IOException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyymmdd__HH.mm.ss");
	    Date date=new Date();
	    String DT = sdf.format(date);
	   System.out.println(DT);
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\ChromeDriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 
		 Thread.sleep(3000);
		 TakesScreenshot s  = (TakesScreenshot) driver;
		File source =s.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\SAINATH\\Pictures\\"+ DT +".jpeg");
		FileHandler.copy(source, dest);
		System.out.println("Screenshot taken");
	
	
	
	
	
	
	}	
}
