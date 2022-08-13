package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LoginPage   {

	
	@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement username ;
	
	@FindBy (xpath="(//input[@type='password'])")
	private WebElement password ;
	
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement loginbutton ;
	
//	@FindBy (xpath="https://www.facebook.com/login/")
//	private WebElement keepmelog ;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendusername() {
		username.sendKeys("9922098651");
	}
	public void sendpassward() {
		password.sendKeys("Harshvardhan");
	}
	public void clicklogin() {
		loginbutton.click();
	}
	
//  public void keemelogin() {
//	keepmelog.click();
	
	
}
