package dd_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dd_Core.testCore;
import dd_Util.ExcelReader;
import dd_Util.testUtil;



public class verify_all_Google_apps   extends testCore {
	
	
	@BeforeTest
	   public void isSkip()
	  {
		 if(!testUtil.isExecutable("verify_all_Google_apps"))
		    {
			   throw new SkipException("Skipping testcase as runmode is set to No");
		    }
	  }
	
	
	
	@Test(dataProvider="getData")
	public void doLogin(String email,String pass) throws IOException 
	{
		try {
			//click_on_SignIn_Button
			Thread.sleep(3000);
			app_logs.debug("Executing google Brower Launching Test");
			app_logs.debug("click_on_SignIn_Button");
			
			driver.findElement(By.xpath(object.getProperty("Sign"))).click();
			//Enter username
			app_logs.debug("Enter username");
			driver.findElement(By.id(object.getProperty("Email_ID"))).sendKeys(email);
			
			//click on Next button
			app_logs.debug("click on Next button");
			Thread.sleep(3000);
			driver.findElement(By.xpath(object.getProperty("ID_Next_Button"))).click();
			
			//Enter password
			app_logs.debug("Enter password");
			driver.findElement(By.xpath(object.getProperty("Password"))).sendKeys(pass);
			
			//click on Next button
			app_logs.debug("click on Next button");
			Thread.sleep(3000);
			driver.findElement(By.xpath(object.getProperty("Password_Next_Button"))).click();
		
		//Back to Home page
		Thread.sleep(2000);
	    driver.navigate().to(config.getProperty("back_to"));
				   	     	     
		//click on the Google apps button 
		Thread.sleep(4000);
        driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();  
        //locate and swich to frames
		//Account app
		WebElement f=driver.findElement(By.name(object.getProperty("swich_to_frames")));
		driver.switchTo().frame(f); 
		driver.findElement(By.linkText(object.getProperty("Account_App"))).click();
		Thread.sleep(3000); 
		driver.navigate().to(config.getProperty("back_to"));
		  
		//Search app 
		driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
		WebElement f1=driver.findElement(By.name(object.getProperty("swich_to_frames")));
		driver.switchTo().frame(f1);
		driver.findElement(By.linkText(object.getProperty("Search_app"))).click();
		Thread.sleep(3000);
		driver.navigate().to(config.getProperty("back_to"));
		  
		  
		//Map app
		driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
		WebElement f2=driver.findElement(By.name(object.getProperty("swich_to_frames")));
		driver.switchTo().frame(f2);
		driver.findElement(By.partialLinkText(object.getProperty("Map_app"))).click();
		Thread.sleep(3000);
		driver.navigate().to(config.getProperty("back_to"));
		  
		//YouTube app
		driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
		WebElement f3=driver.findElement(By.name(object.getProperty("swich_to_frames")));
		driver.switchTo().frame(f3);
		driver.findElement(By.partialLinkText(object.getProperty("YouTube_app"))).click();
		Thread.sleep(3000);
		driver.navigate().to(config.getProperty("back_to"));
        
	    //play app
		Thread.sleep(3000);
		driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
		WebElement f4=driver.findElement(By.name(object.getProperty("swich_to_frames")));
		driver.switchTo().frame(f4);
		driver.findElement(By.partialLinkText(object.getProperty("play_app"))).click();
		Thread.sleep(3000);
		driver.navigate().to(config.getProperty("back_to"));
		  
		//News app
		Thread.sleep(3000);
		driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
		WebElement f5=driver.findElement(By.name(object.getProperty("swich_to_frames")));
		driver.switchTo().frame(f5);
		driver.findElement(By.partialLinkText(object.getProperty("News_app"))).click();
		Thread.sleep(3000);
		driver.navigate().to(config.getProperty("back_to"));
		  
		  
		//Gmail app
		Thread.sleep(3000);
		driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
		WebElement f6=driver.findElement(By.name(object.getProperty("swich_to_frames")));
		driver.switchTo().frame(f6);
		driver.findElement(By.partialLinkText(object.getProperty("Gmail_app"))).click();
		Thread.sleep(3000);
		driver.navigate().to(config.getProperty("back_to"));
		  
		  
		//Meet app
		Thread.sleep(3000);
		driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
		WebElement f7=driver.findElement(By.name(object.getProperty("swich_to_frames")));
		driver.switchTo().frame(f7);
		driver.findElement(By.partialLinkText(object.getProperty("Meet_app"))).click();
		Thread.sleep(3000);
		driver.navigate().to(config.getProperty("back_to"));
		  
		  
		  
	    //Chat app
		Thread.sleep(3000);
	    driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
	 	WebElement f8=driver.findElement(By.name(object.getProperty("swich_to_frames")));
	    driver.switchTo().frame(f8);
	    driver.findElement(By.partialLinkText(object.getProperty("Chat_app"))).click();
	 	Thread.sleep(3000);
	 	driver.navigate().to(config.getProperty("back_to"));
	 		  
	 		  
	 		  
	  	//Contacts app
	 	Thread.sleep(3000);
	  	driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
	  	WebElement f9=driver.findElement(By.name(object.getProperty("swich_to_frames")));
	  	driver.switchTo().frame(f9);
	  	driver.findElement(By.partialLinkText(object.getProperty("Contacts_app"))).click();
	  	Thread.sleep(3000);
	  	driver.navigate().to(config.getProperty("back_to"));
	  		  
	  		  
	  	//Drive app
	  	Thread.sleep(3000);
	  	driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
	  	WebElement f10=driver.findElement(By.name(object.getProperty("swich_to_frames")));
	  	driver.switchTo().frame(f10);
	    driver.findElement(By.partialLinkText(object.getProperty("Drive_app"))).click();
	  	Thread.sleep(3000);
	  	driver.navigate().to(config.getProperty("back_to"));
	  		
	  	//Calendar app
	  	Thread.sleep(3000);
	  	driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
	    WebElement f11=driver.findElement(By.name(object.getProperty("swich_to_frames")));
	  	driver.switchTo().frame(f11);
	  	Thread.sleep(3000);
	  	driver.findElement(By.partialLinkText(object.getProperty("Calendar_app"))).click();
	  	Thread.sleep(3000);
	  	driver.navigate().to(config.getProperty("back_to"));
	  		
	  		  
	  		  
	  	//Translate app
	  	Thread.sleep(3000);
	  	driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
	  	WebElement f12=driver.findElement(By.name(object.getProperty("swich_to_frames")));
	  	driver.switchTo().frame(f12);
	    driver.findElement(By.xpath(object.getProperty("Translate_app"))).click();
	  	Thread.sleep(3000);
	  	driver.navigate().to(config.getProperty("back_to"));
	  		  
	  		  
	 	//Photos app
	  	Thread.sleep(3000);
	 	driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
	 	WebElement f13=driver.findElement(By.name(object.getProperty("swich_to_frames")));
	 	driver.switchTo().frame(f13);
	 	driver.findElement(By.xpath(object.getProperty("Photos_app"))).click();
	 	Thread.sleep(3000);
	 	driver.navigate().to(config.getProperty("back_to"));
	 	  		  	
		
	}catch(Throwable t)
		{
		 testUtil.captureScreenshot("verify_all_Google_apps");
		  Assert.assertTrue(false, t.getMessage());
		}
	}
	
	
	@DataProvider
	public static Object[][] getData()
	{
		 return testUtil.getData("verify_all_Google_apps");
	}

	
}

