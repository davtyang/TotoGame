package am.totogaming.pages.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.totogaming.pages.base.TotogamingBasePageObject;

public class TotogamingRegisterPage extends TotogamingBasePageObject {

	public TotogamingRegisterPage(WebDriver driver) {
		super(driver);
	}

	public final String FIRSTNAME_INPUT = "//div[@class='col_1']//input[@automation='firstname_input']";
	@FindBy(xpath = FIRSTNAME_INPUT)
	WebElement firstnameInputField;

	public TotogamingRegisterPage fillFirstname(String Firstname) {
		waitForElementPresent(FIRSTNAME_INPUT);
		firstnameInputField.sendKeys(Firstname);
		return new TotogamingRegisterPage(driver);
	}

	public final String LASTNAME_INPUT = "//div[@class='col_1']//input[@automation='lastname_input']";
	@FindBy(xpath = LASTNAME_INPUT)
	WebElement lastnameInputField;

	public TotogamingRegisterPage fillLastname(String Lastname) {
		waitForElementPresent(LASTNAME_INPUT);
		lastnameInputField.sendKeys(Lastname);
		return new TotogamingRegisterPage(driver);
	}

}
