package com.Bank.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFaceBook2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String ExpPageTitle = "Facebook – log in or sign up1";
		
		String ActPageTitle =  driver.getTitle();
		
		 boolean status =  ExpPageTitle.equals(ActPageTitle);
		 
		 if (status==true) {
			System.out.println("Facebook Page Navigation is Successfull");
		} else {
           System.out.println("Facebook Page Navigation is Failed");
		}
		 
		 //Assert.assertTrue(status, "FaceBook Navigation");

		 
		 
		 
		 driver.close();
	}

}
