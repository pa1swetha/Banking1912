package com.Bank.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CREATENewRole {

	public static void main(String[] args) throws InterruptedException {
//CREATING A NEW ROLE USING DROPDOWN OPTION

		// Launch chrome using webdrivermanager
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// open URL using reference object-"DRIVER"
		driver.get("http://primusbank.qedgetech.com/");

		// Enter Login Details
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();

		// Create a new role for DROPDOWN using SELECT
		driver.findElement(By.name("btnRoles")).click();
		driver.findElement(By.name("txtRname")).sendKeys("CLERK");
		driver.findElement(By.name("txtRDesc")).sendKeys("@Primus Bank");
		Select RoleType = new Select(driver.findElement(By.name("lstRtypeN")));
		RoleType.selectByVisibleText("E");
		driver.findElement(By.name("btninsert")).click();

		Thread.sleep(4000);
		driver.close();

	}

}
