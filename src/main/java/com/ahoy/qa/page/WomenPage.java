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

		try 
		{
			if (women.isDisplayed())
			{
				women.click();
			}

		}catch (Exception ex)
		{
			ex.printStackTrace();
		}


	}

	public void selectRating()
	{

		try 
		{
			if (filterByRating.isDisplayed())
			{
				filterByRating.click();
			}

		}catch (Exception ex)
		{
			ex.printStackTrace();
		}


	}

	public void selectProduct()
	{
		try 
		{
			if (selectProduct.isDisplayed())
			{
				selectProduct.click();
			}

		}catch (Exception ex)
		{
			ex.printStackTrace();
		}

	}

	public void addQuantity()
	{
		try
		{
			if (quantity.isDisplayed())
			{
				quantity.sendKeys(Keys.ARROW_UP);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

	public void addProduct()
	{

		try
		{
			if (addProduct.isDisplayed())
			{
				addProduct.click();;
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}



	}

	public void viewCart()
	{
		try
		{
			if (shoppingCartIcon.isDisplayed())
			{
				shoppingCartIcon.click();
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public void changePostalAddress()
	{

		try
		{
			if (changeAddress.isDisplayed())
			{
				changeAddress.click();
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}

	}

	public void changeStateOfPostalAddress()
	{
		try
		{
			if (stateCountry.isDisplayed())
			{
				stateCountry.sendKeys("Test");
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}


	}

	public void update()
	{
		try
		{
			if (updateButton.isDisplayed())
			{
				updateButton.click();
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}

	}

	public void checkout()
	{

		try
		{
			if (proceedToCheckout.isDisplayed())
			{
				proceedToCheckout.click();	
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}

	}


}
