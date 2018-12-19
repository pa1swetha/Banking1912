package com.Bank.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SeleniumHelper {

	public void ListBoxItemTextSelection(WebElement listBox, String itemText) {
		try {
			Select list = new Select(listBox);
			list.selectByVisibleText(itemText);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void testNGAssertion(WebDriver driver, String expTitle, String message) {
		try {
			String actTitle = driver.getTitle();
			boolean status = expTitle.equals(actTitle);
			Assert.assertTrue(status, message);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
