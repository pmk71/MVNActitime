package com.actitime.pom;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class TaskList {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewButton;

	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomer;

	@FindBy(xpath="//input[@placeholder='Enter Customer Name'and @class]")
	private WebElement enterCustomerNameTbx;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescriptiontbx;

	@FindBy(xpath="//span[@class='customerSelectorPlaceholder selectorWithPlaceholderContainer']")
	private WebElement selectCustomer;

	@FindBy(xpath="//div[text()='Big Bang Company'and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompany;

	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomer;

	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustomerName;

	@FindBy(xpath="//input[@placeholder='Start typing name ...']")
	private WebElement customerProductSearchbox;

	@FindBy(xpath="//span[@class='highlightToken']")
	private WebElement firstCustemerinserachBox;

	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='editButton']")
	private WebElement editcustomerOrProject;

	@FindBy(xpath="//div[@class='editCustomerPanelHeader']//div[@class='action'][normalize-space()='ACTIONS']")
	private WebElement actionsButton;

	@FindBy(xpath = "//div[@class='taskManagement_customerPanel']//div[@class='title'][text()='Delete']")
	private WebElement deleteButton;
	
	@FindBy(xpath="//div[@class='content_customerPanel']//div[@class='operationConfirmDialog']//div[@class='buttonsContainer']")
	private WebElement deletePermanentlyBtn;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement newProjectBtn;
	
	@FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement projectNameTxf;
	
	@FindBy(xpath="//div[@class='comboboxButton focused']//input[@type='text']")
	private WebElement customertbx;
	
	@FindBy(xpath="//div[contains(text(),'Create Project')]")
	private WebElement createProjectbtn;
	
	

	public TaskList(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewButton() {
		return addNewButton;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	public WebElement getEnterCustomerNameTbx() {
		return enterCustomerNameTbx;
	}

	public WebElement getEnterCustomerDescriptiontbx() {
		return enterCustomerDescriptiontbx;
	}

	public WebElement getSelectCustomer() {
		return selectCustomer;
	}

	public WebElement getBigBangCompany() {
		return bigBangCompany;
	}

	public WebElement getCreateCustomer() {
		return createCustomer;
	}

	public WebElement getActualCustomerName() {
		return actualCustomerName;
		
	}

	public WebElement getCustomerProductSearchbox() {
		return customerProductSearchbox;
	}

	public WebElement getFirstCustemerinserachBox() {
		return firstCustemerinserachBox;
	}

	public WebElement getEditcustomerOrProject() {
		return editcustomerOrProject;
	}

	public WebElement getActionsButton() {
		return actionsButton;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getDeletePermanentlyBtn() {
		return deletePermanentlyBtn;
	}

	public WebElement getNewProjectBtn() {
		return newProjectBtn;
	}

	public WebElement getProjectNameTxf() {
		return projectNameTxf;
	}

	public WebElement getCustomertbx() {
		return customertbx;
	}

	public WebElement getCreateProjectbtn() {
		return createProjectbtn;
	}


	}






