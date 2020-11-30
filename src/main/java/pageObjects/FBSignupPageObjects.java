package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class FBSignupPageObjects extends Base{
	
	public FBSignupPageObjects(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='firstname']")
	private WebElement FirstName;
	
	@FindBy(how = How.XPATH, using = "//input[@name='lastname']")
	private WebElement LastName;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div[1]/div/div[1]/form/div[1]/div[2]/div/div[1]/input")
	private WebElement Email;
	
	@FindBy(how = How.ID, using = "password_step_input")
	private WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//button[@name='websubmit']")
	private WebElement clickSignup;
	
	public void enterFirstName(String firstName) {
		FirstName.clear();
		FirstName.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		LastName.clear();
		LastName.sendKeys(lastName);
	}
	
	public void enterEmailAddress(String emailAddress) {
		Email.clear();
		Email.sendKeys(emailAddress);
	}
	
	public void enterPassword(String password) {
		Password.clear();
		Password.sendKeys(password);
	}
	
	public void clickOnSignupButton() {
		clickSignup.click();
	}
	
	

}