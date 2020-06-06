package am.totogaming.pages.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TotogamingEsportsHomePage extends TotogamingMemberHomePage {

	public TotogamingEsportsHomePage(WebDriver driver) {
		super(driver);

	}

	public static final String ESPORT_BETHISTORY_XPATH = "//a[@class='esp_main_header_link esp_main_header_link_history'][contains(.,'Bet History')]";
	public static final String ESPORT_MAIN_HEADER_XPATH = "//div[@class='esp_main_header']";

	@FindBy(xpath = ESPORT_BETHISTORY_XPATH)
	WebElement esportsBetHistory;

	@FindBy(xpath = ESPORT_MAIN_HEADER_XPATH)
	WebElement esportsMainHeader;

	public void verifyBetHistoryDisplayed() {
		Assert.assertTrue(esportsBetHistory.isDisplayed());
	}

	public void verifyMainHeaderDisplayed() {
		Assert.assertTrue(esportsMainHeader.isDisplayed());
	}
}