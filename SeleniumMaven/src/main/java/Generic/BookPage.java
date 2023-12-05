package Generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {
	public BookPage(WebElement driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "products-orderby")
	public WebElement positiondropdown;
	
	@FindBy(id = "products-pagesize")
	public WebElement displaydropdownElement;
	
	@FindBy(id = "products-viewmode")
	public WebElement viewdropdown;
}
