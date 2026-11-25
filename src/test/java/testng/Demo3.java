package testng;

import org.testng.annotations.Test;

public class Demo3 {
	@Test
	public void Login() {
		System.out.println("Login in Account");
	}
	@Test(dependsOnMethods = "Login")
	public void EditAccount() {
		System.out.println("Edit Account");
	}
	@Test(dependsOnMethods = "Login")
	public void Logout() {
		System.out.println("logout");
	}

}
