package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
	public WebElement bookbutton;
	
	
	@FindBy(xpath = "//a[text()='Log in']")
	public WebElement logbutton;
	
	public void LogButton() {
		logbutton.click();
	}
	@FindBy(id = "Email")
	public WebElement emailtextfield;

	public void enterEmail(String username) {
		emailtextfield.sendKeys(username);
	}

	@FindBy(id = "Password")
	public WebElement emailpassword;

	public void enterPassword(String password) {

		emailpassword.sendKeys(password);
	}

 
	@FindBy(xpath = "//a[text()='Log out']")
	public WebElement logout;
	
	public void logOut() {
		logout.click();
	}
	
	@FindBy(xpath = "(//input[contains(@class,'button-1')])[4]")
	public WebElement loginbutton;
	
	public void clickOnLogin() {
		
		loginbutton.click();
	}
}
