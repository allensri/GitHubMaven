import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest {
	
	public static WebDriver driver;
	@BeforeSuite
	public void setUp() {
			
		driver = new ChromeDriver();
		
	}
	@Test 
   public void doLogin() {
     
    	driver.get("http://gmail.com");
        driver.findElement(By.id("Email")).sendKeys("allen.sri@gmail.com");
        driver.findElement(By.id("Passwd")).sendKeys("abcd");
     
    }
	@AfterSuite
	public void teardown() {
		
		driver.quit();
	}
  }

