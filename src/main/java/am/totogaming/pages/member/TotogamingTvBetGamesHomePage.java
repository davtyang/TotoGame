package am.totogaming.pages.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TotogamingTvBetGamesHomePage extends TotogamingMemberHomePage {

	public TotogamingTvBetGamesHomePage(WebDriver driver) {
		super(driver);
	}

	public static final String TVBET_HEADER_MENU_XPATH = "//div[@class='tvbet-header__menu']";
	public static final String TVBET_HEADER_LINKS_XPATH = "//div[@class='tvbet-header__links']";

	@FindBy(xpath = TVBET_HEADER_MENU_XPATH)
	WebElement tvBETHeaderMenu;

	@FindBy(xpath = TVBET_HEADER_LINKS_XPATH)
	WebElement tvBETHeaderLinks;

	public void verifyTvBetHeaderMenuDisplayed() {
		Assert.assertTrue(tvBETHeaderMenu.isDisplayed());

	}

	public void verifyTvBetHeaderLinksDisplayed() {
		Assert.assertTrue(tvBETHeaderLinks.isDisplayed());

	}
}
