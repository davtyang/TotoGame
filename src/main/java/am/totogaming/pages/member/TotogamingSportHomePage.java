package am.totogaming.pages.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TotogamingSportHomePage extends TotogamingMemberHomePage {

	public TotogamingSportHomePage(WebDriver driver) {
		super(driver);

	}

	public static final String SPORT_CONTAINER_XPATH = "//div[@id='sportLDRContainer']";
	public static final String SPORT_CALCULATOR_XPATH = "//a[@id='calcBtn']";
	public static final String SPORT_RESULT_XPATH = "//span[@class='tg--oe tg--pad-r-4'][contains(.,'Result')]";

	@FindBy(xpath = SPORT_CONTAINER_XPATH)
	WebElement sportsContainer;

	@FindBy(xpath = SPORT_CALCULATOR_XPATH)
	WebElement calculatorElement;
	
	@FindBy(xpath = SPORT_RESULT_XPATH)
	WebElement sportResult;

	public boolean verifySportsPageElementsDisplayed() {
		return sportsContainer.isDisplayed();
	}

	public void verifyCalculatorDisplayed() {
		Assert.assertTrue(calculatorElement.isDisplayed());	

	}

	public void verifyResultDisplayed() {
		Assert.assertTrue(sportResult.isDisplayed());
	}

}





