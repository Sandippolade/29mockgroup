package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;

import pomPack.Fcartheader;
import pomPack.LoginPage;

public class VerifyFlifcart   {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\ChromeDriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		 driver.get("https://www.flipkart.com");
		
		 LoginPage loginPage = new LoginPage(driver);
	     
				 loginPage.sendusername();
				 loginPage.sendpassward();
				 loginPage.clicklogin();
				 
	    Fcartheader fcartheader =new Fcartheader(driver);
				 
			    fcartheader.Top();
			   
			String url=driver.getCurrentUrl();
			String Title =driver.getTitle();
			
			System.out.println(url);
			System.out.println(Title);
			
			if(url.equals("https://www.flipkart.com/offers-store?otracker=nmenu_offer-zone&fm=neo%2Fmerchandising&iid=M_fcef1acc-4ee2-45fb-9254-aff8fc5600ae_1_372UD5BXDFYS_MC.G6ZC4RAJ9OHU&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Top%2BOffers_G6ZC4RAJ9OHU&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L0_view-all&cid=G6ZC4RAJ9OHU"))
			{
				System.out.println("pass");
				}
			else
				System.out.println("fail");
				
			}
	
	
	}	
	

