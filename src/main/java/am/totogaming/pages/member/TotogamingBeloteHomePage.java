package am.totogaming.pages.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TotogamingBeloteHomePage extends TotogamingMemberHomePage {

	public TotogamingBeloteHomePage(WebDriver driver) {
		super(driver);
	}

	public static final String BELOTE_HEADER_PAGE_XPATH = "//header[@class='header ng-scope']";
	public static final String BELOTE_INFO_JACKPOT_XPATH = "//div[@class='infoblock jackpot numberClass']";

	@FindBy(xpath = BELOTE_HEADER_PAGE_XPATH)
	WebElement beloteHeader;

	@FindBy(xpath = BELOTE_INFO_JACKPOT_XPATH)
	WebElement beloteInfoJackpot;

	public void verifyBeloteHeaderDisplayed() {
		Assert.assertTrue(beloteHeader.isDisplayed());
	}

	public void verifyBeloteInfoJackpotDisplayed() {
		Assert.assertTrue(beloteInfoJackpot.isDisplayed());
	}

}
