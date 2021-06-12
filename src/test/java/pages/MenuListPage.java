package pages;

import net.thucydides.core.annotations.Step;

public class MenuListPage {
	
	IMDB_Menu_List_Page menupage;
	@Step
	public void openurl() {
		menupage.open();
		
	}
	@Step
	public void click_menu_button() {
		menupage.check_menu_adjacent_to_logo();
		menupage.click_menu_list();
	}
	
	

}
