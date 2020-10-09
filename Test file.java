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
	
	@FindBy(how=How.XPATH,using = "//a[@aria-label='Enter access code']")
	public WebElement enterAccessCodeBtn ;
	
	@FindBy(xpath = "//input[@id='name']")
	public WebElement RO_THE_FULL_NAME_OF_ORGANIZATION;

	@FindBy(xpath = "//select[@id='countryCode']")
	public WebElement RO_COUNTRY;

	@FindBy(xpath = "//input[@id='primaryEmail']")
	public WebElement RO_PRIMARY_EMAIL;

	@FindBy(xpath = "(//button[@aria-label='Continue'])[2]")
	public WebElement RO_CONTINUE;

	@FindBy(xpath = "//button[@aria-label='Register the Organization']")
	public WebElement RO_REGISTER_THE_ORGANIZATION;

	@FindBy(xpath = "//div[@id='panelHeading']")
	public WebElement RO_PANEL_HEADING;

	@FindBy(xpath = "(//button[@aria-label='Continue'])[2]")
	public WebElement RO_CONTINUE_CONTINUE;

	@FindBy(xpath = "//h1[contains(text(),'Register an organization')]")
	public WebElement REGISTER_AN_ORGANIZATION;
	
	@FindBy(xpath = "//option[@value='IN']")
	public WebElement INDIA;
	
	@FindBy(xpath = "//div[@class='switch-item']")
	public WebElement DROP_DOWN;
	
	@FindBy(xpath = "//div[@class='ces-list-group']/div")
	public WebElement FIRST_CREATED_PROJECT;

	@FindBy(xpath = "(//a[@id='register-button'])[1]")
	public WebElement REGISTER_USER;
	
	@FindBy(xpath = "//a[@id='signIn']")
	public WebElement SIGN_IN_USER_CES;
	
	@FindBy(xpath = "//*[@id='searchResults-table']//tbody/tr/td[1]//a ")
	public WebElement PROJECT_ICON;

	@FindBy(xpath = "//button[@id='tabButton2']")
	public WebElement STUDENT_LEARNING_MATERIAL;

	@FindBy(xpath = "//a[@aria-label='Add learning material']")
	public WebElement ADD_LEARNING_MATERIAL;

	@FindBy(xpath = "//input[@id='selectionSearchTerm-input']")
	public WebElement SEARCHED_BOOK_IN_STUDENT;

	@FindBy(xpath = "//ol[@id='assignmentResultList']//div/button")
	public WebElement SEARCHED_BOOK_IN_STUDENT_LICENCE;

	@FindBy(xpath = "//button[@title='Click to open book']/span")
	public WebElement CLICK_TO_OPEN_BOOK;

	@FindBy(xpath = "//a[contains(text(),'Open')]")
	public WebElement VIEW_BOOK;
	
	@FindBy(xpath = "//a[contains(text(),'Code')]")
	public WebElement VIEW_BOOK_2;

	@FindBy(xpath = "//button[contains(text(),'Close')]")
	public WebElement CLOSE;

	@FindBy(xpath = "//div[@class='ces-list-group']/div")
	public WebElement OLB_TO_CES;

	@FindBy(xpath = "//button[@id='navHeader-accountWidget']")
	public WebElement ACCOUNT_WIDGET;

	@FindBy(xpath = "//*[@id='accountWidget-myOrg']/div/div[2]/div/div[3]")
	public WebElement USER_ROLE;

	@FindBy(xpath = "//*[@id='accountWidget-myOrg']/div/div[2]/div/div[3]")
	public WebElement Sign_Out;
	
	@FindBy(xpath = "//a[contains(text(),'Sign out')]")
	public WebElement Sign_Out_from_olb;

	@FindBy(xpath = "//button[@id='cookieBannerClose']")
	public WebElement Continue1;

	@FindBy(xpath = "//select[@id='accountWidget-switchOrg']")
	public WebElement change_org;

	@FindBy(xpath = "//option[contains(text(),'AlphaBetaTest')]")
	public WebElement Org;
	
	
	@FindBy(xpath = "(//div[@class='olb-book-hover-overlay'])[7]")
	public WebElement HOVER_BOOK;	
	
	@FindBy(xpath = "(//div[@class='olb-book-hover-overlay'])[7]")
	public WebElement HOVER_BOOK_english;	
	
	@FindBy(xpath = "(//span[@class='olb-book-overlay-icon olb-book-open'])[9]")
	public WebElement HOVER_BOOK_SOLUTION_SECOND;
	
	@FindBy(xpath = "(//span[@class='olb-book-overlay-icon olb-book-open'])[27]")
	public WebElement HOVER_BOOK_SOLUTION_SECOND_BOOK;
	
	@FindBy(xpath = "(//span[@class='olb-book-overlay-icon olb-book-open'])[10]")
	public WebElement HOVER_BOOK_LEONARDO;		
			
	@FindBy(xpath = "(//button[@data-book-id='CPTEX1'])[2]")
	public WebElement HOVER_cpt;
			
	@FindBy(xpath = "(//div[@class='olb-book-hover-overlay'])[7]")
	public WebElement HOVER_BOOK_1;
	
	@FindBy(xpath = "//div[@data-book-title='Aladdin and the Enchanted Lamp (Bookworms Stage 1)']")
	public WebElement alladinBookCEFRA2B1;
	
	@FindBy(xpath = "(//div[@class='olb-book-hover-overlay'])[25]")
	public WebElement HOVER_BOOK_leo_whencollection;
	
	@FindBy(xpath = "(//div[@class='olb-book-hover-overlay'])[49]")
	public WebElement HOVER_BOOK_whencollection;
	
	@FindBy(xpath = "(//button[@id='OUPB16AE'])[3]")
	public WebElement HOVER_BOOK_leo_aladdin;
	
	@FindBy(xpath = "(//div[@data-book-title='Aladdin and the Enchanted Lamp (Bookworms Stage 1)'])[2]")
	public WebElement HOVER_BOOK_aladdin;
	
	@FindBy(xpath = "(//div[@class='olb-book-hover-overlay'])[9]")
	public WebElement HOVER_BOOK_clunkinspace;
	
	@FindBy(xpath = "(//div[@class='olb-book-hover-overlay'])[27]")
	public WebElement HOVER_BOOK_clunkinspace2;
	
	@FindBy(xpath = "//*[@id='searchResults']/table/tbody/tr/td[1]/div/div[2]/article/div[2]/div/div/span/button")
	public WebElement CLICK_SEARCHED_STUDENT;	
	
	@FindBy(how=How.XPATH,using="//input[@type='checkbox']")
	public WebElement TC_CHECK_BOX_TERMS_AND_CONDITIONS;
	
	@FindBy(how=How.XPATH,using="//button[@id='registration-submit']")
	public WebElement TC_UPDATE_MY_ACCOUNT;
	
	@FindBy(how=How.XPATH,using="//button[@id='link-to-login']")
	public WebElement TC_GET_STARTED;

	@FindBy(how=How.XPATH,using="//a[@aria-label='Invite students']")
	public WebElement Invite_student;
  
	@FindBy(how=How.XPATH,using="//input[@id='firstName']")
	public WebElement send_invite_firstname;
	
	@FindBy(how=How.XPATH,using="//input[@id='lastName']")
	public WebElement send_invite_lastname;
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	public WebElement send_invite_email;
	
	@FindBy(how=How.XPATH,using="//button[@id='PopoutActionFooterPrimaryLink']")
	public WebElement send_invite_invite_student;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Classes')]")
	public WebElement classes_tab;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Create a class')]")
	public WebElement Create_class;
	
	@FindBy(how=How.XPATH,using="//input[@id='classroomName']")
	public WebElement class_name;
	
	@FindBy(how=How.XPATH,using="(//button[@title='Click for more information'])[27]")
	public WebElement information_cluninspace;		
			
	@FindBy(how=How.XPATH,using="//input[@class='_1srz']")
	public WebElement add_members; 
	
	@FindBy(how=How.XPATH,using="//button[@id='PopoutNavFooterNextButton']/span")
	public WebElement next_button; 
	
	@FindBy(how=How.XPATH,using="//button[@id='PopoutNavFooterNextButton']/span")
	public WebElement create_a_class; 
	
	@FindBy(how=How.XPATH,using="//button[@aria-label='Done']")
	public WebElement Done;
	
	@FindBy(how=How.XPATH,using="(//div[@class='col-md-12'])[3]/ul/li/span")
	public WebElement version;
	
	@FindBy(how=How.XPATH,using="(//div[@class='col-md-12'])[3]/ul/li")
	public WebElement privacy;
	
	@FindBy(how=How.XPATH,using="(//div[@class='col-md-12'])[3]/ul/li[3]")
    public WebElement t_c;

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Certificate')]")
    public WebElement Certificate;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Certificate')]")
    public WebElement downloadCertificate;
	
	@FindBy(how=How.XPATH,using="//div[@id='edit-profile-button']")
    public WebElement edit;
	
	@FindBy(how=How.XPATH,using="//input[@id='firstName']")
    public WebElement firstName;
	
	@FindBy(how=How.XPATH,using="//input[@id='lastName']")
    public WebElement lastName;
	
	@FindBy(how=How.XPATH,using="//button[@id='edit-profile-save-btn']")
    public WebElement save;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Done')]")
    public WebElement done;
	
	@FindBy(how=How.XPATH,using="//div[@id='signout-button']")
    public WebElement signout;
	
	@FindBy(how=How.XPATH,using="//a[@id='btnAddBook']")
    public WebElement add_book; 
	
	@FindBy(how=How.XPATH,using="//input[@id='redeemCode']")
    public WebElement redeemCode; 
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Add')]")
    public WebElement Add;
	
	@FindBy(how=How.XPATH,using="(//button[@class='btn btn-default btn-nav link-close'])[3]")
    public WebElement close_added_book;
	
	@FindBy(how=How.XPATH,using="//a[@class='olb-book-buy olb-book-buy-button']")
    public WebElement buy_online;
	
	@FindBy(how=How.XPATH,using="//a[@id='signIn']")
    public WebElement sign_ces;
	
	@FindBy(how=How.XPATH,using="	//input[@id='product-searchTerm-input']")
    public WebElement search_book;
	
	@FindBy(how=How.XPATH,using="	//div[@class='sS6E']")
    public WebElement clunk_in_space_book;
	 
	@FindBy(how=How.XPATH,using="//*[@id='modalContents']/div[2]/div/div/button[2]")
    public WebElement Buy_online;
	
	@FindBy(how=How.XPATH,using="//button[@title='Sign in'] ")
    public WebElement Sign_in_OLB;
	
	@FindBy(how=How.XPATH,using="//(//span[@class='olb-book-overlay-icon olb-book-open'])[9]")
    public WebElement open_book_second_solution_bbok_in_new10;

	@FindBy(how=How.XPATH,using="//input[@id='input-search-web']")
    public WebElement search_book_in_olb;
	
	@FindBy(how=How.XPATH,using="(//button[@class='btn btn-default btn-form btn-search icon-search'])[2]")
    public WebElement search;

	@FindBy(how=How.XPATH,using="(//span[@class='olb-book-overlay-icon'])[9]")
    public WebElement information_second_solution_book_in_new10;		
	
	@FindBy(how=How.XPATH,using="(//span[@class='olb-book-overlay-icon'])[27]")
    public WebElement information_second_solution_book;
	
	@FindBy(how=How.XPATH,using="(//span[@class='olb-book-overlay-icon'])[27]")
    public WebElement information_LEONARDO;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Open')]")
    public WebElement open_olb_second_solution_book;
	
	@FindBy(how=How.XPATH,using="//div[@class='prev-page-move-icon']")
    public WebElement next_page_olb_second_solution_book;
	
	@FindBy(how=How.XPATH,using="//div[@class='prev-page-move-icon']")
    public WebElement olb_second_solution_book_exercise_two;
	
	@FindBy(how=How.XPATH,using="//button[@id='PopoutActionFooterPrimaryLink']")
    public WebElement done_invitation;
	
	@FindBy(how=How.XPATH,using="(//button[@class='Kevb'])[2]")
    public WebElement class_tab;		
	
	@FindBy(how=How.XPATH,using="//a[@aria-label='Create a class']")
    public WebElement create_class;
	
	@FindBy(how=How.XPATH,using="//input[@id='classroomName']")
    public WebElement classroom_name;
	
	@FindBy(how=How.XPATH,using="//button[@aria-label='Next']")
    public WebElement Next_button;
	
	@FindBy(how=How.XPATH,using="(//div[@class='_2Are'])[1]")
    public WebElement org_admin;
	
	@FindBy(how=How.XPATH,using="//button[@class='_3_Oz _2kNg']")
    public WebElement click_create_class;
	
	@FindBy(how=How.XPATH,using="//a[@class='_3_Oz _2kNg _2zB5']")
    public WebElement import_access_code;
	
	@FindBy(how=How.XPATH,using="//input[@id='enterAccessCode']")
    public WebElement enter_access_code;
	
	@FindBy(how=How.XPATH,using="//input[@id='enterAccessCode']")
    public WebElement Add_licences;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'class_for_test')]")
    public WebElement click_class_for_test;
	
	@FindBy(how=How.XPATH,using="//div[@class='prev-page-move-icon']")
    public WebElement move_page;
	
	@FindBy(how=How.XPATH,using="//div[@id='menu-bar-memo']")
    public WebElement memo;
	
	@FindBy(how=How.XPATH,using="//a[text()='Bookshelf']")
    public WebElement bookshelf;
	
	@FindBy(how=How.XPATH,using="//div[@class='menu-bar-memo-text-btn']")
    public WebElement memo_text;
	
	@FindBy(how=How.XPATH,using="//div[@class='memo-text memo-text-content-opening']")
    public WebElement memo_text_write;
	
	@FindBy(how=How.XPATH,using="(//div[@class='audio-btn'])[1]")
    public WebElement Audio_option_one;
	
	@FindBy(how=How.XPATH,using="(//textarea)[5]")
    public WebElement jose_1;		
	
	@FindBy(how=How.XPATH,using="(//textarea)[4]")
    public WebElement agnieszka_1;	
	
	@FindBy(how=How.XPATH,using="(//textarea)[3]")
    public WebElement agnieszka_2;
	
	@FindBy(how=How.XPATH,using="(//textarea)[2]")
    public WebElement becka_1;	
		
	@FindBy(how=How.XPATH,using="//div[@class='next-page-move-icon']")
    public WebElement move_page_back;
	
	@FindBy(how=How.XPATH,using="//div[@class='media-audio-close-btn']")
    public WebElement close_media_button;
	
	@FindBy(how=How.XPATH,using="//p[text()='Save and Close']")
    public WebElement save_and_close;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Download your reading certificate (PDF)')]")
    public WebElement download_certificate;
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Save and Close')]")
    public WebElement save_close_leonardo;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Reading Diary')]")
    public WebElement Reading_diary_option;
	
	@FindBy(how=How.XPATH,using="//div[@class='olb-diary-book-wrap']")
    public WebElement latest_reading_progress;
	
	@FindBy(how=How.XPATH,using="(//div[@class='olb-diary-book-wrap'])/h5")
    public WebElement leonardo_covername;
	
	@FindBy(how=How.XPATH,using="//button[@class='olb-book-bar-btn olb-book-bar-btn-sm olb-book-hide']")
    public WebElement leonardo_hide_button;
	
	@FindBy(how=How.XPATH,using="//ul[@id='addBookError']")
    public WebElement error_message_while_generating_code;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Download a table of all your reading progress (CSV)')]")
    public WebElement CSV_option;
	
	@FindBy(how=How.XPATH,using="(//span[@class='olb-book-overlay-icon'])[60]")
    public WebElement CPT_sample_book;
	
	@FindBy(how=How.XPATH,using="(//*[@id='bookData-CPTEX1']/div[2]/button[2]/span)[2]")
    public WebElement CPT_sample_book_info;
	
	@FindBy(how=How.XPATH,using="//div[@class='menu-resources-btn']")
    public WebElement CPT_sample_book_resources;
	
	@FindBy(how=How.XPATH,using="//button[@class='_3_Oz _2kNg']")
    public WebElement download_content_in_resources;
	
	@FindBy(how=How.XPATH,using="(//div[@id='bookData-CPTEX1'])[2]/button")
    public WebElement resource_above_cpt_sample;		
	
	@FindBy(how=How.XPATH,using="//*[@id='maincontent']/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/h1")
    public WebElement resource_verification;
	
	@FindBy(how=How.XPATH,using="//div[@class='title']")
    public WebElement book_title;
	
	@FindBy(how=How.XPATH,using="//div[@class='author']")
    public WebElement book_author;
	
	@FindBy(how=How.XPATH,using="//div[@class='description']")
    public WebElement book_desc;
	
	@FindBy(how=How.XPATH,using="//div[@title='Bookmark']")
    public WebElement Bookmark;
	
	@FindBy(how=How.XPATH,using="//div[@class='book-mark']")
    public WebElement book_mark;
	
	@FindBy(how=How.XPATH,using="//div[@class='olb-diary-book-wrap']")
    public WebElement book_i_have_read;
	
	@FindBy(how=How.XPATH,using="//*[@id='read-books']/div/h5")
    public WebElement leonardo_completed_book;
	
	@FindBy(how=How.XPATH,using="//div[@id='diary-medal']/div/img")
    public WebElement leonardo_completed_book_emplty;
	
	@FindBy(how=How.XPATH,using="//div[@class='book-detail-menu']/div/div[2]/div[1]")
    public WebElement expired_book_name;
	
	@FindBy(how=How.XPATH,using="//*[@id='olb-book-content']/div[2]/div/div[2]/div[6]")
    public WebElement expire_date_leo;
	
	@FindBy(how=How.XPATH,using="//div[@class='book-detail-menu']/div/div[2]/div[2]")
    public WebElement expired_book_CEFR;
	
	@FindBy(how=How.XPATH,using="//div[@class='cefr-level']")
    public WebElement book_CEFR;
	
	@FindBy(how=How.XPATH,using="//div[@class='book-detail-menu']/div/div[2]/div[3]")
    public WebElement expired_book_author;
    
	@FindBy(how=How.XPATH,using="//div[@class='author']")
    public WebElement book_author_;
	
	@FindBy(how=How.XPATH,using="//div[@class='book-detail-menu']/div/div[2]/div[6]")
    public WebElement expired_book_date;
	
	@FindBy(how=How.XPATH,using="//div[@class='expired-date']")
    public WebElement expired_date;
	
	@FindBy(how=How.XPATH,using="//h1[text()='Oxford Readers Collections CEFR A2-B1+']")
    public WebElement firstCollection;
	
	@FindBy(how=How.XPATH,using="//h1[text()='Oxford Readers Collection – A1/A2']")
    public WebElement secondCollection;

	@FindBy(how=How.XPATH,using="//div[@class='title']")
    public WebElement book_title_;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='book-detail-menu']/div/div[3]/div")
    public WebElement expired_book_disc;
	
	@FindBy(how=How.XPATH,using="//div[@class='navbar-platform']/ul/li[@class='active']")
    public WebElement OLB_bookshelf;
	
	@FindBy(how=How.XPATH,using="//*[@id='menu-bar-right']/div[1]/img")
    public WebElement starting_of_the_book;
	
	@FindBy(how=How.XPATH,using="//span[@class='siteTitle_headings']/span")
    public WebElement online_verify;
	
	@FindBy(how=How.XPATH,using="(//div[@class='col-md-12']/h1)[3]")
    public WebElement book_added_verify;	
	
	@FindBy(how=How.XPATH,using="//div[@id='olb-book-content']/div/button")
    public WebElement my_book;
	
	@FindBy(how=How.XPATH,using="(//div[@id='menu-bar-right']/div/img)[1]")
    public WebElement page_zero;
	
	@FindBy(how=How.XPATH,using="//button[@title='Click to show books']")
    public WebElement clickToShowBookBtn;
	
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
