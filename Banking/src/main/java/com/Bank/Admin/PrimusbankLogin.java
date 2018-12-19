package com.Bank.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrimusbankLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	      WebDriver driver =  new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("http://primusbank.qedgetech.com/");
	      driver.findElement(By.id("txtuId")).sendKeys("Admin");
	      driver.findElement(By.name("txtPword")).sendKeys("Admin");
	      driver.findElement(By.id("login")).click();
	      Thread.sleep(3000);
	      
	      driver.close();

	}

}
