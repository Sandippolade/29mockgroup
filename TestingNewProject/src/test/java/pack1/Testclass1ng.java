package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass1ng {
	    @BeforeClass
		public void Beforeclass() {
			System.out.println("before class1");
		}
		
		@BeforeMethod
		public void Beforemethod() {
			System.out.println("before method1");
		}
		
		@Test(timeOut=3000)
		public void  testA() {
			System.out.println("testA1");
			
		}
		
		@Test
		public void  testB() {
			System.out.println("testB1");
		}
		@Test
		public void  testC() {
			System.out.println("testC1");
			
		}
		
		@AfterMethod
		public void Aftermethod() {
			System.out.println("after method1");
		}
		@AfterClass
		public void Afterclass() {
			System.out.println("after class1");
		}
		
		
		
	}


