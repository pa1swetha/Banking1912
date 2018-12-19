package com.Bank.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetsTalkSend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.practiceselenium.com/let-s-talk-tea.html");
		String exp_HomePageTitle = "Let's Talk Tea";
		String act_HomePageTitle = driver.getTitle();
		boolean status = exp_HomePageTitle.equals(act_HomePageTitle);
		Assert.assertTrue(status, "Let's talk tea Navigation");
	
		driver.findElement(By.name("name")).sendKeys("HelloChai");
        driver.close();
	}

}
