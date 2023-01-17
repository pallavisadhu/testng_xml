package paralleltests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;


public class Class1 {
	
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class1");
	}
	
	@Test(priority=2)
	public void class1_test1() {
		System.out.println("Thread Id:"+ Thread.currentThread().getId());
		System.out.println("In Class1 and test1");
		
	}
	
	@Test(priority=1)
	public void class1_test2() {
		System.out.println("Thread Id:"+ Thread.currentThread().getId());
		System.out.println("In Class1 and test2");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After class1");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}


}
