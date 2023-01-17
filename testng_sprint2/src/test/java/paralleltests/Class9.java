package paralleltests;

import org.testng.annotations.Test;

public class Class9 {
	
	@Test
	public void class9_test1() {
		System.out.println("Thread Id:"+ Thread.currentThread().getId());

		System.out.println("In Class9");
	}

}
