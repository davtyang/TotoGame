package am.totogaming.pages.livechat.test;

import org.testng.annotations.Test;
import am.totogaming.base.test.TotogamingBaseTest;
import am.totogaming.pages.livechat.TotogamingLiveChatPage;



public class TotogamingLiveChatTest extends TotogamingBaseTest {

	@Test
	public void totoLiveChatTest() {
	TotogamingLiveChatPage live = new TotogamingLiveChatPage(driver);
	live.clickOnMessageBtn();
	live.clickOnLangRadioBtn();
	live.verifyLiveChatLogo();
	live.clickonBeginChatBtn();
	
		
		
		
	}

}
