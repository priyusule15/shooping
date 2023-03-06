package com.Shopping.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Shopping.Baseclass.TestBase;
import com.Shopping.Testpages.HomePage;
import com.Shopping.Testpages.LoginPage;

public class LoginPageTest extends TestBase
{
  HomePage home;
  LoginPage loginp;
  
  public LoginPageTest()
  {
	  super();
	  }
  @BeforeMethod
  void setup()
  {
	  initialization();
	  home=new HomePage();
	  loginp=new LoginPage();
   }
  @Test
  public void verifyvalidlogin()
  {
	  loginp=home.clickonlogin();
	  loginp.login(prop.getProperty("username"), prop.getProperty("password"));
	 Assert.assertEquals("https://automationexercise.com/", "https://automationexercise.com/");  
   }
  @AfterMethod
  void teardown()
  {
	  driver.quit();
	  
  }
}
