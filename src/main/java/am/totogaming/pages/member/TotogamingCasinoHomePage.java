package am.totogaming.pages.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import am.totogaming.pages.home.TotogamingHomePage;

public class TotogamingCasinoHomePage extends TotogamingMemberHomePage {

	public TotogamingCasinoHomePage(WebDriver driver) {
		super(driver);
	}

	public static final String CASINO_GAME_MENU_XPATH = "//div[@class='game_menu flex']";
	public static final String CASINO_GAME_SEARCH_XPATH = "//div[@class='game_search_cont flex']";

	@FindBy(xpath = CASINO_GAME_MENU_XPATH)
	WebElement casinoGameMenu;

	@FindBy(xpath = CASINO_GAME_SEARCH_XPATH)
	WebElement casinoGameSearch;

	public void verifyCasinoGameMenu() {
		Assert.assertTrue(casinoGameMenu.isDisplayed());
	}

	public void verifyCasinoGameSearch() {
		Assert.assertTrue(casinoGameSearch.isDisplayed());

	}
}