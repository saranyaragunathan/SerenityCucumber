package pages;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;

public class TopRatedShowsPage {
	
	IMDB_Top_Rated_Shows_list tvshows;
	
	@Step
	public void check_menu_list_page() {
		tvshows.click_toprated_tvshows_link();			
	}
	@Step
	public void check_top_rated_shows_page() {
		tvshows.verify_tv_shows_search_result_page_display();
	}
	@Step
	public void search_tv_shows() {
		tvshows.enter_tvshow_name_in_search();
	}
	
	@Step
	public void check_search_result_page_assertions() {
		tvshows.click_expected_tvshow_list_option();
		Assert.assertTrue(tvshows.searchresult_title_Isvisible().equals("Game of Thrones: The  Watch"));
		Assert.assertTrue(tvshows.rating_field_Isvisible().equals("7.2"));
		Assert.assertTrue(tvshows.review_field_Isvisible().equals("73 User reviews 8 Critic reviews"));
	}
}
