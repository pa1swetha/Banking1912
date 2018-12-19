package com.Bank.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Banking.Banking.ArthmaticOprations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CREATENewUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch chrome using webdrivermanager
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();

				ArthmaticOprations.SumOfThree();
				// open URL using reference object-"DRIVER"
				driver.get("http://primusbank.qedgetech.com/");

				// Enter Login Details
				driver.findElement(By.name("txtuId")).sendKeys("Admin");
				driver.findElement(By.name("txtPword")).sendKeys("Admin");
				driver.findElement(By.name("login")).click();
				driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[6]/td/a/img")).click();
				
				//Create a NewUser
				driver.findElement(By.name("Btnuser")).click();
				Select Role = new Select(driver.findElement(By.name("lst_Roles")));
				Role.selectByVisibleText("icustomer");
				Select Branch = new Select(driver.findElement(By.name("lst_Branch")));
				Branch.selectByVisibleText("SAIRAM");
				driver.findElement(By.name("Lbc_name")).sendKeys("INDIA");
				driver.findElement(By.name("txtUname")).sendKeys("ABCD");
				driver.findElement(By.name("txtLpwd")).sendKeys("123456");
				driver.findElement(By.name("txtTpwd")).sendKeys("123456");
				driver.findElement(By.name("BtnSubmit")).click();


	}

}
