package ParameterizationCrossBrowserPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class AllBrowsers {
	 WebDriver driver;
	 @Parameters("browser")
	@Test(priority=1)
	public void crossBrowserTesting(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\CHETAN\\Desktop\\Lalita Selenium\\chromedriver.exe");
			 driver = new ChromeDriver();
		}else
			if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\CHETAN\\Desktop\\Lalita Selenium\\geckodriver.exe");
				  driver = new FirefoxDriver();
				}else {
					System.out.println("Wrong Browser Name Selected");
				}
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
		@Test(priority=2)
		public void VerifyCurrentUrl() {
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
		}
		@Test (priority=3)
		public void VerifyUserNameField() {
			WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
			Assert.assertTrue(username.isDisplayed());
			username.sendKeys("Lalita");
		}
		@Test(priority=4)
		public void VerifyPasswordField() {
			WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
			Assert.assertTrue(password.isDisplayed());
			password.sendKeys("lalita123");
		}
		@Test(priority=5)
		public void ClickLoginButton() {
			WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
			Assert.assertTrue(loginbtn.isDisplayed());
			loginbtn.click();
		}
					
		
		
	}


