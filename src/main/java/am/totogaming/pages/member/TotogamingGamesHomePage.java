package am.totogaming.pages.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TotogamingGamesHomePage extends TotogamingMemberHomePage {

	public TotogamingGamesHomePage(WebDriver driver) {
		super(driver);
	}

	public static final String GAMES_MAIN_CONTAINER_XPATH = "//div[@class='main-container']";
	public static final String GAMES_PANEL_XPATH = "//div[@class='panel panel-backgammon']";
	
	@FindBy(xpath = GAMES_MAIN_CONTAINER_XPATH)
	WebElement gamesMainContainer;
	
	@FindBy(xpath = GAMES_PANEL_XPATH)
	WebElement gamesPanel;
	
	public void verifyGamesMainContainerDisplayed() {
		Assert.assertTrue(gamesMainContainer.isDisplayed());
	}
	
	public void verifyGamesPanelDisplayed() {
		Assert.assertTrue(gamesPanel.isDisplayed());

	}
	
}
