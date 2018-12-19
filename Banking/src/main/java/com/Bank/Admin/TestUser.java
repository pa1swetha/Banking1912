package com.Bank.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*WebDriverManager.iedriver().setup();
		 // Create the DesiredCapability object of InternetExplorer
		 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		 
		 // Settings to Accept the SSL Certificate in the Capability object
		// capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 capabilities.setCapability("ignoreProtectedModeSettings", true);
		 capabilities.setCapability("enableElementCacheCleanup", true);
		 capabilities.setCapability("requireWindowFocus", true);
		 capabilities.setCapability("ignoreProtectedModeSettings", true);
		 capabilities.setBrowserName("internet explorer");
		 capabilities.setCapability("ensureCleanSession", true);
		 
		WebDriver driver = new InternetExplorerDriver(capabilities);*/
		//driver.get("http:://google.com");
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Test");
		
		
		
		
		

	}

}
