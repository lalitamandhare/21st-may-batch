package KeywordsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountPractice {

	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Browser is Lauched.");
	}
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Browser is closed.");
	}
	@BeforeMethod
	public void login() {
		System.out.println("Logged into the application.");
	}
	@AfterMethod
	public void Logout() {
		System.out.println("Logged out from the application");
	}
	@Test(priority=1)
	public void HomePageTest() {
		System.out.println("Checking the homepage of the application");
	}
	@Test(priority=2,invocationCount=5)
	public void NotificationPageTest() {
		System.out.println("Checking the notification page of the application");
	}

}
