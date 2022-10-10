package KeywordsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethodKeywordPractice {

	@Test(priority=1)
	public void OpenUrl() {
		System.out.println("Url is open");
		Assert.fail();
	}
	@Test(priority=2,dependsOnMethods="OpenUrl")
	public void Login() {
		System.out.println("Logged into the application");
	}
	@Test(priority=3,dependsOnMethods={"OpenUrl","Login"})
	public void Logout() {
		System.out.println("Logged out from the application");
	}
	

}
