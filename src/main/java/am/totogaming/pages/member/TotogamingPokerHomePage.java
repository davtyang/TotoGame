package am.totogaming.pages.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TotogamingPokerHomePage extends TotogamingMemberHomePage {

	public TotogamingPokerHomePage(WebDriver driver) {
		super(driver);
	}

	public static final String POKER_TITLE_PROMOTIONS_XPATH = "//h2[@class='gg_title'][contains(.,'Promotions')]";
	public static final String POKER_TITLE_FEATURES_XPATH = "//h2[@class='gg_title'][contains(.,'Features')]";

	@FindBy(xpath = POKER_TITLE_PROMOTIONS_XPATH)
	WebElement pokerTitlePromotions;

	@FindBy(xpath = POKER_TITLE_FEATURES_XPATH)
	WebElement pokerTitleFeatures;

	public void verifyPokerTitlePromotionsDisplayed() {
		Assert.assertTrue(pokerTitlePromotions.isDisplayed());

	}

	public void verifyPokerTitleFeaturesDisplayed() {
		Assert.assertTrue(pokerTitleFeatures.isDisplayed());

	}
}
