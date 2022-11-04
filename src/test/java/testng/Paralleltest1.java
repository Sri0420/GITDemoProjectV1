package testng;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paralleltest1 {
	WebDriver driver;
	
	@Test
	void logoTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dev.settleking.com/auth/login");
		WebElement logo =driver.findElement(By.tagName("img"));
		Assert.assertTrue(logo.isDisplayed());
		Thread.sleep(5000);
		driver.close();
	}
	@Test
	void homePageTitle() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dev.settleking.com/auth/login");
		Assert.assertEquals(driver.getTitle(), "SettleKing- Smart way To Splitting Money With Friends");
		Thread.sleep(5000);
	}
	@AfterTest
	void tearDown() {
		driver.quit();
	}
	

}
