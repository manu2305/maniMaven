package com.DemoWorkShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSElement {
	public DWSElement(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	@FindBy(className = "header-logo")
	public WebElement icon;
	@FindBy(className = "ico-register")
	public WebElement registerButton;
	@FindBy(className = "ico-login")
	public WebElement logInLink;
	@FindBy(className = "ico-logout")
	public WebElement logOutLink;
	public void loginClick() {
		logInLink.click();
	}
	@FindBy(xpath = "(//a[@class='ico-cart'])[1]")
	public WebElement shoppingCart;
	@FindBy(xpath = "(//a[@class='ico-wishlist'])[1]")
	public WebElement whishlist;
	@FindBy(xpath = "//input[@id='Email']")
	public WebElement emailTextField;
	@FindBy(xpath = "//input[@id='Password']")
	public WebElement passwordTextField;
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	public WebElement logInButton;
}
