package am.totogaming.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.totogaming.pages.base.TotogamingBasePageObject;
import am.totogaming.pages.member.TotogamingMemberHomePage;

public class TotogamingLoginPage extends TotogamingBasePageObject {

	public TotogamingLoginPage(WebDriver driver) {
		super(driver);
	}

	public static final String USERNAME_INPUT_XPATH="//input[@automation='email_input']";
	@FindBy(xpath = USERNAME_INPUT_XPATH)
	WebElement usernameInput;
	
	
	public static final String PASSWORD_INPUT_XPATH="//input[@automation='password_input']";
	@FindBy(xpath = PASSWORD_INPUT_XPATH)
	WebElement passwordInput;
	
	
	public static final String LOGIN_BTN_XPATH="//button[@automation='login_button']";
	@FindBy(xpath = LOGIN_BTN_XPATH)
	WebElement loginBtn;
	
	
	public void fillUsername(String username) {
		waitForElementPresent(USERNAME_INPUT_XPATH);
		usernameInput.sendKeys(username);
	}
	
	public void fillPassword(String pass) {
		waitForElementPresent(PASSWORD_INPUT_XPATH);
		passwordInput.sendKeys(pass);
	}
	
	public void clickOnLoginBtn() {
		waitForElementPresent(LOGIN_BTN_XPATH);
		loginBtn.click();
	}
	
	public TotogamingBasePageObject doLogin(String username, String password) {
		fillUsername(username);
		fillPassword(password);
		loginBtn.click();
		
		if(verifyElementPresent(LOGIN_BTN_XPATH)) {
			return new TotogamingLoginPage(driver);
		}
		
		return new TotogamingMemberHomePage(driver);
	}
	//login password fild-ern en u loign button@
}
