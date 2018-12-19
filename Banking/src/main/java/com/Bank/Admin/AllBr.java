package com.Bank.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllBr {

	public static void main(String[] args) {

		// DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		// capabilities.setCapability(CapabilityType.BROWSER_NAME,"IE");
		// capabilities.setCapability(CapabilityType.PLATFORM,"WINDOWs");
		// capabilities.setCapability(CapabilityType.VERSION,"11");
		// capabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		// capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
		// capabilities.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP,true);
		// capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
		// true);
		// capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		// capabilities.setCapability("allow-blocked-content", true);
		// capabilities.setCapability("allowBlockedContent", true);
		// WebDriverManager.iedriver().setup();
	/*	DesiredCapabilities d = DesiredCapabilities.internetExplorer();
		d.setCapability(InternetExplorerDriver.NATIVE_EVENTS,false);
		d.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		d.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);
		d.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		d.setCapability(CapabilityType.BROWSER_NAME,"internet explorer");
		d.setCapability(CapabilityType.PLATFORM,"XP");
		d.setCapability("allow-blocked-content", true);
		d.setCapability("allowBlockedContent", true);*/
		/*System.setProperty("webdriver.ie.driver","C:\\Users\\Raghu\\Downloads\\IEDriverServer_Win32_3.0.0\\IEDriverServer.exe");
		//WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
		driver.close();
*/
		// desired capabilities = Capabilities [{ensureCleanSession=true,
		// browserName=internet explorer, version=, platform=WINDOWS}];
		
		/*WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.close();*/

		WebDriverManager.iedriver().setup();
		WebDriver driver1 = new InternetExplorerDriver();
		driver1.get("http://google.com");
		driver1.close();

	}

}
