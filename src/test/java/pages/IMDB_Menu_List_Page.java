package pages;


import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class IMDB_Menu_List_Page extends PageObject {

	// Menu link Web element property
	@FindBy(xpath = "//*[@id='imdbHeader-navDrawerOpen--desktop']/div")
	WebElement menu;

	// Top Shows link Web element property
	@FindBy(xpath = "//*[@id='imdbHeader']/div[2]/aside/div/div[2]/div/div[2]/div[1]/span")
	WebElement topshows;

	// Preceding-Sibling IMDBlogo web element property
	@FindBy(xpath = "//a[contains(@id, 'home_img_holder')]/preceding-sibling::label[contains(@id, 'imdbHeader-navDrawerOpen--desktop')]")
	WebElement imdblogo;
		
	// Method to check if menu is displayed adjacent to logo
	public void check_menu_adjacent_to_logo() {
		if(imdblogo.isDisplayed()){
				System.out.println("Menu option is displayed adjacent to logo");			
		}
	}
	// Method to select menu list and verify menu list page is displayed
	public void click_menu_list()
	{
		if(menu.isDisplayed()){
			menu.click();			
	}
		
		if(topshows.isDisplayed())
		{
			System.out.println("Menu list page is displayed");
		}
		
	}

}
