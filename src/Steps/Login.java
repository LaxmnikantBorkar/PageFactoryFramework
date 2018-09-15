package Steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Locators.SignUp_Locators;

public class Login extends BaseClass {

	@Test
	public void f() throws InterruptedException {
		SignUp_Locators Singuppage = new SignUp_Locators(driver);
		System.out.println("userName" + getProperties("userName") + "Password"
				+ getProperties("password"));
		
		userType(Singuppage.ObjEnterUserName,getProperties("userName"));
		userType(Singuppage.ObjEnterUserPassword, getProperties("password"));
		userClick(Singuppage.ObjSave); 
		
		/*Singuppage.ObjEnterUserName.sendKeys(getProperties("userName"));
		Singuppage.ObjEnterUserPassword.sendKeys(getProperties("password"));
		Singuppage.ObjSave.click();
*/
		/*
		 * Actions action = new Actions(driver); Thread.sleep(4000);
		 * action.moveToElement(Singuppage.ObjEnterUserFirstName).click()
		 * .keyDown(Singuppage.ObjEnterUserFirstName, Keys.SHIFT)
		 * .sendKeys(Singuppage.ObjEnterUserFirstName, "amol")
		 * .keyUp(Singuppage.ObjEnterUserFirstName, Keys.SHIFT);
		 * action.build().perform();
		 */ 
		  /*Singuppage.ObjEnterUserSurName.sendKeys("BORKAR");
		 Singuppage.ObjMobileNumber.sendKeys("111111");
		  Singuppage.ObjEnterPassword.sendKeys("aaaa");
		  Singuppage.ObjSelectDOBDay.selectByIndex(8);
		  Singuppage.ObjSelectDOBMonth.selectByVisibleText("May");
		  Singuppage.ObjSelectDOBYear.selectByValue("1989");
		  Singuppage.ObjSavebutton.click();
		 */}
}
