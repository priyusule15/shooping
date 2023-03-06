package com.Shopping.Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
    {
	//for browser ,url create static vaeriables for webdriver n properties 
  
	public static WebDriver driver;
 
    public static Properties prop;
  
    public TestBase()  // create super constructor
     {
	  prop=new Properties();
	  
	  FileInputStream fis; // configure file madhe jya properties ahet tya acceess karnyasathi hi method
	  try {
		fis=new FileInputStream("C:\\Users\\priya\\eclipse-workspace\\Maven_projects\\src\\main\\java\\com\\Shooping\\config\\config.properties");
	     prop.load(fis);          // file chya properties ghevun ti file load karavi.
	  } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  
  public void initialization()// method crate keli 
  {
	  String browsername=prop.getProperty("browser");  // aapn hyat hardcode nahi use krnar object create karun method call karnar mhnun 
	                                                   //congi file mdhil browser key mhnun pass kela ahe.
	  if(browsername.equals("Chrome"))
	  {
		  driver=new ChromeDriver();// condition check krel yes then block chya baher
	  }
		  else 
		  {
			  driver=new FirefoxDriver();
		 }
	  driver.manage().window().maximize();  // hya acctions perform krel
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get(prop.getProperty("url"));
	  
	  
	  
}
  
}
  

