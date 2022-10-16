package com.ahoy.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import com.ahoy.qa.base.BasePage;
import com.ahoy.qa.page.WomenPage;
import com.ahoy.qa.utility.Constants;
import com.ahoy.qa.utility.Report;
import com.relevantcodes.extentreports.LogStatus;
public class Womenpagetest extends BasePage {

	Womenpagetest womentest;

	Report report = new Report();

	WomenPage womenPage;
	public Womenpagetest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		Initialization();
		womentest = new Womenpagetest();
		womenPage = new WomenPage(driver);
		
	}
   

	@Test
	public void verifyThatCheckOutItemsWorkFine() throws InterruptedException
	{
		report.addLog(LogStatus.INFO, "Open browser test is initiated");
		String title = womenPage.getwebpageTitle();
		Assert.assertEquals(title, "Demo Site");
		report.addLog(LogStatus.INFO, "Click on Women menu item");
		
	 	driver
	 	.manage()
	 	.timeouts()
	 	.implicitlyWait(Duration.ofSeconds(Constants.DEFAULT_TIMEOUT));
	 	
	 	driver.switchTo().frame("iframe");
		
	 	womenPage.clickOnWomenHyperLink();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.DEFAULT_TIMEOUT));
	 	report.addLog(LogStatus.PASS, "User navigates to women section");
		report.addLog(LogStatus.INFO, "Users clicks on filter by rating");
		
		womenPage.selectRating();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.DEFAULT_TIMEOUT));
	 	report.addLog(LogStatus.PASS, "Records are filtered by rating");
		report.addLog(LogStatus.INFO, "User selects product");
		
		womenPage.selectProduct();
		
		report.addLog(LogStatus.PASS, "Product is selected");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.DEFAULT_TIMEOUT));
		
		womenPage.addQuantity();
		
		report.addLog(LogStatus.INFO, "Adds product quantity");
		report.addLog(LogStatus.PASS, "Quantity is added");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.DEFAULT_TIMEOUT));
		
		womenPage.addProduct();
		
		report.addLog(LogStatus.INFO, "Taps on add product");
		report.addLog(LogStatus.PASS, "Product is added");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.DEFAULT_TIMEOUT));
		
		womenPage.viewCart();
		
		report.addLog(LogStatus.INFO, "Taps on cart icon");
		report.addLog(LogStatus.PASS, "User navigates to cart section");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.DEFAULT_TIMEOUT));
		
		womenPage.changePostalAddress();
		
		report.addLog(LogStatus.INFO, "Change Postal address");
		report.addLog(LogStatus.PASS, "User navigates to change address section");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.DEFAULT_TIMEOUT));
		
		womenPage.changeStateOfPostalAddress();
		
		report.addLog(LogStatus.INFO, "User updates state/country");
		report.addLog(LogStatus.PASS, "User changes state/country");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.DEFAULT_TIMEOUT));
		womenPage.update();
		
		report.addLog(LogStatus.INFO, "User clicks on update button");
		report.addLog(LogStatus.PASS, "User updates changes successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.DEFAULT_TIMEOUT));
	 	
		report.compilereport();
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}



}
