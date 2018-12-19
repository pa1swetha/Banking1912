package com.Bank.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Banking.Banking.ArthmaticOprations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Createbrnach {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		ArthmaticOprations ao = new ArthmaticOprations();
		Createbrnach cb = new Createbrnach();
		ao.SumOfTwoValues();
		
		
	    //open url  
		driver.get("http://primusbank.qedgetech.com/");
		//Validation

		driver. manage().window().maximize();
		//enter login
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		// click submit
		driver.findElement(By.id("login")).click();
	
		Thread.sleep(3000);
		//Validation
		
		//click branch
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a")).click();
		//validation
		
		Thread.sleep(4000);
		String BranchName = "Madhapur1";
		String BranchAddress = "Ttest123";
		String zipcode = "63214";
		String country_name = "USA" ;
		String state_name = "Andhra Pradesh";
		String city_name  = "Hyderabad";
		
		
		//create new branch
		driver.findElement(By.id("BtnNewBR")).click();
		//validation
		driver.findElement(By.id("txtbName")).sendKeys(BranchName);
		driver.findElement(By.id("txtAdd1")).sendKeys(BranchAddress);
		
		driver.findElement(By.id("txtZip")).sendKeys(zipcode);
		
		WebElement countryList = driver.findElement(By.name("lst_counrtyU"));
	    cb.ListBoxItemTextSelection(countryList, "INDIA");
		 
		WebElement stateList = driver.findElement(By.name("lst_stateI"));
         cb.ListBoxItemTextSelection(stateList, "Andhra Pradesh");
         
		WebElement cityList = driver.findElement(By.name("lst_cityI"));
	    cb.ListBoxItemTextSelection(cityList, "Hyderabad");
		
		//click submit
		driver.findElement(By.id("btn_insert")).click();
		//validation
		
	}
	
	public void ListBoxItemTextSelection(WebElement listBox , String itemText) {
		Select country = new Select(listBox);
		country.selectByVisibleText(itemText);
	}
	
}
