package am.totogaming.pages.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TotogamingEvolutionLiveCasinoHomePage extends TotogamingMemberHomePage {

	public TotogamingEvolutionLiveCasinoHomePage(WebDriver driver) {
		super(driver);

	}

	public static final String EVOLUTION_LIVE_CASINO_HEADER_XPATH = "//div[@class='block-menu desktop--1OSQB Menu--aVsil']";

	@FindBy(xpath = EVOLUTION_LIVE_CASINO_HEADER_XPATH)
	WebElement evolutionLiveCasinoHeader;

	public void verifyEvolutionLiveCasinoHeader() {
		Assert.assertTrue(evolutionLiveCasinoHeader.isDisplayed());
	}
}