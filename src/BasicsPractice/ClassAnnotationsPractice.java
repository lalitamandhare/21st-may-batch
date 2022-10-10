package BasicsPractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotationsPractice {

	 @BeforeClass
	   public void login() {
		System.out.println("Logged into the application");
		Reporter.log("Logged into the application");
	    }
	   @AfterClass
	   public void logout() {
		System.out.println("Logged out from the application");
		Reporter.log("Logged out from the application");
	    }
	   
	   @Test(priority=3)
	   public void homepage() {
		   System.out.println("Checking the homepage");
		   Reporter.log("Checking the homepage");
	   }
	   
	   @Test(priority=1)
	   public void profilepage() {
		   System.out.println("Checking the profilepage");
		   Reporter.log("Checking the profilepage");
	   }
	   
	   @Test(priority=2)
	   public void notificationpage() {
		   System.out.println("Checking the notification page");
		   Reporter.log("Checking the notification page");
	   }



}
