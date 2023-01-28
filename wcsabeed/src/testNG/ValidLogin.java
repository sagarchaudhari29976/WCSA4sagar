package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidLogin extends BaseTest{
  @Test
  public void validlogin() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginbutton")).click();
  }
}
