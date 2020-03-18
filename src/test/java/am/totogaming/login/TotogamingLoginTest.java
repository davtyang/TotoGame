package am.totogaming.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.totogaming.base.TotogamingBaseTest;
import am.totogaming.pages.home.TotogamingHomePage;
import am.totogaming.pages.login.TotogamingLoginPage;
import am.totogaming.pages.member.TotogamingMemberHomePage;

public class TotogamingLoginTest extends TotogamingBaseTest{

	
	@Test
	public void loginWithIncorrectCreds() {

		//scenario:
		//given totogamin home page is open
		//when filling login details with incorrect username and password
		//then error message is displayed
		
		TotogamingHomePage home = new TotogamingHomePage(driver);
		TotogamingLoginPage login =  home.clickonLGNbutton();
		login = (TotogamingLoginPage) login.doLogin("username", "password");
		Assert.assertTrue(login.verifyElementPresent(TotogamingLoginPage.LOGIN_BTN_XPATH));
		//assert vor login page-n a der bacvac mnacel, error message ka
	}
	
	@Test
	public void loginWithCorrectCreds() {

		//scenario:
		//given totogamin home page is open
		//when filling login details with correct username and password
		//then member home page is displayed
		
		TotogamingHomePage home = new TotogamingHomePage(driver);
		TotogamingLoginPage login =  home.clickonLGNbutton();
		TotogamingMemberHomePage member = (TotogamingMemberHomePage) login.doLogin(correctUsername, correctPassword);
		
		//assert vor member page-ic inch vor elementner en erevum - -vor guest home page-um chkar
	}
}
