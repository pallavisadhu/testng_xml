package paralleltests;

import org.testng.annotations.Test;


public class Class4 {
	
	@Test(invocationCount=3)
	public void class4_test1() {
		System.out.println("Thread Id:"+ Thread.currentThread().getId());

		System.out.println("In Class4,test1 runs for 3 times");
	}

}
