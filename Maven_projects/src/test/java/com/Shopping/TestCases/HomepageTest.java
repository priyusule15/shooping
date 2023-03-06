package com.Shopping.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Shopping.Baseclass.TestBase;
import com.Shopping.Testpages.HomePage;

public class HomepageTest extends TestBase
{
	HomePage home;
  @BeforeMethod  // 1st ha run hoeil block
  void setup()
  {
	  initialization(); // testbase madhe create keleli method main testcase run honyadhi driver open zal pahije.
       home = new HomePage(); 
  }
  public HomepageTest() // homepagetest class cha constructor banvla
  {
	  super();       // super keyword use
  }
  @Test(priority=0)
  void verifypageTitle()
  {
	  String title= home.verifytitle();
	  Assert.assertEquals(title,"Automation Exercise");
  } 
  @Test(priority=1)
  void verifyHomePageLanding()
  {
	  boolean elementvisible=home.verifyhomepage();
	  Assert.assertEquals(true,elementvisible);
  }
  
  @AfterMethod   // at the end ha block run hoeil 
  void teardown()
  {
	  driver.quit(); // all task perform zalyavr browser window close hoeil.
	  
  }
}
