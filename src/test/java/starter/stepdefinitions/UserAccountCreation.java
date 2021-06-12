package starter.stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import pages.captchascreenPage;
import pages.createaccountPage;

@UseTestDataFrom("testdata/accountinfo.csv")
@RunWith(SerenityParameterizedRunner.class)
public class UserAccountCreation {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReenterpassword() {
		return reenterpassword;
	}

	public void setReenterpassword(String reenterpassword) {
		this.reenterpassword = reenterpassword;
	}

	public createaccountPage getAccountcreation() {
		return accountcreation;
	}

	public void setAccountcreation(createaccountPage accountcreation) {
		this.accountcreation = accountcreation;
	}

	public captchascreenPage getCaptcha() {
		return captcha;
	}

	public void setCaptcha(captchascreenPage captcha) {
		this.captcha = captcha;
	}

	private String name;
	private String email;
	private String password;
	private String reenterpassword;
	
	@Steps
	createaccountPage accountcreation;
	
	@Steps
	captchascreenPage captcha;
	
	@Given("Navigate to IMDB and click Signin button")
	public void navigate_to_imdb_and_click_Signin() {
		accountcreation.openurl();
		accountcreation.click_Signin();
    	}

	@When("user is on sign in page click Create account button")
	public void user_is_on_signin_page() {
		accountcreation.check_create_account_page_title();
		accountcreation.click_create_account_bt();
	 	}

	@When("user is on create account page, enter (.*),(.*),(.*),(.*)")
	public void user_is_on_create_account_page(String name, String email, String password, String reenterpassword) throws Throwable{
		accountcreation.enter_user_account(name, email, password, reenterpassword);
		
		}

	@When("click create account")
	public void click_create_account() {
	
	}

	@Then("verify the captcha screen")
	public void verify_captcha_screen() {

	}

}
