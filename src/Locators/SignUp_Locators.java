package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUp_Locators {

	WebDriver driver;

	public SignUp_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement ObjEnterUserName;
	
	@FindBy(xpath="//input[@name='pass']")
	public WebElement ObjEnterUserPassword;
	
	@FindBy(xpath="//input[@value='Log In']")
	public WebElement ObjSave;
	
	
	@FindBy(xpath="//input[@id='u_0_j']")//input[@name='firstname']
	public WebElement ObjEnterUserFirstName;
	
	
	@FindBy(xpath="//input[@id='u_0_l']")//input[@name='lastname']
	public WebElement ObjEnterUserSurName;
	
	@FindBy(xpath="//input[@id='u_0_o']")//input[@name='reg_email__']
	public WebElement ObjMobileNumber;
	
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")//input[@name='reg_email__']
	public WebElement ObjRegMailConfirm;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")////input[@id='u_0_v']
	public WebElement ObjEnterPassword;
	
	@FindBy(xpath="//span[@id='u_0_x']//select[contains(@id,'day')]")
	public Select ObjSelectDOBDay;
	
	@FindBy(xpath="//select[@id='month']")
	public Select ObjSelectDOBMonth;
	
	@FindBy(xpath="//select[@id='year']")
	public Select ObjSelectDOBYear;
	
	@FindBy(xpath="//label[contains(text(),'Male')]/preceding-sibling::*[1]")
	public WebElement ObjGenderButton;
	
	
	@FindBy(xpath="//button[@id='u_0_11']")
	public WebElement ObjSavebutton;

}
