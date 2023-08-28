package Rough;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * 2.  To verify all the Google apps (My Account, Search, Maps, YouTube, Play, News, Gmail, Drive, Google+, Translate, Photos) in the dialog box
 */
public class Assign_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Manual Testing and Automation Selenium\\Selenium_Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		//click on app
		driver.findElement(By.xpath("//*[@id='gbwa']")).click();
		
		//no of frames
		System.out.println("Number of frame on webpage "+driver.findElements(By.tagName("iframe")).size());
        
		
		  //locate and swich to frames
		  //Account app
		  WebElement f=driver.findElement(By.name("app"));//name="app"
		  driver.switchTo().frame(f); 
		  driver.findElement(By.linkText("Account")).click();
		  Thread.sleep(3000); 
		  driver.navigate().to("https://www.google.co.in/");
		  
		  //Search app 
		  driver.findElement(By.xpath("//*[@id='gbwa']")).click();
		  WebElement f1=driver.findElement(By.name("app"));//name="app"
		  driver.switchTo().frame(f1);
		  driver.findElement(By.partialLinkText("Sea")).click();
		  Thread.sleep(3000);
		  driver.navigate().to("https://www.google.co.in/");
		  
		  
		  //Map app
		  driver.findElement(By.xpath("//*[@id='gbwa']")).click();
		  WebElement f2=driver.findElement(By.name("app"));//name="app"
		  driver.switchTo().frame(f2);
		  driver.findElement(By.partialLinkText("Map")).click();
		  Thread.sleep(3000);
		  driver.navigate().to("https://www.google.co.in/");
		  
		  //YouTube app
		  driver.findElement(By.xpath("//*[@id='gbwa']")).click();
		  WebElement f3=driver.findElement(By.name("app"));//name="app"
		  driver.switchTo().frame(f3);
		  driver.findElement(By.partialLinkText("YouTu")).click();
		  Thread.sleep(3000);
		  driver.navigate().to("https://www.google.co.in/");
		  
		  //PlayStore app
		  driver.findElement(By.xpath("//*[@id='gbwa']")).click();
		  WebElement f4=driver.findElement(By.name("app"));//name="app"
		  driver.switchTo().frame(f4);
		  driver.findElement(By.partialLinkText("Pla")).click();
		  Thread.sleep(3000);
		  driver.navigate().to("https://www.google.co.in/");
		  
		  
		//Gmail app
		  driver.findElement(By.xpath("//*[@id='gbwa']")).click();
		  WebElement f5=driver.findElement(By.name("app"));//name="app"
		  driver.switchTo().frame(f5);
		  driver.findElement(By.partialLinkText("Gmai")).click();
		  Thread.sleep(3000);
		  driver.navigate().to("https://www.google.co.in/");
		  
		//Meet app
 		  driver.findElement(By.xpath("//*[@id='gbwa']")).click();
 		  WebElement f7=driver.findElement(By.name("app"));//name="app"
 		  driver.switchTo().frame(f7);
 		  driver.findElement(By.partialLinkText("Meet")).click();
 		  Thread.sleep(3000);
 		  driver.navigate().to("https://www.google.co.in/");
 		  
 		  //Chat app
	 	  driver.findElement(By.xpath("//*[@id='gbwa']")).click();
	 	  WebElement f8=driver.findElement(By.name("app"));//name="app"
	 	  driver.switchTo().frame(f8);
	 	  driver.findElement(By.partialLinkText("Chat")).click();
	 	  Thread.sleep(3000);	 	  
	 	  driver.navigate().to("https://www.google.co.in/");
	 		  
	 		  
	 		  
	  		//Contacts app
	  		driver.findElement(By.xpath("//*[@id='gbwa']")).click();
	  		WebElement f9=driver.findElement(By.name("app"));//name="app"
	  		driver.switchTo().frame(f9);
	  		driver.findElement(By.partialLinkText("Contacts")).click();
	  		Thread.sleep(3000);	  		
	  		driver.navigate().to("https://www.google.co.in/");
	  		  
	  		  
	  		//Drive app
	  		  driver.findElement(By.xpath("//*[@id='gbwa']")).click();
	  		  WebElement f10=driver.findElement(By.name("app"));//name="app"
	  		  driver.switchTo().frame(f10);
	  		  driver.findElement(By.partialLinkText("Drive")).click();
	  		  Thread.sleep(3000);	  		  
	  		  driver.navigate().to("https://www.google.co.in/");
	  		
	  		//Calendar app
	  		  driver.findElement(By.xpath("//*[@id='gbwa']")).click();
	  		  WebElement f11=driver.findElement(By.name("app"));//name="app"
	  		  driver.switchTo().frame(f11);
	  		  driver.findElement(By.partialLinkText("Calendar")).click();
	  		  Thread.sleep(3000);	  		  
	  		  driver.navigate().to("https://www.google.co.in/");
	  		
	  		  
	  		  
	  		//Translate app
	  		  driver.findElement(By.xpath("//*[@id='gbwa']")).click();
	  		  WebElement f12=driver.findElement(By.name("app"));//name="app"
	  		  driver.switchTo().frame(f12);
	  		  driver.findElement(By.partialLinkText("Translate")).click();
	  		  Thread.sleep(3000);	  		  
	  		  driver.navigate().to("https://www.google.co.in/");
	  		  
	  		  
	 	     //Photos app
	 	  	  driver.findElement(By.xpath("//*[@id='gbwa']")).click();
	 	  	  WebElement f13=driver.findElement(By.name("app"));//name="app"
	 	  	  driver.switchTo().frame(f13);
	 	      driver.findElement(By.partialLinkText("Photos")).click();
	 	  	  Thread.sleep(3000);
	 	  	  driver.navigate().to("https://www.google.co.in/");
	}

}
