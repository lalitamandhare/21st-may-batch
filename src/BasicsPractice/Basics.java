package BasicsPractice;

import org.testng.annotations.Test;

public class Basics {
@Test(priority=1)
	public void openurl() {
		System.out.println("URL is opened.");
		
	}
	@Test(priority=2)
	public void login() {
		System.out.println("Login Succesfully.");
	}
	@Test(priority=3)
	public void logout() {
		System.out.println("Logout is Succesfully");
	}

}
