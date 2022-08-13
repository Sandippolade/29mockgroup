package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
  
public class Fcartheader {

	@FindBy (xpath="//img[@alt='Top Offers']")
	private WebElement topOffer ;
	
	@FindBy (xpath="//div[text()='Grocery']")
	private WebElement grocery ;
	
	@FindBy (xpath="//div[text()='Mobiles']")
	private WebElement mobile ;
	
	
	
	public Fcartheader(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void Top() {
		topOffer.click();
	}
	public void Gro() {
		grocery.click();
	}
	public void Mob() {
		mobile.click();
	}
	
	
	
	//https://www.flipkart.com/
	
}
