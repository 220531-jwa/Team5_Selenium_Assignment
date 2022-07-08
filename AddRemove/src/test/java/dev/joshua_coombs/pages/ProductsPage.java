package dev.joshua_coombs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	private WebDriver realHumanBeing;
	
	public ProductsPage(WebDriver realHumanBeing) {
		this.realHumanBeing = realHumanBeing;
		PageFactory.initElements(realHumanBeing, this);
	}
	
	@FindBy(id = "react-burger-menu-btn")
	public WebElement options;
	
	@FindBy(id = "reset_sidebar_link")
	public WebElement resetAppState;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	public WebElement backpackAddButton;
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	public WebElement bikeLightAddButton;
	
	@FindBy(id = "remove-sauce-labs-backpack")
	public WebElement backpackRemoveButton;
	
	@FindBy(id = "remove-sauce-labs-bike-light")
	public WebElement bikeLightRemoveButton;
}
