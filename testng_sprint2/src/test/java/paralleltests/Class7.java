package paralleltests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Class7 {
	
	@Parameters({"name"})
	@Test
	public void class7_test1(String name) {
		System.out.println("Thread Id:"+ Thread.currentThread().getId());

		System.out.println("In Class7, retrieved name from parameters:"+ name);
	}

}
