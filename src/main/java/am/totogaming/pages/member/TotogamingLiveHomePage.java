package am.totogaming.pages.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TotogamingLiveHomePage extends TotogamingMemberHomePage {

	public TotogamingLiveHomePage(WebDriver driver) {
		super(driver);

	}

	public static final String LIVE_INFO_XPATH = "//div[@class='selector_panel tg--flex displayFlex tg--3-tab tg--text-tab tg-100'][contains(.,'Live InfoLive TVTV Games')]";
	public static final String LIVE_EVENT_COUNT_XPATH = "//div[@class='tab_selector tab_selector_active']/span[@id='liveEventCount']";

	@FindBy(xpath = LIVE_INFO_XPATH)
	WebElement liveInfo;

	@FindBy(xpath = LIVE_EVENT_COUNT_XPATH)
	WebElement liveEventCount;

	public void verifyLiveInfoDisplayed() {
		Assert.assertTrue(liveInfo.isDisplayed());

	}

	public void verifyEventCountDisplayed() {
		Assert.assertTrue(liveEventCount.isDisplayed());

	}

}