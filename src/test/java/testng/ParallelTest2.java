package testng;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest2 {
	WebDriver driver;
	
	@Test
	void LoginTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dev.settleking.com/auth/login");
		WebElement username =driver.findElement(By.xpath("//input[@name='email']"));
		Thread.sleep(2000);
		username.sendKeys("Sridevi106@yopmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		Thread.sleep(2000);
		password.sendKeys("Sridevi@123");
		WebElement LoginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		LoginButton.click();
		
		Assert.assertEquals(driver.getTitle(), "SettleKing- Smart way To Splitting Money With Friends");
		Thread.sleep(5000);
		
		
	}
	
	void tearDown() {
		driver.quit();
	}
	

}
