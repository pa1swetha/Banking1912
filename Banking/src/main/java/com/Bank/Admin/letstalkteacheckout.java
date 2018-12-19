package com.Bank.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class letstalkteacheckout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://www.practiceselenium.com/let-s-talk-tea.html");
		driver.findElement(By.linkText("Check Out")).click();
		driver.findElement(By.id("email")).sendKeys("abc.xyz@gmail.com");
		driver.findElement(By.id("name")).sendKeys("abc");
		driver.findElement(By.id("address")).sendKeys("1400,schaumburg");
		driver.findElement(By.id("card_number")).sendKeys("9000 000 000");
		driver.findElement(By.id("cardholder_name")).sendKeys("chandini");
		driver.findElement(By.id("verification_code")).sendKeys("4444");
		driver.findElement(By.linkText("Cancel")).click();
		driver.findElement(By.linkText("Place Order")).click();
		driver.close();
		
	}
}


