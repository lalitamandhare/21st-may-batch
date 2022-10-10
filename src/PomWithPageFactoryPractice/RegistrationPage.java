package PomWithPageFactoryPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage {
	
	//Declaration of Webelements.
	@FindBy(xpath="//img[@alt='Facebook']")private WebElement reg_fblogo;
    @FindBy(xpath="//a[@aria-label='Already have an account?']")private WebElement already_acc;
    @FindBy(xpath="//a[@title='Sign up for Facebook']")private WebElement signuplink;
    @FindBy(name="firstname")private WebElement firstname;
    @FindBy(name="lastname")private  WebElement surname;
    @FindBy(name="reg_email__")private WebElement mob_email;
    @FindBy(xpath="//input[@name='reg_email_confirmation__']")private WebElement mob_reenteredemail;
    @FindBy(xpath="//input[@type='password']")private WebElement password;
    @FindBy(name="birthday_day")private WebElement birthdate;
    @FindBy(name="birthday_month")private WebElement birthmonth;
    @FindBy(name="birthday_year")private WebElement birthyear;
    @FindBy(xpath="//input[@value='2']")private WebElement gender_male;
    @FindBy(xpath="//input[@value='1']")private WebElement gender_female;
    @FindBy(name="websubmit")private WebElement submitbtn;
    
    //Initialization of WebElement;
    public RegistrationPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    //usage
    
    public void ClickFacebookSignupLink() {
    	signuplink.click();
    }
    public void VerifyFacebookRegistrationPageFblogo() {
    	Assert.assertTrue(reg_fblogo.isDisplayed(), "The Facebook logo on registration page is not displayed");
    }
    public void VerifyFacebookPageAlreadayAccount() {
    	Assert.assertTrue(already_acc.isDisplayed(), "The already having an account option on registration page is not diplayed");
    	Assert.assertEquals(already_acc.getText(), "Already have an account?");
    }
    public void SetFacebookRegistrationPageFirstname(String fn) {
    	firstname.sendKeys(fn);
    }
    public void SetFacebookRegistrationPageSurname() {
    	surname.sendKeys("XYZ");
    }
    public void SetFacebookRegistrationPageMobileEmail() {
    	mob_email.sendKeys("test123@gmail.com");
    }
    public void SetFacebookRegistrationPageReenterdEmail(String em) {
    	mob_reenteredemail.sendKeys(em);
    }
    public void SetFacebookRegistrationPagePassword() {
    	password.sendKeys("abcdef123");
    }
    public void SetFacebookRegistrationPageBirthday() {
    	Select bday=new Select(birthdate);
    	Assert.assertTrue(birthdate.isDisplayed(), "Birth day dropdown is not available on the website.");
    	Assert.assertFalse(birthdate.isSelected(),"The Birthdate is selected initially");
    	bday.selectByVisibleText("19");
    }
    public void SetFacebookRegistrationPageBirthMonth() {
    	Select bmonth=new Select(birthmonth);
    	Assert.assertTrue(birthmonth.isDisplayed(),"Birth month dropdown is not available on the website");
    	Assert.assertFalse(birthmonth.isSelected(),"the Birthmonth is selected initially");
    	bmonth.selectByVisibleText("Mar");
    }
    public void SetFacebookRegistrationPageBirthYear() {
    	Select byear=new Select(birthyear);
    	Assert.assertTrue(birthyear.isDisplayed(),"Birth year dropdown is not available on the website");
    	Assert.assertFalse(birthyear.isSelected(),"The Birthyear is selected initially");
    	byear.selectByVisibleText("1975");
    }
    public void SetFacebookRegistrationPageGender(String gender) {
    	if(gender.equalsIgnoreCase("male")) {
    		gender_male.click();
    	}else if(gender.equalsIgnoreCase("female")) {
    		gender_female.click();
    	}else {
    		System.out.println("Please select valid input");
    	}
    	  }
    public void ClickFacebookRegistrationPageSubmitBtn() {
    	submitbtn.click();
    }
    
    
    
    
    
    
    
	
}
