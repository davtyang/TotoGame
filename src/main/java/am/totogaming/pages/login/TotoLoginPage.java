package am.totogaming.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.totogaming.pages.base.TotogamingBasePageObject;

public class TotoLoginPage extends TotogamingBasePageObject {

	public TotoLoginPage(WebDriver driver) {
		super(driver);
	}
		public final String LOGIN_BTN = "//a[@automation='home_login_button']";
		@FindBy(xpath = LOGIN_BTN )
		WebElement loginBTNclick;
		
	public TotoLoginPage clickonLGNbutton() { 
		loginBTNclick.click();
		return new TotoLoginPage(driver);
		
	}
}
