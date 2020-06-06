package am.totogaming.pages.livechat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import am.totogaming.pages.member.TotogamingMemberHomePage;

public class TotogamingLiveChatPage extends TotogamingMemberHomePage {

	public TotogamingLiveChatPage(WebDriver driver) {
		super(driver);
	}

	public static final String TOTO_LIVE_CHAT_XPATH = "//button[@aria-label='Open LiveChat chat widget']";
	public static final String TOTO_LIVE_CHAT_LANGUAGE_XPATH = "//label[contains(.,'English')]";
	public static final String TOTO_LIVE_CHAT_LOGO_XPATH = "//div[@class='lc-1obp8sm e1q4zsg90']";
	public static final String TOTO_LIVE_CHAT_BEGIN = "//div[@class='lc-ckdrdo esv0owm2']";
	
	@FindBy(xpath = TOTO_LIVE_CHAT_XPATH)
	WebElement totoLiveChat;

	@FindBy(xpath = TOTO_LIVE_CHAT_LANGUAGE_XPATH)
	WebElement totoLiveChatLanguage;
	
	@FindBy(xpath = TOTO_LIVE_CHAT_LOGO_XPATH)
	WebElement totoLiveChatLogo;
	
	@FindBy(xpath = TOTO_LIVE_CHAT_BEGIN)
	WebElement totoLiveChatBegin;

	public TotogamingLiveChatPage clickOnMessageBtn() {
		waitForElementPresent(TOTO_LIVE_CHAT_XPATH);
		totoLiveChat.click();
		return new TotogamingLiveChatPage(this.driver);
	}

	public TotogamingLiveChatPage clickOnLangRadioBtn() {
		waitForElementPresent(TOTO_LIVE_CHAT_LANGUAGE_XPATH);
		totoLiveChatLanguage.click();
		return new TotogamingLiveChatPage(this.driver);
	}
		
	public TotogamingLiveChatPage clickonBeginChatBtn() {
		waitForElementPresent(TOTO_LIVE_CHAT_BEGIN);
		totoLiveChatBegin.click();
		return new TotogamingLiveChatPage(this.driver);
	}
		
		
		public void verifyLiveChatLogo() {
		Assert.assertTrue(totoLiveChatLogo.isDisplayed());
		
	}
}
