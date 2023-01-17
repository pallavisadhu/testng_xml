package paralleltests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Class8 {
	
		
	@DataProvider(name="testdata")
	public Object[][] dataProviderMethod(){
		return new Object[][] {{"first"},{"second"}};
	}
	
	@Test(dataProvider="testdata")
	public void class8_test1(String value) {
		System.out.println("Thread Id:"+ Thread.currentThread().getId());

		System.out.println("In Class8, used data provider:" + value);
	}

}
