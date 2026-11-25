package testng;

import org.testng.annotations.Test;

public class Demo2 {
	
		@Test(invocationCount = 5)
		public void Account() {
			System.out.println("Account Open");
		}
}
