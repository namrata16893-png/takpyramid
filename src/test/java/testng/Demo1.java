package testng;


import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void CreateAccount() {
		System.out.println("Create Account");
	}
	@Test(enabled = false)
	public void EditAccount() {
		System.out.println("Edit Account");
	}
	@Test(enabled = true)
	public void DeleteAccount() {
		System.out.println("Delete Account");
	}
}
