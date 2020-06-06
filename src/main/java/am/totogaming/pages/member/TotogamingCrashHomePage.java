package am.totogaming.pages.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TotogamingCrashHomePage extends TotogamingMemberHomePage{

	public TotogamingCrashHomePage(WebDriver driver) {
		super(driver);
	}

	public static final String CRASH_TOP_PLAYER_HEADER_XPATH = "//div[@class='top-player-header']";
	
	@FindBy(xpath = CRASH_TOP_PLAYER_HEADER_XPATH)
	WebElement crashTopPlayerHeader;
	
	public void verifyCrashTopPlayerHeader() {
		Assert.assertTrue(crashTopPlayerHeader.isDisplayed());
	}
}
