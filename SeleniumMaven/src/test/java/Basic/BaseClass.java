package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.DemoWorkShop.DWSElement;

public class BaseClass {
	public WebDriver driver;
	
@BeforeClass(alwaysRun = true)
public void openBrowser() {
	 driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	DWSElement dws = new DWSElement (driver);
	dws.loginClick();
	dws.emailTextField.sendKeys("admin01@gmail.com");
	dws.passwordTextField.sendKeys("admin01");
	dws.logInButton.click();
	dws.logOutLink.click();
	
}

@AfterClass(alwaysRun = true)
public void closeBrowser() {
	driver.quit();
}
}
