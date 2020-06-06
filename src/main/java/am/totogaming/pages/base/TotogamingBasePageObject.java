package am.totogaming.pages.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import am.totogaming.pages.home.TotogamingHomePage;

public class TotogamingBasePageObject {
	protected WebDriver driver;

	public TotogamingBasePageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public void waitForElementPresent(String xPath) {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));

	}

	public boolean verifyElementPresent(String xPath) {
		List<WebElement> element = driver.findElements(By.xpath(xPath));

		return !element.isEmpty();

	}
	

}
