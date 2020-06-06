package am.totogaming.pages.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TotogamingGoldenkenoHomePage extends TotogamingMemberHomePage {

	public TotogamingGoldenkenoHomePage(WebDriver driver) {
		super(driver);
	}

	public static final String GOLDENKENO_HEADER_GAMES_XPATH = "//div[@id='games-form-header']";
	public static final String GOLDENKENO_CONTAINER_GAMES_XPATH = "//div[@id='games-container']";

	@FindBy(xpath = GOLDENKENO_HEADER_GAMES_XPATH)
	WebElement goldenkenoHeaderGames;
	

	@FindBy(xpath = GOLDENKENO_CONTAINER_GAMES_XPATH)
	WebElement goldenkenoContainerGames;
	
	public void verifyGoldenkenoHeaderGamesDisplayed() {
		Assert.assertTrue(goldenkenoHeaderGames.isDisplayed());
	}
	
	public void verifyGoldenkenoContainerGamesDisplayed() {
		Assert.assertTrue(goldenkenoContainerGames.isDisplayed());
	}
}
