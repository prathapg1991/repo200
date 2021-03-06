package pack123;

import org.eclipse.jetty.server.Response.OutputType;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.sun.jna.platform.FileUtils;

@Test 
public class Screen {

	
	   public void openBrowser() throws Exception {
	    	WebDriver  driver = new FirefoxDriver();
	    	  driver.manage().window().maximize();
	    	  driver.get("http://www.google.com");
	    	  try{
	                //the below statement will throw an exception as the element is not found, Catch block will get executed and takes the screenshot.
	    		  driver.findElement(By.id("testing")).sendKeys("test");
	                 
	                   //if we remove the below comment, it will not return exception and screen shot method will not get executed.
	    		  //driver.findElement(By.id("gbqfq")).sendKeys("test");
	    	  }
	    	  catch (Exception e){
	    		  System.out.println("I'm in exception");
	//calls the method to take the screenshot.
	    		  getscreenshot();
	     	  }
	      }
	      
	      public void getscreenshot() throws Exception 
	      {
	              File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	           //The below method will save the screen shot in d drive with name "screenshot.png"
	              FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
	      }
	 
}
