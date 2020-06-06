package am.totogaming.pages.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TotogamingInBetGamesHomePage extends TotogamingMemberHomePage {

	public TotogamingInBetGamesHomePage(WebDriver driver) {
		super(driver);
	}

	public static final String INBET_HEADER_TITLE_XPATH = "//div[@class='header__title']";
	public static final String INBET_HEADER_BAR_XPATH = "//div[@class='header__bar']";

	@FindBy(xpath = INBET_HEADER_TITLE_XPATH)
	WebElement inBetHeaderTitle;

	@FindBy(xpath = INBET_HEADER_BAR_XPATH)
	WebElement inBetHeaderBar;

	public void verifyInbetHeaderTitleDisplayed() {
		Assert.assertTrue(inBetHeaderTitle.isDisplayed());
	}

	public void verifyInbetHeaderBarDisplayed() {
		Assert.assertTrue(inBetHeaderBar.isDisplayed());

	}

}
