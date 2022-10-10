package VerificationPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicVerificationPractice {

	//1.AssertEquals():-if actual and expected are matching.
//	@Test
//	public void Test1() {
//		String Actual="Hi";
//		String Expected="Hi";
//		Assert.assertEquals(Actual, Expected);
//	}
	//2.AssertnotEquals():-if actual and expected are not matching,then test case will pass.
//	@Test
//	public void Test2() {
//		String Actual="Hi";
//		String Expected="Hello";
//		Assert.assertNotEquals(Actual, Expected);
//	}
	//3.Assert Null:-If test field is empty then testcase will pass.
//	@Test
//	public void Test3() {
//		String Actual=null;
//		Assert.assertNull(Actual);
//	}
	//4.AssertNotNull:-If test field is notempty then testcase will pass.
	@Test
	public void Test4() {
		String Actual="1500";
		Assert.assertNotNull(Actual);
	}
	//5.Assert fail for purposefully failing the test case. 
//	@Test
//	public void Test4() {
//		String Actual="1500";
//		Assert.fail(Actual);
//	}
	
}
