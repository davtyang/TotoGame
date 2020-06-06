package am.totogaming.base.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TotogamingBaseTest {
	protected WebDriver driver;
	protected String correctUsername = "";
	protected String correctPassword = "";
	public static final String URL="https://www.totogaming.am/en";

	@BeforeTest
	public void prepareEnv() throws IOException {
		// read from properties files

		Properties prop;
		prop = readPropertiesFile("src/test/resources/browser.properties");
		String browserType = prop.getProperty("type");
		String driverPath = prop.getProperty("path");
		System.setProperty(browserType, driverPath);
		openBrowser(browserType);

		System.out.println(driverPath);
		prop = readPropertiesFile("C:\\Users\\Admin\\cred.properties");
		correctUsername = prop.getProperty("username");
		correctPassword = prop.getProperty("password");

	}

	public Properties readPropertiesFile(String fileName) throws IOException {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream(fileName);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			fis.close();
		}
		return prop;
	}

	public void openBrowser(String browserType) {
		switch (browserType) {
		case "webdriver.chrome.driver":
			driver = new ChromeDriver();
			break;
		case "webdriver.gecko.driver":
			driver = new FirefoxDriver();
			break;
		default:
			driver = new InternetExplorerDriver();
		}

		driver.get(URL);
		driver.manage().window().maximize();

	}

	@AfterTest
	public void cleanup() {
		driver.quit();
	}

}