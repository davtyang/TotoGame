package am.totogaming.register.test;

import org.testng.annotations.Test;

import am.totogaming.base.test.TotogamingBaseTest;
import am.totogaming.pages.home.TotogamingHomePage;
import am.totogaming.pages.register.TotogamingRegisterPage;

public class TotogamingRegisterPageTest extends TotogamingBaseTest {
	@Test
	public void regFunctionalityTest() {
		TotogamingHomePage home = new TotogamingHomePage(driver);
		TotogamingRegisterPage registration = home.clickOnRegisterButton();
		
		registration.fillFirstname("fgdsgasgd");
		registration.fillLastname("iuougouygoyug");
		
		
		
		
		

	}
}