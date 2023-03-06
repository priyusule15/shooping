package com.Shopping.Testpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shopping.Baseclass.TestBase;

public class LoginPage extends TestBase
{

	@FindBy(xpath="//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")
	WebElement username;
	@FindBy(xpath="//*[@name='password']")
	WebElement psw;
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement lgnbtn;
	
	
	public LoginPage() //loginpage class cha constructor banvla
	{
		PageFactory.initElements(driver,this);
	}
	public void login(String uname,String pword)
	{
		username.sendKeys(uname);
		psw.sendKeys(pword);
		lgnbtn.click();
	}
}
