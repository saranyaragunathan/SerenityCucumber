package pages;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;

public class captchascreenPage  {
	
	IMDB_Captcha_Screen captchapage;
	
	@Step
	public void check_captcha_page_title() {
		captchapage.get_captcha_screen_title();
		Assert.assertTrue(captchapage.get_captcha_screen_title());
	}

}
