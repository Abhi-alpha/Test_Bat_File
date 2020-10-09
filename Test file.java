package pageObjects;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.*;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.listener.Reporter;

import accessibility.function.AxeLib;

import base.BaseUtil;

import stepDefinition.GenericFunctions;
import stepDefinition.ScreenShotTaken;
import stepDefinition.SelfRegister_SD;

import stepDefinition.SmokeTest;

public class RegisterOrganization {
	WebDriver driver;
	private BaseUtil base;
	GenericFunctions GENERIC;
	SigningINandOUT_PO LOGIN;
	TermsandCondition TC;
	MyAccount MA;
	SelfRegister_SD SR;
	RegisterOrganization RO;
	testrundata tdata;
	UserHome_PO userHome;
	public static String counter ;
    Properties p=new Properties();
	ScreenShotTaken SCREENSHOT = new ScreenShotTaken(base);
    static String username;
	static int count;
	
	public RegisterOrganization(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	ing="//input[@id='redeemCode']")
    public WBookBtn;
	
	@FindBy(how=How.XPATH,using="//div[text()='My Account']")
    public WebElement myAccountLabelCES;
					
					
	public void Registeranorganization() 
	{
		try 
		{
			GENERIC=new GenericFunctions(driver);
			LOGIN=new SigningINandOUT_PO(driver);
			Thread.sleep(15000);
			GENERIC.waitForthePageToLoad(driver);
		    Thread.sleep(5000);
			GENERIC.clickByWebElement(LOGIN.MODAL_LEARN_MORE);
			Random rand= new   Random();
			int rand_int1 = rand.nextInt(1000);
			
			if(LOGIN.REGISTER_ORGANIZATION.isDisplayed())
			{	
				GENERIC.clickByWebElement(LOGIN.REGISTER_ORGANIZATION);
				Thread.sleep(10000);
				SCREENSHOT.getscreenshot(driver);
				GENERIC.clickByWebElement(LOGIN.REGISTER_ORGANIZATION);
				Thread.sleep(5000);
				SCREENSHOT.getscreenshot(driver);
				ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
										
			    driver.switchTo().window(tabs.get(1));
			    Thread.sleep(30000);
			    
				GENERIC.enterTextByWebElement(RO_THE_FULL_NAME_OF_ORGANIZATION,"AlphaTesting"+rand_int1);
				GENERIC.clickByWebElement(RO_COUNTRY);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",INDIA);
				GENERIC.clickByWebElement(INDIA);
				GENERIC.enterTextByWebElement(RO_PRIMARY_EMAIL,"Alpha@mailinator.com");
				GENERIC.clickByWebElement(RO_CONTINUE);
			
				GENERIC.clickByWebElement(RO_REGISTER_THE_ORGANIZATION);
				Thread.sleep(30000);
				String Organisation_added=RO_PANEL_HEADING.getText();
				System.out.print(Organisation_added                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                );
				Assert.assertTrue("the organization is creadted",
				RO_PANEL_HEADING.getText().equalsIgnoreCase("Organization added"));
				GENERIC.writeDateinPropertyFile("Organization","Organization1","AlphaTesting"+rand_int1);
				GENERIC.clickByWebElement(RO_CONTINUE_CONTINUE);
				Thread.sleep(5000);
				SCREENSHOT.getscreenshot(driver);
			}
			else
			{
				
				GENERIC.clickByWebElement(LOGIN.MODAL_LEARN_MORE_FIRST);
				GENERIC.clickByWebElement(LOGIN.CAROUSEL_SLIDE_NEXT_BUTTON);
				GENERIC.clickByWebElement(LOGIN.CAROUSEL_SLIDE_REGISTER_TO_GET_STARTED);
				Thread.sleep(5000);
				GENERIC.clickByWebElement(TC_CHECK_BOX_TERMS_AND_CONDITIONS);
				Thread.sleep(2000);
				GENERIC.clickByWebElement(TC_UPDATE_MY_ACCOUNT);
				Thread.sleep(2000);
				GENERIC.clickByWebElement(TC_GET_STARTED);
				Thread.sleep(2000);
				ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs.get(1));
			    Thread.sleep(2000);
				GENERIC.enterTextByWebElement(RO_THE_FULL_NAME_OF_ORGANIZATION, "AlphaTesting"+rand_int1);
				GENERIC.clickByWebElement(RO_COUNTRY);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",INDIA);
				GENERIC.clickByWebElement(INDIA);
				GENERIC.enterTextByWebElement(RO_PRIMARY_EMAIL, "Alpha@mailinator.com");
				GENERIC.clickByWebElement(RO_CONTINUE);
				GENERIC.clickByWebElement(RO_REGISTER_THE_ORGANIZATION);
				Thread.sleep(5000);
				Assert.assertTrue("the organization is creadted",
				RO_PANEL_HEADING.getText().equalsIgnoreCase("Organization added"));
				GENERIC.writeDateinPropertyFile("Organization","Organization1","AlphaTesting"+rand_int1);
				GENERIC.clickByWebElement(RO_CONTINUE_CONTINUE);
				Thread.sleep(5000);
				SCREENSHOT.getscreenshot(driver);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	
}
