package com.Bank.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class primusbank_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com");
		//login page details
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		//giving  xpath to click on Branches to button
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		
		String country_name = "USA" ;
		String state_name = "Andhra Pradesh";
		String city_name  = "Hyderabad";
		
	    Select country = new Select(driver.findElement(By.name("lst_countryS")));
		country.selectByVisibleText(country_name);
		Select state  =  new Select(driver.findElement(By.name("lst_stateS")));
		state.deselectByVisibleText(state_name);
		Select city = new Select(driver.findElement(By.name("lst_cityS")));
		city.selectByVisibleText(city_name);
		driver.findElement(By.name("btn_clsearch")).click();
		

	}

}
