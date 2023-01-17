package paralleltests;

import org.testng.annotations.Test;


public class Class3 {
	
	
	
	
	@Test(groups= {"smoke"})
	public void class3_test1() {
		System.out.println("Thread Id:"+ Thread.currentThread().getId());
		System.out.println("In Class3 group test1");
	}
	
	@Test(groups= {"smoke"})
	public void class3_test2() {
		System.out.println("In class3 group test2");
	}
	
	@Test(dependsOnGroups= {"smoke"})
	public void class3_test3() {
		System.out.println("Group test method");
	}
	
	

}
