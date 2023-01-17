package paralleltests;

import org.testng.annotations.Test;

public class Class6 {
	
	@Test(enabled=true)
	public void class6_test1() {
		System.out.println("Thread Id:"+ Thread.currentThread().getId());

		System.out.println("In Class6, test1 is set for enabled=true");
	}

}
