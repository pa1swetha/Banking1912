package com.Bank.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class emailletstalktea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver  driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://www.practiceselenium.com/let-s-talk-tea.html");
		driver.findElement(By.name("name")).sendKeys("chandini");
		driver.findElement(By.name("email")).sendKeys("abcdefg");
		driver.findElement(By.name("subject")).sendKeys("hello");
		driver.findElement(By.name("message")).sendKeys("your taste of tea is very nice");
		driver.findElement(By.name("Submit")).submit();
		driver.close();

	}

}
