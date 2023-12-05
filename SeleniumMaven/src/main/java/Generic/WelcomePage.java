package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
public WelcomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
	public WebElement bookbutton;
	
	public void bookButton() {
		bookbutton.click();
	}
	@FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
	public WebElement computerbutton;
	
	public void computerButton() {
		computerbutton.click();
	}
	@FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
	public WebElement electronicbutton;
	public void electronicButton() {
		electronicbutton.click();
	}
	@FindBy(xpath = "(//a[contains(text(),'Apparel & Shoes')])[1]")
	public WebElement apparelbutton;
	public void apparelButton() {
		apparelbutton.click();
	}
	@FindBy(xpath = "(//a[contains(text(),'Digital downloads')])[1]")
	public WebElement digitalbutton;
	public void digitalButton() {
		digitalbutton.click();
	}
	@FindBy(xpath = "(//a[contains(text(),'Jewelry')])[1]")
	public WebElement jewerlybutton;
	public void jewerlyButton() {
		jewerlybutton.click();
	}
	@FindBy(xpath = "(//a[contains(text(),'Gift Cards')])[1]")
	public WebElement giftcardbutton;
	public void giftcardButton() {
		giftcardbutton.click();
	}
	@FindBy(xpath = "//a[text()='Register']")
	public WebElement registerbutton;
	public void registerButton() {
		registerbutton.click();
	}
	@FindBy(xpath = "//span[text()='Shopping cart']")
	public WebElement cartbutton;
	public void cartButton() {
		cartbutton.click();
	}
	@FindBy(xpath = "//span[text()='Wishlist']")
	public WebElement wishlistbutton;
	public void wishlistButton() {
		wishlistbutton.click();
	}
	@FindBy(id = "small-searchterms")
	public WebElement searchfield;
	public void searchField(String searchengine) {
		searchfield.sendKeys(searchengine);
	}
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement searchbutton;
	public void searchButton() {
		searchbutton.click();
	}
	@FindBy(xpath = "//a[text()='Log in']")
	public WebElement logbutton;
	
	public void LogButton() {
		logbutton.click();
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
