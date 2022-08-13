package com.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComHomepade {
    
	public ComHomepade (WebDriver driver) {
		 
	 PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="(//a[text()='Demo'])[1]")
	private WebElement demo ;
	
	public void cickdemo() {
		demo.click();
	 }
	
	

}
