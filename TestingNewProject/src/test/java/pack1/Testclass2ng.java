package pack1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass2ng {

	@BeforeClass
	public void Beforeclass() {
		System.out.println("before class2");
	}
	
	@BeforeMethod
	public void Beforemethod() {
		System.out.println("before method2");
	}
	
	@Test(timeOut=3000)
	public void  testA() {
		System.out.println("testA2");
		
	}
	
	@Test
	public void  testB() {
		System.out.println("testB2");
	}
	@Test
	public void  testC() {
		System.out.println("testC2");
		
	}
	
	@AfterMethod
	public void Aftermethod() {
		System.out.println("after method2");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("after class2");
	}
	
	
	
}
