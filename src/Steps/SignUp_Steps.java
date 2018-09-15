package Steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Locators.SignUp_Locators;

public class SignUp_Steps {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\ejagruti\\mm\\DRIVERS\\chromedriver_from_32 and 64 bit_worked for version_v64-66.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser Opened");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		SignUp_Locators Singuppage = new SignUp_Locators(driver);
		
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(Singuppage.ObjEnterUserFirstName).click().keyDown(Singuppage.ObjEnterUserFirstName,Keys.SHIFT).sendKeys(Singuppage.ObjEnterUserFirstName,"amol").keyUp(Singuppage.ObjEnterUserFirstName,Keys.SHIFT);
		action.build().perform();
		
		//Singuppage.ObjEnterUserFirstName.sendKeys("AMOL");
		//Thread.sleep(3000);
		Singuppage.ObjEnterUserSurName.sendKeys("BORKAR");
		Singuppage.ObjMobileNumber.sendKeys("111111");
		Singuppage.ObjEnterPassword.sendKeys("aaaa");
		Singuppage.ObjSelectDOBDay.selectByIndex(8);
		Singuppage.ObjSelectDOBMonth.selectByVisibleText("May");
		Singuppage.ObjSelectDOBYear.selectByValue("1989");
		Singuppage.ObjSavebutton.click();

	}

}
