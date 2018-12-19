package com.Bank.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//To Select Items from DropDown use below package
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterUser {

	public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      WebDriver driver =  new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("http://newtours.demoaut.com/");
      
      driver.findElement(By.linkText("REGISTER")).click();
       Select country = new Select(driver.findElement(By.name("country")));
       country.selectByVisibleText("INDIA");
       
      
       try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      driver.findElement(By.name("email")).sendKeys("meghana");
      driver.findElement(By.name("password")).sendKeys("1234567");
      driver.findElement(By.name("confirmPassword")).sendKeys("1234567");
      
      
      driver.findElement(By.name("register")).click();
      
      
      driver.close();
  
      
	}

}
