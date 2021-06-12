package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class IMDB_Top_Rated_Shows_list extends PageObject {
	
	// Top Rated TV Shows link Web element property
	String url = "/chart/toptv/?ref_=nv_tvv_250";
	@FindBy(xpath = "//ul[@role='menu']//a[@href='+url+']]")
	WebElement topratedshowslink;

	// Top Rated TV Shows search result page header Web element property
	@FindBy(xpath = "//*[@id='main']/div/span/div/div/h1")
	WebElement tvshowsheader;

	// Suggestion search text box Web element property
	@FindBy(id = "suggestion-search")
	WebElementFacade search;

	//Game of Throne result page header Web element property
	@FindBy(xpath = "//*[@id='__next']/main/div/section[1]/section/div[3]/section/section/div[1]/div[1]/h1")
	WebElementFacade searchresultheader;
	
	//Game of Throne result page user review count Web element property
	@FindBy(xpath = "/ul[@role='presentation')]/li[1]/a/span[contains(@class='less-than-three-Elements')]/span[1]")
	WebElementFacade userreview;
	
	//Game of Throne result page user review count Web element property
	@FindBy(xpath = "/ul[@role='presentation')]/li[2]/a/span[contains(@class='less-than-three-Elements')]/span[1]")
	WebElementFacade criticsreview;
	
	//Game of Throne rating Web element property
	@FindBy(xpath = "//span[contains(@class, 'AggregateRatingButton__RatingScore-sc-1il8omz-1 fhMjqK')]")
	WebElementFacade rating;

	// Method to verify menu page is displayed and select Top rated shows list 
	public void click_toprated_tvshows_link() {		
		if (topratedshowslink.isDisplayed()) {
			topratedshowslink.click();
		}
	}
	
	// Method to verify Top Rated Shows search page is displayed
	public void verify_tv_shows_search_result_page_display() {
		if (tvshowsheader.isDisplayed()) {
			System.out.println("Top rated TV shows page is displayed");
		}
	}
	
	// Method to query dynamic search list and return Game of Thrones TV show
	public void enter_tvshow_name_in_search() {
		search.click();
		search.sendKeys("Game of Thrones");
		System.out.println("Search field is displayed and able to enter search text");
	
	}
    
	public void click_expected_tvshow_list_option() {
		List<WebElement> searchlist = 	getDriver().findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='_26kHO_8bFBduUIYADnVHFY searchResults__ResultTextItem-sc-1pmqwbq-2 hzkacB']"));
		System.out.println("Total number of items displayed in search list:"+ searchlist.size());
		for(int i =0; i <searchlist.size(); i++) {
			System.out.println(searchlist.get(i).getText());
			if(searchlist.get(i).getText().contains("Game of Thrones: The Last Watch")) {
				searchlist.get(i).click();
				break;
			}
					
		}
		
	}
	// Method to assert Game of Thrones TV show video page header
	public String searchresult_title_Isvisible() {
		waitForCondition().until(ExpectedConditions.textToBePresentInElement(searchresultheader, "Game of Thrones: The  Watch"));
		return searchresultheader.getText();
	}
	
	// Method to assert Game of Thrones TV show video rating
	public String rating_field_Isvisible() {
		waitForCondition().until(ExpectedConditions.textToBePresentInElement(rating, "7.5"));
		return rating.getText();
	}
	
	// Method to assert Game of Thrones TV show video rating
	public String review_field_Isvisible() {
		String userreviews = userreview.getText();
		String criticsreviews = criticsreview.getText();
		String final_review = userreviews + "User reviews" + criticsreviews + "Critic reviews";
		return final_review;
	}
}
//	public  String printuserreviewcount(String locator) {
//		
//		int count =1;
//		while (count <=10) {
//			System.out.println(count + "sec");
//			if(count== 11) break;
//			List<WebElement> list = getDriver().findElements(By.xpath(locator));
//			for (WebElement e:list) {
//				return e.getText();
//			}
//			count++;
//			
//		}
//		
//	}
//}
