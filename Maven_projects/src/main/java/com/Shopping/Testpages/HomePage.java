package com.Shopping.Testpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shopping.Baseclass.TestBase;

public class HomePage extends TestBase // inheritance use base class che pacakge import access all properties of baseclass
{
 // homepage varil all webelements che xpath hya eka file la thevne.
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement home;//home tab cha xpath n webelement cha object
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	WebElement products;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	WebElement Cart;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
	WebElement loginelement;
	
	@FindBy(xpath= "//h2[contains(text(),'Category')]")
    WebElement cate;
	
	
	public HomePage() //homepage class cha constructor banvla
	{
		PageFactory.initElements(driver,this);
	}
	   void clickonhomelink()
	   {
		   home.click();// home webelement cha object
	   }
	   public String verifytitle()
	   {
		   String title=driver.getTitle(); // aapn correct page ha ahot he pahnyasathi method ghetli 
		   return title;
	   }
	   public boolean verifyhomepage()
	   {
		   boolean catedis=cate.isDisplayed();// home var click kelyavr homepage open zalyavr tech ahe ka he catergoryne kalel 
		   return catedis;                    //category elemnt display ahe na check krel
		}
 
	 public LoginPage clickonlogin()
	   {
		   loginelement.click(); // login cha webelemnt object
		   return new LoginPage();
		   
	   }
	
} 
	
	
	
	
	
	
	
	
	
	

