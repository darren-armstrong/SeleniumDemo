package automationFramework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.junit.Test;

public class FirstTestCase {
	@Test
	public void LaunchChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\darmstrong\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.quit();
	}	
	
	@Test
	public void EnterNameInToolsQAForm() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\darmstrong\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement firstNameField = driver.findElement(By.name("firstname"));
		WebElement lastNameField = driver.findElement(By.name("lastname"));
		firstNameField.sendKeys("Darren");
		lastNameField.sendKeys("Armstrong");
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void ChooseGenderInToolsQAForm() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\darmstrong\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(0).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void InsertPhotoInToolsQAForm() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\darmstrong\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement fileInput = driver.findElement(By.name("photo"));
		fileInput.sendKeys("C:\\Users\\darmstrong\\Pictures\\me.jpg");
		Thread.sleep(5000);
		driver.quit();
	}

}
