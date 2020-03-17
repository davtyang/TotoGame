package am.totogaming.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.totogaming.pages.base.TotogamingBasePageObject;
import am.totogaming.pages.register.TotogamingRegisterPage;

public class TotogamingHomePage extends TotogamingBasePageObject {
	public TotogamingHomePage(WebDriver driver) {
		super(driver);
	}

	public final String REGISTER_BUTTON = "//a[@class='registerDialog tl_register_button primBtn transBg']";
	@FindBy(xpath = REGISTER_BUTTON)
	WebElement button;

	public TotogamingRegisterPage clickOnbutton() {
		button.click();
		return new TotogamingRegisterPage(driver);

	}

}
