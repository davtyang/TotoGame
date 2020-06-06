package am.totogaming.pages.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TotogamingRocketonHomePage extends TotogamingMemberHomePage {

	public TotogamingRocketonHomePage(WebDriver driver) {
		super(driver);
	}

	public static final String ROCKETON_DESKTOP_GAMETYPE_XPATH = "//div[@class='desktop_GameType__3PaZ2']";
	public static final String ROCKETON_DESKTOP_LOBBYASIDE_XPATH = "//div[@class='desktop_LobbyAside__3gclx '] ";

	@FindBy(xpath = ROCKETON_DESKTOP_GAMETYPE_XPATH)
	WebElement rocketonDesktopGametype;

	@FindBy(xpath = ROCKETON_DESKTOP_LOBBYASIDE_XPATH)
	WebElement rocketonDesktopLobbyaside;

	public void verifyRocketonDesktopGametypeDisplayed() {
		Assert.assertTrue(rocketonDesktopGametype.isDisplayed());
	}

	public void verifyRocketonDesktopLobbeasideDisplayed() {
		Assert.assertTrue(rocketonDesktopLobbyaside.isDisplayed());
	}
}