package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
     public Registration(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "gender-male")
	WebElement gender;
	public void gender() {
		gender.click();
	}
	@FindBy(id = "FirstName")
	WebElement firstname;
	public void firstName(String fname) {
		firstname.sendKeys(fname);
	}
	@FindBy(id = "LastName")
	WebElement lastname;
	public void lastName(String lname) {
		lastname.sendKeys(lname);
	}
	@FindBy(id = "Email")
	WebElement email;
	public void email(String emailid) {
		email.sendKeys(emailid);
	}
	@FindBy(id="Password")
	WebElement password;
	public void password(String pass) {
		password.sendKeys(pass);
	}
	@FindBy(id="ConfirmPassword")
	WebElement confirmpassword;
	public void confirmPassword(String confpass) {
		confirmpassword.sendKeys(confpass);
	}
}
