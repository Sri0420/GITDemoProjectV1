package SettleKingProject.SettleKingProject;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestHM {
	
	static HashMap<String, String> logindata(){
		HashMap <String,String>hm = new HashMap<String,String>();
		hm.put("x","Sridevi106@yopmail.com&Sridevi@123");
		hm.put("y","Sridevi107@yopmail.com&Sridevi@123");
		hm.put("Z","Sridevi108@yopmail.com&Sridevi@123");
		return hm;
	}

	public static void main(String[] args) {
		  WebDriver driver;
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("https://dev.settleking.com/auth/login");
		  driver.manage().window().maximize();
		  String credentials =logindata().get("x");
		  String arr[]=credentials.split("&");
		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(arr[0]);
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(arr[1]);
		  driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		  
      
	}

}
