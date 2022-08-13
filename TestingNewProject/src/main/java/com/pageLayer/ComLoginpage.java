package com.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComLoginpage {

	public ComLoginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="(//a[text()='Login'])[2]")
	private WebElement Login ;
	
	@FindBy (xpath="//input[@name='email']")
	private WebElement username ;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement password ;
	
	@FindBy (xpath="(//button[text()='Login'])[1]")
	private WebElement clickonlogin ;

	public void logn() {
			Login.click();
	   }
	 public void email(String text) {
		 username.sendKeys(text);
	 }
	public void pass(String text) {
		password.sendKeys(text);
	}
	public void clicklogin() {
		clickonlogin.click();
	}
}
