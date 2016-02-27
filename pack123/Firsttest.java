package pack123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firsttest {
@Test
public void test() throws InterruptedException{
	System.out.println("from test method");
WebDriver driver=new FirefoxDriver();
driver.get("http://http://testng.org/");
driver.manage().window().maximize();

Thread.sleep(3000);
driver.findElement(By.id(""));
}

}
