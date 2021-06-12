package pages;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;


public class IMBD_Create_Account extends PageObject {

	// Signin Web element property
	@FindBy(xpath = "//*[@id='imdbHeader']/div[2]/div[5]/a/div")
	WebElement signin;

	// create new account Web element property
	@FindBy(xpath = "//*[@id='signin-options']/div/div[2]/a")
	WebElement createnewaccountbt;

	// username Web element property
	@FindBy(id = "ap_customer_name")
	WebElement username;

	// email Web element property
	@FindBy(id = "ap_email")
	WebElement emailtxt;

	// password Web element property
	@FindBy(id = "ap_password")
	WebElement passwordtxt;

	// reenter password Web element property
	@FindBy(id = "ap_password_check")
	WebElement passwordcheck;
	
	// create imdb account button Web element property
	@FindBy(id = "continue")
	WebElement createaccountbt;

	public void click_sign_in() {
		if (signin.isDisplayed()) {
			signin.click();
		}
	}

	public boolean get_create_account_Page_title() {
		boolean title = getDriver().getTitle() == "Sign In with IMDb";
		return title;
	}
	
	public void click_new_create_account_bt() {
		if (createnewaccountbt.isDisplayed()) {
			createnewaccountbt.click();
		}
	}

	public boolean get_account_registration_Page_title() {
		boolean title = getDriver().getTitle() == "IMDb Registration";
		return title;
	}

	public void user_account_details_entry(String name, String email, String password, String reenterpassword) {
		username.click();
		username.sendKeys(name);
		emailtxt.click();
		emailtxt.sendKeys(email);
		passwordtxt.click();
		passwordtxt.sendKeys(password);
		passwordcheck.click();
		passwordcheck.sendKeys(reenterpassword);

		}
	

	public void click_register_account() {
			if(createaccountbt.isDisplayed()){
				createaccountbt.click();	
			}
	}
		
}
