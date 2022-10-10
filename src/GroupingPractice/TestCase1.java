package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	@BeforeTest(alwaysRun=true)
	public void openDB() {
		System.out.println("Database is open");
	}
	@AfterTest(alwaysRun=true)
	public void closeDB() {
		System.out.println("Database is closed");
	}
	@BeforeClass(alwaysRun=true)
	public void openBrowser() {
		System.out.println("Browser is open");
	}
	@AfterClass(alwaysRun=true)
	public void closebrowser() {
		System.out.println("Browser is closed");
	}
	@Test(groups = "Smoke")
	public void Test1() {
		System.out.println("Executing Test1");
	}
	@Test(groups = "Functional")
	public void Test2() {
		System.out.println("Executing Test2");
	}
	@Test(groups = {"Functional","Regression"})
	public void Test3() {
		System.out.println("Executong Test3");
	}

}

