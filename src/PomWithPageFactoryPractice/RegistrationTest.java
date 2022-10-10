package PomWithPageFactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {
        //methods call.//testcases.
	
	//Browser setup===>validations apply====>browser close.
	 WebDriver driver;
	@BeforeClass
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CHETAN\\Desktop\\Lalita Selenium\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public void teardown() {
//		driver.close();
	}
	@Test
	public void FacebookRegistrationPageTest_Positive() {
		RegistrationPage rp=new RegistrationPage(driver);
		rp.ClickFacebookSignupLink();
		rp.VerifyFacebookRegistrationPageFblogo();
		rp.VerifyFacebookPageAlreadayAccount();
		rp.SetFacebookRegistrationPageFirstname("lalita");
		rp.SetFacebookRegistrationPageSurname();
		rp.SetFacebookRegistrationPageMobileEmail();
		rp.SetFacebookRegistrationPageReenterdEmail("test123@gmail.com");
		rp.SetFacebookRegistrationPagePassword();
		rp.SetFacebookRegistrationPageBirthday();
		rp.SetFacebookRegistrationPageBirthMonth();
		rp.SetFacebookRegistrationPageBirthYear();
		rp.SetFacebookRegistrationPageGender("female");
		rp.ClickFacebookRegistrationPageSubmitBtn();
	}
	

}
