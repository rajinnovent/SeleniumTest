package example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;



public class AmagiWebdriverTest {
  HtmlUnitDriver driver;
  
	
  @Test
  public void logintest() {
	  
	  driver.findElement(By.id("user_email_id")).sendKeys("admin@admin.com");
	  driver.findElement(By.id("user_password")).sendKeys("innoventes");
	  driver.findElement(By.id("buttonSubmit")).click();
	  Assert.assertTrue(isDisplayed("Dashboard"));
	  
	  
  }
  private boolean isDisplayed(String message) {
	
	return driver.getPageSource().contains(message);
}
@BeforeTest
  public void beforeTest() {
	    driver=new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.innoventestech.in/amagi-dsr");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
