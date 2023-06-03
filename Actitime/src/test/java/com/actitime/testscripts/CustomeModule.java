package com.actitime.testscripts;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.TaskList;
@Listeners(com.actitime.generic.ITestListenerImplementation.class)
public class CustomeModule extends BaseClass {

	@Test
	public void testCreateCustomer() throws InterruptedException
	{

		EnterTimeTrack ett= new EnterTimeTrack(driver);
		ett.getTasksTab().click();
		TaskList ts= new TaskList(driver);
		ts.getAddNewButton().click();
		ts.getNewCustomer().click();
		String projectname = "HDFC_03";
		ts.getEnterCustomerNameTbx().sendKeys(projectname);
		ts.getEnterCustomerDescriptiontbx().sendKeys("Bank Project");
		ts.getCreateCustomer().click();
		WebElement ele = driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']/div[text()='"+projectname+"']"));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
		String atext = ts.getActualCustomerName().getText();

		Assert.assertEquals(atext,"HDFC_03");
		Assert.assertTrue(ele.isDisplayed(),"element is not displayed");

	}
	@Test
	public void testDeleteCustomer() throws InterruptedException
	{
		EnterTimeTrack ett= new EnterTimeTrack(driver);
		ett.getTasksTab().click();
		TaskList ts= new TaskList(driver);
		ts.getCustomerProductSearchbox().sendKeys("hdfc"+Keys.ENTER);
		ts.getFirstCustemerinserachBox().click();
		ts.getEditcustomerOrProject().click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(ts.getActionsButton()));

		}
		catch (Exception e) {
			// TODO: handle exception
		}
		ts.getActionsButton().click();
		ts.getDeleteButton().click();
		ts.getDeletePermanentlyBtn().click();

	}
}

