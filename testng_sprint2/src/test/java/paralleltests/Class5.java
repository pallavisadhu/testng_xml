package paralleltests;

import org.testng.annotations.Test;


public class Class5 {
	
	@Test(timeOut=1000)
	public void class5_test1() {
		System.out.println("Thread Id:"+ Thread.currentThread().getId());

		System.out.println("In Class5, test1 is set for timeout=1000");
	}

}
