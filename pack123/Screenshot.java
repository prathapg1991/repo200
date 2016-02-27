package pack123;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Screenshot {

	@Test
	public void test(){
		System.out.println("from screen shot");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://www.yatra.com/");
	driver.manage().window().maximize();
	
	
	
	}
}
