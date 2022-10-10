package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 {

	@BeforeClass(alwaysRun=true)
	public void openBrowser() {
		System.out.println("Browser is open");
	}
	@AfterClass(alwaysRun=true)
	public void closebrowser() {
		System.out.println("Browser is closed");
	}
	
	@Test(groups = "Smoke")
	public void Test7() {
		System.out.println("Executing Test7");
	}
	@Test(groups = "Functional")
	public void Test8() {
		System.out.println("Executing Test8");
	}
	@Test(groups = {"Functional","Regression"})
	public void Test9() {
		System.out.println("Executong Test9");
	}



}
