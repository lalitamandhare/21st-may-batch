package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {

	@BeforeClass(alwaysRun=true)
	public void openBrowser() {
		System.out.println("Browser is open");
	}
	@AfterClass(alwaysRun=true)
	public void closebrowser() {
		System.out.println("Browser is closed");
	}
	
	@Test(groups = "Smoke")
	public void Test4() {
		System.out.println("Executing Test4");
	}
	@Test(groups = "Functional")
	public void Test5() {
		System.out.println("Executing Test5");
	}
	@Test(groups = {"Functional","Regression"})
	public void Test6() {
		System.out.println("Executong Test6");
	}


}
