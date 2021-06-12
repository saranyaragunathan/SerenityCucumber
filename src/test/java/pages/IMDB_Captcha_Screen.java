package pages;

import net.serenitybdd.core.pages.PageObject;

public class IMDB_Captcha_Screen extends PageObject {
	
	public boolean get_captcha_screen_title() {
		boolean title = getDriver().getTitle() == "Authentication required";
		return title;
	}

}
