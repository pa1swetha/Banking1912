package com.Bank.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CLEARBRANCH {

	public static void main(String[] args) throws InterruptedException {
		// Launch the application in Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Open the URL Using Reference Object-"driver"
		driver.get("http://primusbank.qedgetech.com/");

		// To maximize the window
		driver.manage().window().maximize();

		// Enter Login Details
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();

		// Select Country, State & City from Dropdown
		Select Country = new Select(driver.findElement(By.name("lst_countryS")));
		Country.selectByVisibleText("INDIA");
		Select State = new Select(driver.findElement(By.name("lst_stateS")));
		State.selectByVisibleText("GOA");
		Select City = new Select(driver.findElement(By.name("lst_cityS")));
		City.selectByVisibleText("GOA");

		driver.findElement(By.name("btn_clsearch")).click();

		// Use Thread to wait milliseconds before closing the application
		Thread.sleep(5000);

		// Close the URL
		driver.close();

	}

}
