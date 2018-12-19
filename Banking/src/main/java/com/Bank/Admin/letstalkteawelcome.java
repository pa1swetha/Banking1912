package com.Bank.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class letstalkteawelcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.practiceselenium.com/let-s-talk-tea.html");
		driver.findElement(By.linkText("Welcome")).click();
		driver.findElement(By.linkText("See Collection")).click();
		driver.findElement(By.linkText("See Collection")).click();
		driver.findElement(By.linkText("See Collection")).click();
		driver.close();
		

	}

}
