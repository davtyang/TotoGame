package am.totogaming.pages.members.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import am.totogaming.base.test.TotogamingBaseTest;
import am.totogaming.pages.member.TotogamingBeloteHomePage;
import am.totogaming.pages.member.TotogamingCasinoHomePage;
import am.totogaming.pages.member.TotogamingCrashHomePage;
import am.totogaming.pages.member.TotogamingEsportsHomePage;
import am.totogaming.pages.member.TotogamingEvolutionLiveCasinoHomePage;
import am.totogaming.pages.member.TotogamingGamesHomePage;
import am.totogaming.pages.member.TotogamingGoldenkenoHomePage;
import am.totogaming.pages.member.TotogamingInBetGamesHomePage;
import am.totogaming.pages.member.TotogamingLiveCasinoHomePage;
import am.totogaming.pages.member.TotogamingLiveHomePage;
import am.totogaming.pages.member.TotogamingMemberHomePage;
import am.totogaming.pages.member.TotogamingPokerHomePage;
import am.totogaming.pages.member.TotogamingRocketonHomePage;
import am.totogaming.pages.member.TotogamingSportHomePage;
import am.totogaming.pages.member.TotogamingTvBetGamesHomePage;

public class TotogamingMembersTest extends TotogamingBaseTest {

	

	@Test
	public void totoNavMenuSportsTest() {

		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		TotogamingSportHomePage sport = member.clickOnSportsBtn();
		Assert.assertTrue(sport.verifySportsPageElementsDisplayed());
		sport.verifyCalculatorDisplayed();
		sport.verifyResultDisplayed();

	}

	@Test
	public void totoNavMenuEsportsTest() {

		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		TotogamingEsportsHomePage esport = member.clickOnEsportsBtn();
		esport.verifyBetHistoryDisplayed();
		esport.verifyMainHeaderDisplayed();
	}

	@Test
	public void totoNavMenuLiveTest() {
		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		TotogamingLiveHomePage live = member.clickOnLiveBtn();
		live.verifyLiveInfoDisplayed();
		live.verifyEventCountDisplayed();

	}

	@Test
	public void totoNavMenuCasinoTest() {
		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		TotogamingCasinoHomePage casino = member.clickOnCasinoBtn();
		casino.verifyCasinoGameMenu();
		casino.verifyCasinoGameSearch();

	}

	@Test
	public void totoNavMenuLiveCasinoTest() {
		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		member.clickOnLiveCasinoBtn();

	}

	@Test
	public void totoNavMenuEvolutionLiveCasinoTest() {
		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		TotogamingEvolutionLiveCasinoHomePage evolution = member.clickOnEvolutionLiveCasinoBtn();
		evolution.verifyEvolutionLiveCasinoHeader();

	}

	@Test
	public void totNavMenuTvGamesTest() {
		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		member.clickOnTvGamesBtn();

	}

	@Test
	public void totoNavMenuTvBetGamesTest() {
		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		TotogamingTvBetGamesHomePage tvbet = member.clickOnTvBetGamesBtn();
		tvbet.verifyTvBetHeaderMenuDisplayed();
		tvbet.verifyTvBetHeaderLinksDisplayed();

	}

	@Test
	public void totoNavMenuFastGamesTest() {
		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		member.clickOnFastGamesBtn();

	}

	@Test
	public void totoNavMenuInbetTest() {
		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		TotogamingInBetGamesHomePage inbet = member.clickOnInbetBtn();
		inbet.verifyInbetHeaderTitleDisplayed();
		inbet.verifyInbetHeaderBarDisplayed();

	}

	@Test
	public void totoNavMenuRocketonTest() {
		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		TotogamingRocketonHomePage rocketon = member.clickOnRocketonBtn();
		rocketon.verifyRocketonDesktopGametypeDisplayed();
		rocketon.verifyRocketonDesktopGametypeDisplayed();

	}

	@Test
	public void totoNavMenuPokerTest() {
		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		TotogamingPokerHomePage poker = member.clickOnPokerBtn();
		poker.verifyPokerTitleFeaturesDisplayed();
		poker.verifyPokerTitlePromotionsDisplayed();
	}

	@Test
	public void totoNavMenuBeloteTest() {
		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		TotogamingBeloteHomePage belote = member.clickOnBeloteBtn();
		belote.verifyBeloteHeaderDisplayed();
		belote.verifyBeloteInfoJackpotDisplayed();

	}

	@Test
	public void totoNavMenuGamesTest() {
		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		TotogamingGamesHomePage games = member.clickOnGamesBtn();
		games.verifyGamesMainContainerDisplayed();
		games.verifyGamesPanelDisplayed();

	}

	@Test
	public void totoNavMenuKenoTest() {
		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		member.clickOnKenoBtn();

	}

	@Test
	public void totoNavMenuGoldenkenoTest() {
		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		TotogamingGoldenkenoHomePage goldenkeno = member.clickOnGoldenKenoBtn();
		goldenkeno.verifyGoldenkenoContainerGamesDisplayed();
		goldenkeno.verifyGoldenkenoHeaderGamesDisplayed();
	}

	@Test
	public void totoNavMenuCrashTest() {
		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		TotogamingCrashHomePage crash = member.clickOnCrashBtn();
		crash.verifyCrashTopPlayerHeader();

	}

	@Test
	public void totoNavMenuHiloTest() {
		
	}
	
	
	
	//	member.clickOnHiloBtn();
	//	member.clickOnSicboBtn();

	

	@BeforeMethod
	public void goBackToMemberHomePage() {
		TotogamingMemberHomePage member = new TotogamingMemberHomePage(driver);
		member = member.goBackToHome();
	}

}