package starter.stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import pages.MenuListPage;
import pages.TopRatedShowsPage;


@RunWith(SerenityRunner.class)
public class SearchMovie {
	
	@Steps
	MenuListPage menu;
	
	@Steps
	TopRatedShowsPage topshows;
	
	@Given("Navigate to IMDB and click menu title")
	public void navigate_to_imdb_and_click_menu_title() {
		menu.openurl();
		menu.click_menu_button();;
	    
	}

	@When("user is on menu page, click TV Shows Category and check Top rated shows option")
	public void user_is_on_menu_page() {
	    topshows.check_menu_list_page();
	}

	@When("user is on Top rated shows page")
	public void user_is_on_Top_rated_page() {
		topshows.check_top_rated_shows_page();
		}

	@When("user select Game of Thrones last watch from the list")
	public void enter_game_of_thrones_in_search_box() {
		topshows.search_tv_shows();
	}

	@Then("Last Watch page should be retrieved")
	public void last_watch_page_should_be_retrieved() {
	  topshows.check_search_result_page_assertions();
	}

}
