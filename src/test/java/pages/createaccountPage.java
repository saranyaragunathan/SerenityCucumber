package pages;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;

public class createaccountPage {

	IMBD_Create_Account accountpage;
	
	@Step
	public void openurl() {
		accountpage.open();
	}
	
	@Step
	public void click_Signin() {
		accountpage.click_sign_in();
	}
	
	@Step
	public void check_create_account_page_title() {
		accountpage.click_sign_in();
		Assert.assertTrue(accountpage.get_create_account_Page_title());
	}
	
	@Step
	public void click_create_account_bt() {
		accountpage.click_new_create_account_bt();
			}
	
	@Step
	public void enter_user_account(String name, String email, String password, String reenterpassword) {
		accountpage.user_account_details_entry(name, email , password , reenterpassword );
			}
	
		
	@Step
	public void click_register_account_button() {
		accountpage.click_register_account();
			}
	

		
}
