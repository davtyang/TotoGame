package am.totogaming.pages.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.totogaming.pages.member.TotogamingMemberHomePageConstants.*;
import am.totogaming.pages.base.TotogamingBasePageObject;
import am.totogaming.pages.home.TotogamingHomePage;
import am.totogaming.pages.livechat.TotogamingLiveChatPage;

public class TotogamingMemberHomePage extends TotogamingBasePageObject {

	public TotogamingMemberHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = SPORTS_BTN_XPATH)
	WebElement sportsBtn;

	@FindBy(xpath = ESPORTS_BTN_XPATH)
	WebElement esportsBtn;

	@FindBy(xpath = LIVE_BTN_XPATH)
	WebElement liveBtn;

	@FindBy(xpath = CASINO_BTN_XPATH)
	WebElement casinoBtn;

	@FindBy(xpath = LIVECASINO_BTN_XPATH)
	WebElement livecasinoBtn;

	@FindBy(xpath = EVOLUTIONLIVECASINO_BTN_XPATH)
	WebElement evolutionlivecasinoBtn;

	@FindBy(xpath = TVGAMES_BTN_XPATH)
	WebElement tvgamesBtn;

	@FindBy(xpath = TVBETGAMES_BTN_XPATH)
	WebElement luckytvgamesBtn;

	@FindBy(xpath = FASTGAMES_BTN_XPATH)
	WebElement fastgamesBtn;

	@FindBy(xpath = INBET_BTN_XPATH)
	WebElement inbetBtn;

	@FindBy(xpath = ROCKETON_BTN_XPATH)
	WebElement rocketonBtn;

	@FindBy(xpath = POKER_BTN_XPATH)
	WebElement pokerBtn;

	@FindBy(xpath = BELOTE_BTN_XPATH)
	WebElement beloteBtn;

	@FindBy(xpath = GAMES_BTN_XPATH)
	WebElement gamesBtn;

	@FindBy(xpath = KENO_BTN_XPATH)
	WebElement kenoBtn;

	@FindBy(xpath = GOLDKENO_BTN_XPATH)
	WebElement goldenkenoBtn;

	@FindBy(xpath = CRASH_BTN_XPATH)
	WebElement crashBtn;

	@FindBy(xpath = HILO_BTN_XPATH)
	WebElement hiloBtn;

	@FindBy(xpath = SICBO_BTN_XPATH)
	WebElement sicboBtn;

	public TotogamingSportHomePage clickOnSportsBtn() {
		waitForElementPresent(SPORTS_BTN_XPATH);
		sportsBtn.click();
		return new TotogamingSportHomePage(this.driver);

	}

	public TotogamingEsportsHomePage clickOnEsportsBtn() {
		waitForElementPresent(ESPORTS_BTN_XPATH);
		esportsBtn.click();
		return new  TotogamingEsportsHomePage(this.driver);

	}

	public TotogamingLiveHomePage clickOnLiveBtn() {
		waitForElementPresent(LIVE_BTN_XPATH);
		liveBtn.click();
		return new TotogamingLiveHomePage(this.driver);

	}

	public TotogamingCasinoHomePage clickOnCasinoBtn() {
		waitForElementPresent(CASINO_BTN_XPATH);
		casinoBtn.click();
		return new TotogamingCasinoHomePage(this.driver);
	}

	public void clickOnLiveCasinoBtn() {
		waitForElementPresent(LIVECASINO_BTN_XPATH);
		livecasinoBtn.click();
	}

	public TotogamingEvolutionLiveCasinoHomePage clickOnEvolutionLiveCasinoBtn() {
		waitForElementPresent(EVOLUTIONLIVECASINO_BTN_XPATH);
		evolutionlivecasinoBtn.click();
		return new TotogamingEvolutionLiveCasinoHomePage(this.driver);
	}

	public void clickOnTvGamesBtn() {
		waitForElementPresent(TVGAMES_BTN_XPATH);
		tvgamesBtn.click();
	}

	public TotogamingTvBetGamesHomePage clickOnTvBetGamesBtn() {
		waitForElementPresent(TVBETGAMES_BTN_XPATH);
		luckytvgamesBtn.click();
		return new TotogamingTvBetGamesHomePage(this.driver);
	}

	public void clickOnFastGamesBtn() {
		waitForElementPresent(FASTGAMES_BTN_XPATH);
		fastgamesBtn.click();
	}

	public TotogamingInBetGamesHomePage clickOnInbetBtn() {
		waitForElementPresent(INBET_BTN_XPATH);
		inbetBtn.click();
		return new TotogamingInBetGamesHomePage(this.driver);
	}

	public TotogamingRocketonHomePage clickOnRocketonBtn() {
		waitForElementPresent(ROCKETON_BTN_XPATH);
		rocketonBtn.click();
		return new TotogamingRocketonHomePage(this.driver);
	}

	public TotogamingPokerHomePage clickOnPokerBtn() {
		waitForElementPresent(POKER_BTN_XPATH);
		pokerBtn.click();
		return new TotogamingPokerHomePage(this.driver);
	}

	public TotogamingBeloteHomePage clickOnBeloteBtn() {
		waitForElementPresent(BELOTE_BTN_XPATH);
		beloteBtn.click();
		return new TotogamingBeloteHomePage(this.driver);
		
	}

	public TotogamingGamesHomePage clickOnGamesBtn() {
		waitForElementPresent(GAMES_BTN_XPATH);
		gamesBtn.click();
		return new TotogamingGamesHomePage(this.driver);

	}

	public void clickOnKenoBtn() {
		waitForElementPresent(KENO_BTN_XPATH);
		kenoBtn.click();
	}

	public TotogamingGoldenkenoHomePage clickOnGoldenKenoBtn() {
		waitForElementPresent(GOLDKENO_BTN_XPATH);
		goldenkenoBtn.click();
		return new TotogamingGoldenkenoHomePage(this.driver);
	}

	public TotogamingCrashHomePage clickOnCrashBtn() {
		waitForElementPresent(CRASH_BTN_XPATH);
		crashBtn.click();
		return new TotogamingCrashHomePage(this.driver);
	}

	public void clickOnHiloBtn() {
		waitForElementPresent(HILO_BTN_XPATH);
		hiloBtn.click();
	}

	public void clickOnSicboBtn() {
		waitForElementPresent(SICBO_BTN_XPATH);
		sicboBtn.click();

	}

	@FindBy(xpath = TOTO_LOGO_XPATH)
	WebElement totoLogo;

	@FindBy(xpath = TOTO_LOGO_HOME_PAGE_XPATH)
	WebElement totoMainLogo;

	
	public TotogamingMemberHomePage goBackToHome() {
		if (totoMainLogo.isDisplayed()) {
			return new TotogamingMemberHomePage(this.driver);
		}
		totoLogo.click();
		return new TotogamingMemberHomePage(this.driver);
	}
}