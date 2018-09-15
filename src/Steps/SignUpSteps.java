package Steps;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Locators.SignUp_Locators;

public class SignUpSteps extends BaseClass{

  @Test
  public void fB() throws IOException {
	  SignUp_Locators Singuppage=new SignUp_Locators(driver);	  
	  
	  sleep(3000);
	  System.out.println(getJsonValue("$.SignUp.UserFirstName"));
	  userType(Singuppage.ObjEnterUserFirstName, getJsonValue("$.SignUp.UserFirstName"));
	  userType(Singuppage.ObjEnterUserSurName, getJsonValue("$.SignUp.UserSurName"));
	  userType(Singuppage.ObjMobileNumber, getJsonValue("$.SignUp.MobileNumber"));
	  userType(Singuppage.ObjEnterPassword, getJsonValue("$.SignUp.EnterPassword"));
	  Singuppage.ObjSelectDOBDay.selectByIndex(Integer.parseInt(getJsonValue("$.SignUp.SelectDOBDay")));
	  System.out.println(Singuppage.ObjSelectDOBDay);
	  userType(Singuppage.ObjSelectDOBDay, Integer.parseInt(getJsonValue("$.SignUp.SelectDOBDay")));
	  
	  
	
  }
}
