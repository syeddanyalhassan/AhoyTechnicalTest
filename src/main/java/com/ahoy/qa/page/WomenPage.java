package com.ahoy.qa.page;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ahoy.qa.base.BasePage;

public class WomenPage extends BasePage {

	@FindBy(xpath="//li[@id='menu-item-342']/a")
	WebElement women; //women

	@FindBy(xpath="//a[@href='https://modern-store.competethemes.com/product-category/women/?rating_filter=5']")
	WebElement filterByRating; 

	@FindBy(xpath="//h2[text()='Floral Crop Top']")
	WebElement selectProduct;


	@FindBy(xpath="//input[@name='quantity']")
	WebElement quantity;

	@FindBy(xpath="//button[@type='submit' and text()='Add to cart']")
	WebElement addProduct;

    @FindBy(xpath="//a[@class='shopping-cart-icon']")
	WebElement shoppingCartIcon;

	@FindBy(xpath="//a[@class='shipping-calculator-button']")
	WebElement changeAddress;

	@FindBy(xpath="//input[@placeholder='State / County']")
	WebElement stateCountry;

	@FindBy(xpath="//button[@name='calc_shipping']")
	WebElement updateButton;

	@FindBy(xpath="//a[@href='https://modern-store.competethemes.com/checkout/']")
	WebElement proceedToCheckout;

    public WomenPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getwebpageTitle()
	{
		return driver.getTitle();
	}
	
	public void clickOnWomenHyperLink()
	{
		women.click();
	}
	
	public void selectRating()
	{
		filterByRating.click();
	}
	
	public void selectProduct()
	{
		selectProduct.click();
	}
	
	public void addQuantity()
	{
		quantity.sendKeys(Keys.ARROW_UP);
	}
	
	public void addProduct()
	{
		addProduct.click();
	}
	
	public void viewCart()
	{
		shoppingCartIcon.click();
	}
	
	public void changePostalAddress()
	{
		changeAddress.click();
	}
	
	public void changeStateOfPostalAddress()
	{
		stateCountry.sendKeys("Test");
	}
	
	public void update()
	{
		updateButton.click();
	}
	
	public void checkout()
	{
		proceedToCheckout.click();	
	}

	 
}
