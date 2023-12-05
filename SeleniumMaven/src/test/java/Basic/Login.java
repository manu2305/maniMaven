package Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoWorkShop.DWSElement;

public class Login extends BaseClass {
	@Test(dataProvider = "loginData")
	public void login(String username,String password) throws IOException {
	
		DWSElement dws = new DWSElement (driver);
		dws.loginClick();
		dws.emailTextField.sendKeys(username);
		dws.passwordTextField.sendKeys(password);
		dws.logInButton.click();
		dws.logOutLink.click();
	}
    @DataProvider(name = "loginData")
    public Object[][] dataProvider() throws EncryptedDocumentException, IOException {
    	return DataProviderLogIn.lData();
    }
}
