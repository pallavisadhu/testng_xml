package paralleltests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class class2 {
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class2");		
	}
	@Test
	public void class2_test1() {
		System.out.println("Thread Id:"+ Thread.currentThread().getId());

		System.out.println("In Class2 and test1");
	}
	
	@Test(dependsOnMethods= {"class2_test1"})
	public void class2_test2() {
		System.out.println("In class2 and test2. It depends on the class2_test1 method");
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class2");
	}

}
