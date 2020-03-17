package am.toto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassTotoTest {

	// Test Case Id : 2.0
	@Test
	public void myClassTotoTest() throws InterruptedException {
		// 2.1 open the browser
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// 2.2 navigate to totogaming.am
		driver.get("https://www.totogaming.am");
		driver.findElement(By.xpath("//div[@id='header_fix']//a[@class='flex dropdown-menu']")).click();
		driver.findElement(By.xpath("//div[@id='header_fix']//a[@class='flex en']/span[@class='txt']")).click();
		driver.manage().window().maximize();
		// 2.3 click register
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class=\"registerDialog tl_register_button primBtn transBg\"]")).click();
		Thread.sleep(2000);
		// 2.4 Write in field firstname
		driver.findElement(By.xpath("//div[@class='col_1']//input[@automation='firstname_input']")).sendKeys("John");
		// 2.5 write in field lastname
		driver.findElement(By.xpath("//div[@class='col_1']//input[@automation='lastname_input']"))
				.sendKeys("Malkovich");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@automation='birthdate_input']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@data-handler='selectYear']/option[@value='1991']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@data-handler='selectMonth']/option[@value='4']")).click();
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='17']")).click();
		driver.findElement(By.xpath("//*[@id='custom_CountryCode']")).click();
		Thread.sleep(2000);
		// new WebDriverWait(driver,
		// 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='tl_sel_custom_popup_reg']//li[@rel='1377']")));
		driver.findElement(By.xpath("//ul[@data-id='CountryCode']//li[@rel='1377']")).click();
		String expected = "Nagorno-Karabakh (Artsakh)";
		Thread.sleep(5000);
		String actual = driver.findElement(By.xpath("//div[@id='custom_CountryCode']")).getText();
		Assert.assertEquals(actual, expected);
		driver.findElement(By.xpath("//*[@id='continue_btn']")).click();
		String expectedcontinueButton = "NEXT";
		Thread.sleep(5000);
		String actualcontinueButton = driver.findElement(By.xpath("//*[@id='continue_btn']")).getText();
		Assert.assertEquals(actualcontinueButton, expectedcontinueButton);
		driver.quit();
	}

	@Test
	public void myClassTotoTestTwo() throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// navigate to totogaming.am
		driver.get("https://www.totogaming.am");
		// Click button sport
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("//div[contains(@class, 'header')]//a[contains(@href, 'sport.totogaming.am/SportsBook/Home')]"))
				.click();
		// Click logo to back on homepage
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='main_logo']")).click();
		driver.quit();
	}

	@Test
	public void myClassTotoTestThree() throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// navigate to totogaming.am
		driver.get("https://www.totogaming.am");
		driver.manage().window().maximize();
		// enter dropdown menu
		driver.findElement(By.xpath("//div[@id='header_fix']//a[@class='flex dropdown-menu']")).click();
		// change language to english
		driver.findElement(By.xpath("//div[@id='header_fix']//a[@class='flex en']/span[@class='txt']")).click();
		String expected = "EN";
		Thread.sleep(4000);
		String actual = driver.findElement(By.xpath("//div[@id='header_fix']//a[@class='flex dropdown-menu']/span[@class='noshr langTxt']")).getText();
		Assert.assertEquals(actual, expected);
		//System.out.println("Expected " +expected + " returned " +actual);
		driver.quit();

	}

	@Test
	public void myClassTotoTestFour() throws InterruptedException {
		// Negative test with username and password parametres
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// navigate to totogaming.am
		driver.get("https://www.totogaming.am");
		driver.findElement(By.xpath("//i[@class='tf_arrow_icon dropdownColor']")).click();
		// change language to english
		driver.findElement(By.xpath("//a[@class='flex en']/span[@class='txt']")).click();
		// enter button log in
		driver.findElement(By.xpath("//a[@class='loginDialog tl_login_button ternBtn transBg']")).click();
		// enter username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@automation='email_input']")).sendKeys("Jamshudka");
		// enter password
		driver.findElement(By.xpath("//div/input[@automation='password_input']")).sendKeys("Nachalnikamana");
		// enter log in
		driver.findElement(By.xpath("//div/button[@automation='login_button']")).click();
		String expected = "Wrong login parameters";
		Thread.sleep(3000);
		String actual = driver.findElement(By.xpath("//span[@class='field-validation-error']")).getText();
		Assert.assertEquals(actual, expected);
		driver.quit();
	}

	@Test
	public void myClassTotoTestFive() throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// navigate to totogaming.am
		driver.get("https://www.totogaming.am");
		// Click button "Live"
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//div[contains(@class, 'header')]//a[contains(@href, 'sport.totogaming.am/SportsBook/EventView')]"))
				.click();
		// In "Live" functional area,click button Calendar
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//div[@class='sportSubheadMenu tg--flex tg--align-center tg--pad-10 tg-flex-grow']/a[@onclick='return OpenPageWithTrack(10, \"Calendar\");']"))
				.click();
		// click button home
		driver.findElement(By.xpath(
				"//div[@class='sportSubheadMenu tg--flex tg--align-center tg--pad-10 tg-flex-grow']/a[@onclick='return OpenPageWithTrack(0, \"Home\");']"))
				.click();
	}
		
		@Test
		public void  myClassTotoTestSix() {
			// System.setProperty("webdriver.chrome.driver",
			// "C:\\Windows\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			// navigate to totogaming.am
			driver.get("https://www.totogaming.am");
			
			
			

	}
}
