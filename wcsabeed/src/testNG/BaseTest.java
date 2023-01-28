package testNG;

import java.time.Duration;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
	static WebDriver driver;
  @BeforeMethod
  public void OpenBrowser() {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("http://127.0.0.1/user/submit_tt.do");
	  
	  }
	
  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }
}
